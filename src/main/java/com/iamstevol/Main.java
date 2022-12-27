package com.iamstevol;

public class Main {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(143);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(1453);
        displayHighScorePosition("Tolu", highScorePosition);

        highScorePosition = calculateHighScorePosition(2343);
        displayHighScorePosition("Tope", highScorePosition);

        highScorePosition = calculateHighScorePosition(243);
        displayHighScorePosition("Timothy", highScorePosition);

        System.out.println(" ");
        long l = toMilesPerHour(1.3);
        System.out.println("--------Speed Converter Solution----------");
        System.out.println(l);

        System.out.println(" ");
        System.out.println("--------Memory Converter Solution----------");
        printMegaBytesAndKiloBytes(25);

        System.out.println(" ");
        System.out.println(shouldWakeUp(true, 8));


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " +
                highScorePosition +
                " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100 ) {
            return 3;
        } else {
            return 4;
        }
    }

    //Speed Converter
    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour < 0) ? -1 : (long) ((kilometersPerHour > 0) ? (Math.round(kilometersPerHour * 0.621371)) : 0);
    }

    //MegaBytes Converter
    public static void printMegaBytesAndKiloBytes( int kiloBytes) {
        int megaByte = kiloBytes/1024;
        if(kiloBytes <= 0) {
            System.out.println("invalid output");
        } else if (kiloBytes < 1024) {
            System.out.println("This is not up to a megaByte");
        } else {
            System.out.println(kiloBytes + "= " + megaByte + "." + kiloBytes%1024);
        }
    }

    //Barking Dog
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        barking = false;
        if (hourOfDay > 0 && hourOfDay < 23) {
            barking = true;
        } else if (hourOfDay == 8) {
            barking = false;
        }
        return false;
    }
}