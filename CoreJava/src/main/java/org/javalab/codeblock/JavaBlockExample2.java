package org.javalab.codeblock;

public class JavaBlockExample2 {

    static {
        System.out.println("I am a static block 1");
    }
    static {
        System.out.println("I am a static block 3");
    }
    static {
        System.out.println("I am a static block 2");
    }

    public static void main(String[] args) {
        System.out.println("I am a main method");
    }
}
