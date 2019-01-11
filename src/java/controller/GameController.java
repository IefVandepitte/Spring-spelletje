/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.Game;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.GameService;
import validator.NumberValidation;

/**
 *
 * @author ief
 */
@Controller
@RequestMapping(value = "/spring_spel/")

public class GameController {
    
   @Autowired
   private GameService gameService;
    
    @RequestMapping(value = "game", method = RequestMethod.GET)
    public String startGame(Model model){
        model.addAttribute("numberCommand", new NumberCommand());
        return "rondenForm";
    }
    
     @Autowired
    private NumberValidation numberValidator;
     
    @RequestMapping(value = "game", method = RequestMethod.POST)
    public String onSubmit(@Valid NumberCommand numberCommand, BindingResult result, Model model){
        
        numberValidator.validate(numberCommand, result);
        
        if (result.hasErrors()) {            
            return "rondenForm";
        }
        else {            
            gameService.setNumber(numberCommand.getNumber());
            gameService.startGame();
            model.addAttribute("links", gameService.getMijnenveld());
            return "spel";
        }
    }
    
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public String ronde( @PathVariable("id") Integer id, Model model){
        Integer gok = id-1;
        gameService.getGame().play(gok);
        
        if (gameService.getGame().isWin()) {
            model.addAttribute("win", true);
        } else if(gameService.getGame().isLost()){
            model.addAttribute("loose", true);
        }
        model.addAttribute("links", gameService.getGame().getShowValue());
        return "spel";
    }
    
}
