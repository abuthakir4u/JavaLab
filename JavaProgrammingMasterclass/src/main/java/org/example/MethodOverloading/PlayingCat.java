package org.example.MethodOverloading;

public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(true, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int minPlayingTemperature = 25;
        int maxPlayingTemperature = 35;
        if (summer == true) {
            maxPlayingTemperature = 45;
        }
        if (temperature >= minPlayingTemperature && temperature <= maxPlayingTemperature) {
            return true;
        } else {
            return false;
        }
    }
}
