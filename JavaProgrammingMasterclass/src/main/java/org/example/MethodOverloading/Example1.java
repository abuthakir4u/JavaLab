package org.example.MethodOverloading;

public class Example1 {
    public static void main(String[] args) {
        int newScore = calculateScore("Abu", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
    }

    public static int calculateScore(String plaerName, int score) {
        System.out.println("Player " + plaerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    //Cannot create a method overloading with different return type so following will throw error
//    public static void calculateScore() {
//        System.out.println("No player name, no player score");
//    }
}
