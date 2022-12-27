package com.iamstevol;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(165, 42));
    }

    public static String getDurationString  (int seconds) {
        if(seconds < 0) {
            return "Invalid data for seconds";
        }
        return getDurationString(seconds/60, seconds%60);
    }
    public static String getDurationString (int minutes, int seconds) {
        if(minutes < 0) {
            return " Invalid input";
        }
        if(seconds <= 0 || seconds >=59) {
            return "Invalid input";
        }
        int hour = minutes / 60;

        int remainingMinute = minutes % 60;

        return hour + "h " + remainingMinute + "m " + seconds + "s";
    }
}
