package com.iamstevol;

public class Sum3and5 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int limit = 5;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count += 1;
                sum += i;
                System.out.println(i);
            }
            if (count == limit) {
                break;
            }
        }
        System.out.println(sum);
    }
}
