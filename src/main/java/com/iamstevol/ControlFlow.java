package com.iamstevol;

public class ControlFlow {

    public static void main(String[] args) {
        int counter= 0;
        int limit = 3;
        for(int i=0; i<100; i++) {
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                counter +=1;
                if(counter == limit) {
                    break;
                }
            }
        }
        System.out.println("Total number of prime number between 0 and 100 is " +
                counter);
    }
    public static boolean isPrime (int wholeNumber) {
        if (wholeNumber <=2) {
            return (wholeNumber==2);
        }
        for (int i = 2; i < wholeNumber; i++) {
            if (wholeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
