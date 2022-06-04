package com.in28minutes.junit.helper;

import org.junit.*;

public class QuickBeforeAfterAnnotationTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void setup() {
        System.out.println("Before");
    }

    @After
    public void cleanup() {
        System.out.println("After");
    }

    @Test
    public void test1() {
        System.out.println("test 1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test 2 executed");
    }
}
