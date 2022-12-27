package com.iamstevol;

public class Palindrome {
    public static void main(String[] args) {
        int num = 71137;

        System.out.println(isPalindrome(num));
    }
    public static boolean isPalindrome(int num) {
        int num1 = num;
        int reverse = 0;
        int lastDigit = 0;

        while (num > 0) {
            lastDigit = num % 10;
            reverse = (reverse * 10)+ lastDigit;
            num = num / 10;

        }
        if (reverse == num1) {
            return true;
        }
        return false;
    }
}
