package org.javalab.commandline;

public class CommandlineExample1 {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("The input arguments are");
            for(String arg: args) {
                System.out.println("arg: " + arg);
            }
        } else {
            System.out.println("No arguments provided");
        }
    }
}
