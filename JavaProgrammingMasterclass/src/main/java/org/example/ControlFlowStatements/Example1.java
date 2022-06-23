package org.example.ControlFlowStatements;

public class Example1 {
    public static void main(String[] args) {
        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break; //NOTE: if we remove this break default will also be executed
            default:
                System.out.println("Was not 1 to 5");
                break;
        }

        char characterValue = 'B';
        switch (characterValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
            case 'D':
            case 'E':
                System.out.println(characterValue + " was found");
                break;
            default:
                System.out.println("Value not found");
                break;
        }

        String month = "january";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Jan or Jun");
                break;
        }

    }
}
