/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.stubbing.Answer;
import org.rdcit.mockito.app.*;

/**
 *
 * @author sa841
 */
@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTester_Mock {

    private MathApplication mathApplication;
    private CalculatorService calculService;

    @Before
    public void setUp() {
        mathApplication = new MathApplication();
        calculService = mock(CalculatorService.class);
        mathApplication.setCalculatorService(calculService);

    }
    
    

    @Test
    public void testAddAndSubstract() {

        when(calculService.subtract(0.0, 0.0)).thenReturn(0.000);
         when(calculService.subtract(10.0, 10.0)).thenReturn(20.000);
        when(calculService.add(2.0, 50)).thenReturn(72.0);
        // when(calculService.subtract(10.0, 0.0)).thenReturn(10.0);

        Assert.assertEquals(mathApplication.add(2.0, 50), 72.0, 0.0);
        reset(calculService);
        Assert.assertEquals(mathApplication.subtract(10.0, 10.0), 0.0, 0.0);

      /*    verify(calculService).add(2.0, 50);
        verify(calculService).subtract(0.0, 0.0);
        verify(calculService, atLeast(0)).subtract(10.0, 0.0);

      InOrder inorder = inOrder(calculService);
        inorder.verify(calculService).add(2.00, 50);
        inorder.verify(calculService).subtract(0.0, 0.0);*/
    }

    @Test
    public void testAnswerInterface() {

        when(calculService.add(2.0, 5.0)).thenAnswer(new Answer<Double>() {
           @Override
            public Double answer(InvocationOnMock invocation) throws Throwable {
                Object[] args = invocation.getArguments();
                Object mock = invocation.getMock();
                System.out.println("In the answer method");
                return 7.0;
            }
        });
        
        Assert.assertEquals(mathApplication.add(2.0, 5.0), 7.0, 0);
    }

}
