/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.app;

/**
 *
 * @author sa841
 */
public class Calculator implements CalculatorService{

    @Override
    public double add(double input1, double input2) {
       return input1 + input2;
    }

    @Override
    public double subtract(double input1, double input2) {
    return input1 - input2;
    }

    @Override
    public double multiply(double input1, double input2) {
     return input1 * input2;
    }

    @Override
    public double divide(double input1, double input2) {
     return input1 / input2;
    }
    
}
