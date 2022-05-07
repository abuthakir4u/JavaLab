package org.javalab.codeblock;

public class JavaBlockExample1 {
    {
        System.out.println("I am an instance block 1");
    }
    {
        System.out.println("I am an instance block 3");
    }
    {
        System.out.println("I am an instance block 2");
    }
    JavaBlockExample1() {
        System.out.println("I am a constructor");
    }

    public static void main(String[] args) {
        System.out.println("I am a main method");
        JavaBlockExample1 obj1 = new JavaBlockExample1();
        System.out.println();
        JavaBlockExample1 obj2 = new JavaBlockExample1();
    }
}
