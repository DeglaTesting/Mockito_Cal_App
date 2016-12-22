/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.spy;
import org.rdcit.mockito.app.*;

/**
 *
 * @author sa841
 */
public class MathApplicationTester_Spy {
    
    private MathApplication mathApplication;
    private CalculatorService calculatorService;
    
    @Before
    public void setUp(){
        mathApplication = new MathApplication();
        Calculator calculator= new Calculator();
        calculatorService = spy(calculator);
        mathApplication.setCalculatorService(calculatorService);
        
    }
    
    @Test
    public void testAdd(){
        
        Assert.assertEquals(mathApplication.add(2.0, 5.02) , 7.02, 0.0);
    }
}
