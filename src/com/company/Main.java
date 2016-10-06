package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(isEven(11));
        System.out.println(stringCompare("hello", "hello"));
        System.out.println(genRandom());
        System.out.println(dateNext(30, 4, 2016));
        System.out.println(numberAddition(2, 1));
        System.out.println("Enter Country Domain");
        countryTyping();
        System.out.println("Type in a Letter");
        typeJustALetter();
        printStringChars("do_something_with");
        getNumbers(15);

    }

    //1st
    public static boolean isEven(int num0) {
        int remaining = num0 % 2;
        boolean even;
        if (remaining == 1) {
            even = false;
        } else {
            even = true;
        }
        return even;

    }

    //2nd
    public static boolean stringCompare(String first, String second) {
        boolean same;
        if (first == second) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    //3rd
    public static void printStringChars(String word) {

        for (int count = 0; count < word.length(); count++) {
            char problematic = word.charAt(count);
            if (problematic != 'w') { System.out.println(word.charAt(count));
            } else return;
        }
    }

    //4th
    public static double genRandom() {
        double randomnum = Math.random();
        double value;
        if (randomnum > 50) { value = randomnum;
        } else { value = -1;
        }
        return value;
    }

    //5th
    public static String dateNext(int day, int month, int year) {
        int newday = 0;
        int newmonth = 0;
        int newyear = 0;
        switch (day) {
            case 31:
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)) {
                    newday = 1;
                    newmonth = month + 1;
                    newyear = year;
                } else if (month != 12) {System.out.println("Invalid Date");}
                if (month == 12) {
                    newday = 1;
                    newmonth = 1;
                    newyear = year + 1;}
                break;
            case 30:
                if ((month == 2) || (month == 4) || (month == 6) || (month == 9) || (month == 11)) {
                    newday = 1;
                    newmonth = month + 1;
                    newyear = year;
                }
                break;
            default:
                newday = day +1;
                newmonth = month;
                newyear = year;
                break;
        }
        String nextDay = "Day " + newday + " Month " + newmonth + " Year " + newyear;
        return nextDay;
    }

    //6th - Couldn't figure, need help with this one.

    //7th
    public static void getNumbers(int numberEntered) {
        int numberStart = 1;
        do {
            numberStart++;
            if (numberStart != 4) {
                if ((numberEntered >= numberStart)) {
                    System.out.println(numberStart);
                } else return;
            }
            }
        while (numberEntered > 5);
    }

    //8th
    public static int numberAddition(int num0, int num1) {
        int sum;
        if (num0 == num1) {
            sum = num0 + num1 + 2;
        } else {
            sum = num0 + num1 + 4;
        }
        return sum;
    }

    //9th
    public static void countryTyping() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        switch (userInput.toUpperCase()) {
            case "US":
                System.out.println("United States");
                break;
            case "DE":
                System.out.println("Germany");
                break;
            case "HU":
                System.out.println("Hungary");
                break;
            default:
                System.out.println("Unknown");
                break;
        }

    }

    //10th
    public static void typeJustALetter() {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        if (userInput.length() > 1 ) { System.out.println("Type in just a letter please.");}
        else switch (userInput.toUpperCase()) {
            case "A":
                System.out.println("Vowel");
                break;
            case "E":
                System.out.println("Vowel");
                break;
            case "I":
                System.out.println("Vowel");
                break;
            case "O":
                System.out.println("Vowel");
                break;
            case "U":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}