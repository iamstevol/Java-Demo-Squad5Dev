package com.iamstevol;

public class SwitchDemo {

    public static void main(String[] args) {
        String month = "JANUARY";
        System.out.println(month + "is in the " + getMonth(month) + " month");
    }

    public static String getMonth(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "MAY" -> "2nd";
            default -> {
                String badResponse = month + "is bad";
                yield badResponse;
            }

        };
    }
}
