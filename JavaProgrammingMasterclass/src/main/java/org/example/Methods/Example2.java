package org.example.Methods;

public class Example2 {
    public static void main(String[] args) {
        int hightScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + hightScore);
        hightScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + hightScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);;

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);;

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);;

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);;

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bug", highScorePosition);;

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        //Another way of writing the code without too many return
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500 && playerScore < 1000){
            position = 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            position = 3;
        }
        return position;
    }
}
