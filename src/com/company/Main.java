package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println(isNumEven(10)); // #1
        System.out.println(areStringSame("hello", "sir")); // #2
        removeDoubleU("helloworld"); // #3
        System.out.println(randomNum()); // #4
        tomorrowsDate(5, 10, 2016); // #5
        System.out.println(everyOther("Cool Beans")); // #6
        skipFour(10); // #7
        areNumSame(225, 138); // #8
        countryDomain(); // #9
        vowelOrConsonant(); // #10

    }

    //Function #1
    public static boolean isNumEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Function #2
    public static boolean areStringSame(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return false;
        }
    }

    // Function #3
    public static void removeDoubleU(String str) {
        for (int x = 0; x < str.length(); x++) {
            if (str.charAt(x) == 'w')
                break;
            System.out.println(str.charAt(x));
        }
    }

    //Function #4
    public static double randomNum(){
        double num = Math.random()*100;
        if (num > 50){
            return num;
        } else {
            return -1;
        }
    }

    // Function #5
    public static void tomorrowsDate(int day, int month, int year){
        day++;
        System.out.println("day:" + day + " month:" + month + " year: " + year);
    }

    // Function #6
    public static String everyOther(String word){
        String omit = "";
        for (int x = 0; x < word.length(); x++){
            if(x % 2 == 0){
                omit += word.charAt(x);
            }
        } return omit;
    }

    // Functions #7
    public static void skipFour(int num){
        if (num > 5){
            int count = 1;
            while (count <= num){
                System.out.println(count++);
                if (count == 4){

                }
            }
        } else {
            System.out.println("Number needs to be greater than 5!");
        }
    }

    // Function #8
    public static void areNumSame(int num1, int num2){
        if (num1 == num2){
            num1 += 2;
            num2 += 2;
            int sum = num1 + num2;
            System.out.println(sum);
        } else {
            num1 ++;
            num2 ++;
            int sum = num1 + num2;
            System.out.println(sum);
        }
    }

    // Function #9
    public static void countryDomain(){
        Scanner input = new Scanner(System.in);
        String country = input.nextLine();

        switch (country){
        case "us":
            System.out.println("United States");
            break;
        case "de":
            System.out.println("Germany");
            break;
        case "hu":
            System.out.println("Hungary");
            break;
        default:
            System.out.println("Unknown");
        }
    }

    // Function #10
    public static void vowelOrConsonant() {
        Scanner input = new Scanner(System.in);
        char l = input.nextLine().charAt(0);

        switch (l){
        case 'a':
            System.out.println("It's the vowel, a!");
            break;
        case 'e':
            System.out.println("It's the vowel, e!");
            break;
        case 'i':
            System.out.println("It's the vowel, i!");
            break;
        case 'o':
            System.out.println("It's the vowel, o!");
            break;
        case 'u':
            System.out.println("It's the vowel, u!");
        default:
            System.out.println("It's a consonant!");
        }
    }
}
