package org.javalab;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(MyRunner.class)
public class MyTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("in beforeClass method");
    }

    @Before
    public void before() {
        System.out.println("in before method");
    }

    @Test
    public void testMethod1() {
        System.out.println("in the testMethod1");
    }

    @Test
    public void testMethod2() {
        System.out.println("in the testMethod2");
    }
}