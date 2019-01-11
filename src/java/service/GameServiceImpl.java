/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import domain.Game;

/**
 *
 * @author ief
 */
public class GameServiceImpl implements GameService{

    private Game game;

    public GameServiceImpl() {
        this.game = new Game();
    }
    
    @Override
    public Game getGame() {
        return game;
    }

    @Override
    public void setNumber(Integer number) {
        game.setNumber(number);
    }

    @Override
    public void startGame() {
        game.startGame();
    }

    @Override
    public String[] getMijnenveld() {
        return game.getShowValue();
    }
    
}
