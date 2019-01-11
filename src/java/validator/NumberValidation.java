/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validator;

import controller.NumberCommand;
import domain.Game;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author ief
 */
public class NumberValidation implements Validator {

    @Override
    public boolean supports(Class<?> klasse) {
        return NumberCommand.class.isAssignableFrom(klasse);
    }

    @Override
    public void validate(Object object, Errors errors) {
//        NumberCommand numberCommand = (NumberCommand) object;
//        if (numberCommand.getNumber() == null) {
//            
//            errors.rejectValue("number", "", "nummer is leeg");
//        }
        
    }
    
}
