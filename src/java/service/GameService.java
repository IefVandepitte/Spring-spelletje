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
public interface GameService {
    
    public Game getGame();

    public void setNumber(Integer number);

    public void startGame();

    public Object getMijnenveld();
}
