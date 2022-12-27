package com.iamstevol;

/*This is a do-while statement that gets
executed when a proposed action is met
Use case: When you want a user to enter a password*/
public class WhileAndDoWhile {

    public static void main(String[] args) {
//        int j = 1;
//        boolean isReady = false;
//        do {
//            if (j > 7) {
//                break;
//            }
//                System.out.println(j);
//                j++;
//                isReady = (j > 0);
//            } while (isReady);
//
//        int number = 0;
//        while (number < 50) {
//            number += 5;
////            System.out.print(number + "_");
////
            //Selecting even numbers alone
        int num =4;
        int evenCount = 0;
        int oddCount = 0;
        while (num < 20) {
            num++;
            if(!isEvenNumber(num)){
                oddCount ++;
                continue;
            }
            System.out.println(num);
            evenCount++;
            if(evenCount == 6) {
                break;
            }
        }
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}

