/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.rdcit.mockito.app.*;
import org.mockito.runners.MockitoJUnitRunner;

/**
 *
 * @author sa841
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();
    @Mock
    CalculatorService caluclatorService;

    @Test
    public void addTest() {
        when(caluclatorService.add(15.0, 15.0)).thenReturn(30.00);
        
        //when(caluclatorService.subtract(40, 10)).thenReturn(30.00);
        Assert.assertEquals(mathApplication.add(15.1, 15.0), 0.0, 30.0);
        verify(caluclatorService).add(15.0, 15.0);
        // Assert.assertEquals(caluclatorService.subtract(40, 10), 30, 0.0);
      //  
    }

}
