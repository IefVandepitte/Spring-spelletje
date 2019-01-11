/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;



/**
 *
 * @author ief
 */
public class NumberCommand {
    @NotNull
    @Min(value = 1)
    @Max(value = 7)
    private Integer number;

    /**
     * Get the value of number
     *
     * @return the value of number
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Set the value of number
     *
     * @param Number new value of number
     */
    public void setNumber(Integer Number) {
        this.number = Number;
    }

}
