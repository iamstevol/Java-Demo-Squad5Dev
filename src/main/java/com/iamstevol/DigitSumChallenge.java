package com.iamstevol;

public class DigitSumChallenge {

    public static void main(String[] args) {
        int num = 5;
        System.out.println(sumDigits(num));
    }
    public static int sumDigits(int num) {
        if (num < 0) {
            return -1;
        }
        int sum =0;
        while(num > 0) {
            sum += (num % 10);
            num = num / 10;
        }
//        sum += num;
        return sum;
    }
}
