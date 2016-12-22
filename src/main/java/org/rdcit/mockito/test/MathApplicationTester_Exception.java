/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.test;

import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.rdcit.mockito.app.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author sa841
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester_Exception {

    @InjectMocks
    MathApplication mathApplication = new MathApplication();

    @Mock
    CalculatorService calculService;

    @Test(expected = RuntimeException.class)
    public void testAdd() {
        doThrow(new RuntimeException("NAH NAH ")).when(calculService).add(5.0, 2.0);
    assertEquals(mathApplication.add(15.0, 2.0), 7.0, 0.0);
    }
    
    
}
