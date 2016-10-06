package com.korbkenny;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //1
        isEven(365);
        isEven(420);

        //2
        sameSpelling("Dog", "God");
        sameSpelling("Good", "Good");


        //3
//        lettersNoW("How are you?");
//        lettersNoW("SO WHATS UP?");
//        lettersNoW("Cool.");

        //4
        random50();

        //5
//        butOfWhatYear(24, 11, 1945);
//        butOfWhatYear(9, 1, 2012);
//        butOfWhatYear(31, 6, 5555);

        //6
        everyOtherLetter("Tomato");
        everyOtherLetter("Deoxyribonucleic Acid");
        everyOtherLetter("Pneuminoultramicroscopicsilicavolcanoconiosis");

        //7
        listToFive(14);

        //8
        areTheySame(5, 3);
        areTheySame(2, 2);

        //9
        countriesYeah();

        //10
        vowelsOrNo();
    }

    //1
    public static void isEven(int numb) {
        if (numb % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //2
    public static void sameSpelling(String one, String two) {
        if (one.equals(two)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }


    //3
    public static void lettersNoW(String word) {

        int index = 0;
        char letter = word.toLowerCase().charAt(index);

        while (index < word.length()) {
            if (letter == 'w') {
                return;
            } else if (letter != 'w') {
                System.out.println(letter);
                index++;
                letter = word.toLowerCase().charAt(index);
            } else {
                return;
            }

        }

    }


    //4.
    public static int random50() {
        Random num = new Random();
        int randomNum = num.nextInt(999);
        System.out.println(randomNum);

        if (randomNum > 50) {
            return randomNum;
        } else {
            return -1;
        }
    }


    //5.
    public static String butOfWhatYear(int day, int month, int year) {

        if (month > 12) {
            return "Nope.";
        } else {
            int monthDay = day;
            int goodDay;
            int nextDay = day;
            String out = "You went wrong somewhere...";
            String out2 = "Testing...";
            String out3 = "More testing...";
            int monthSomething;

            switch (month) {
                case 9:
                case 4:
                case 6:
                case 11:
                    monthDay = 30;
                    break;

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    monthDay = 31;
                    break;

                case 2:
                    if (year % 4 == 0) {
                        monthDay = 29;
                    } else {
                        monthDay = 28;
                    }
                    break;
            }


            monthSomething = month;
            int yearSomething = year;

            if (day > monthDay) {
                System.out.println(out3);
                return out;
            } else {
                nextDay++;
                if (nextDay > monthDay) {
                    monthSomething++;
                }

                //I AM SO STUCK RIGHT NOW.


                else {
                    System.out.println("HEY111");
                    return out;
                }
                if (month > 12) {
                    yearSomething++;
                } else {
                    System.out.println("HEY");
                    return out;
                }
            }

            String FINALLY = "Tomorrow's day is " + nextDay + " of the month " + month + " of the year " + year;

            System.out.println(FINALLY);
            return FINALLY;
        }
    }

    //6.
    public static String everyOtherLetter(String word1) {
        String word2 = "";
        int index = 0;
        char letter = word1.charAt(index);

        for(index = 0; index < word1.length(); index = index + 2) {
            word2 = word2 + word1.charAt(index);


        }
        System.out.println(word2);
return word2;

    }







        //7.
        public static void listToFive(int num1) {
            int idx = 1;

            while (idx <= num1) {
                if(idx == 4){
                    idx++;
                }
                else {
                    System.out.println(idx);
                    idx++;
                }
            }


        }


        //8
        public static void areTheySame(int num1, int num2){
            if(num1 == num2){
                int finalNum1 = (num1 + 2) + (num2 + 2);
                System.out.println(finalNum1);
            }
            else{
                int finalNum1 = (num1 + 1) + (num2 + 1);
                System.out.println(finalNum1);
            }
        }


        //9
        public static void countriesYeah() {

            System.out.println("Enter a country code (like, the 2 letters thing)");
            Scanner input = new Scanner(System.in);
            String userCode = input.nextLine();
            userCode.toLowerCase();

            switch(userCode) {
                case "us": System.out.println("United States");
                    break;
                case "de": System.out.println("Germany");
                    break;
                case "hu": System.out.println("Hungary");
                    break;
                default: System.out.println("Unknown");
                    break;
            }
        }

        //10
        public static void vowelsOrNo(){
            System.out.println("Please type a letter, please please:");
            Scanner input = new Scanner(System.in);
            String letter = input.nextLine();
            letter.toLowerCase();

            if(letter.length() == 1) {
                switch (letter) {
                    case "a":
                    case "e":
                    case "i":
                    case "o":
                    case "u":
                        System.out.println("Vowel");
                        break;
                    case "y":
                        System.out.println("...Sometimes");
                        break;
                    default:
                        System.out.println("Consonant");
                        break;
                }
                return;
            }
            else {
                  System.out.println("Not a letter");
                    return;
                }
                }
            }








