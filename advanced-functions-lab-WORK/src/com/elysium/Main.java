package com.elysium;

import java.awt.datatransfer.SystemFlavorMap;

public class Main {
    /**
     * #1 - Write a function that takes in a number and returns true if the number is even or false if the number is odd.
     * You may use control flow and multiple conditionals.
     */

    public static void main(String[] args) {

        int num1 = 1_000_001;
        if (num1 % 2 == 0) {
            System.out.println("true!!");

        } else if (num1 % 3 == 0 || num1 % 1 == 0) {
            System.out.println("false!!");
        }

        /** #2 -  Write a function that takes in two words and compares them. If the spelling is the same, the functions
         * returns true, otherwise false.
         */

        String sandwich = "sandwich";

        if ("sandwich" == sandwich) {
            System.out.println("true!");
        } else if ("sandwich" != sandwich) {
            System.out.println("false!");
        }

        /** #3 - Write a function that takes in a word and prints out its every letter on a new line before it sees the
         * letter "w". If it encounters "w" the function should stop executing. */

        /**String word = "word";
        int index = 0;
        char letter = word.charAt(index);

        while (index < word.length()){
            if (letter == 'w');*/

        String word = "Please follow me";
        int index = 0;
        char letter = word.charAt(index);

        while (index < word.length()) {
            if (letter == 'w') ;
            {
                System.out.println(letter);
            }
            if (letter != 'w');{
                System.out.println(index++);
                }
            }

        /** #4 - Write a function that generates a random number. Print it out. If the number is greater that 50,
         * return it, otherwise return -1. You may use control flow and multiple conditionals */

        int number = 60;

        switch (number){
            case 12:
                System.out.println(-1);
                break;
            case 33:
                System.out.println(-1);
                break;
            case 60:
                System.out.println(60);
                break;
            case 90:
                System.out.println(-1);
                break;
            case 73:
                System.out.println(-1);
                break;
        }
    }
}