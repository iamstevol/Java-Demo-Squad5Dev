package com.iamstevol;

public class SumOddUsingMethodOverload {
    public static void main(String[] args) {
        System.out.println(sumOdd(13, 13));
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if(i < 0){
                break;
            }
            if (i > 0 && i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}