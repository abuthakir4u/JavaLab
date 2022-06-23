package org.example.Operators;

public class Example1 {
    public static void main(String[] args) {
        int result = 1 + 2; //assignment operator and addition operator usage
        int result1 = 3;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) //NOTE: if you add semicolon at the end of this if block then next line will be executed always
            System.out.println("It is not an alien!");

        //Following is the code block example, we can use this along with if-then
        {
            System.out.println("code block line 1");
            System.out.println("code block line 2");
        }

        int topScore = 100;
        if (topScore == 100) {
            System.out.println("You got the high score!");
        }
        if (topScore != 100) {
            System.out.println("reached 1");
        }
        if (topScore > 100) {
            System.out.println("reached 2");
        }

        int secondTopeScore = 60;
        if ((topScore > secondTopeScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopeScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
//        if (newValue = 50) { // error is instead of using == we used  =. And it will generate integer finally and if won't accept that. Incompatible  type error will thrown
//            System.out.println("This is true");
//        }

        boolean isCar = false;
        if (isCar = true) { //Again we are wrongly using = instead of ==, but the expression output is boolean so if is accepting that. But this is buggy code
            System.out.println("This is not supposed to happen");
        }
        //corrected == here
        if (isCar == true) {
            System.out.println("This is not supposed to happen");
        }
        //Simplified the above version
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

    }
}
