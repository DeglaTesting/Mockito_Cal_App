/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.rdcit.mockito.testrunner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.rdcit.mockito.test.*;

/**
 *
 * @author sa841
 */
public class TestRunner {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(MathApplicationTester_Mock.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.getMessage());
        }
        System.out.println(result.wasSuccessful());
    }

}
