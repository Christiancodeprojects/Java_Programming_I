/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Christian
 */
public class Multiplier {
    private int multNumber;
    
    public Multiplier(int number) {
        this.multNumber = number;
    }
    
    public int multiply(int number){
        return this.multNumber * number;
    }
}
