package com.joelimyx;

import java.util.Scanner;

public class Main {
//    1) check to see if it is even
    public static boolean isEven(int num){
        return (num%2 == 0);
    }

//    2) compare two word
    public static boolean compareWord(String phrase1, String phrase2){
        return phrase1.equalsIgnoreCase(phrase2);
    }

//    3)Check to see w
    public static void seeW(String phrase){
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == 'w'|| phrase.charAt(i) == 'W')
                break;
            System.out.println(phrase.charAt(i));
        }
    }

//    4) generate random number and check if it is greater than 50
    public static int random50(){
        double num = Math.random()*10_000;
        return (num>50) ? (int)num : -1;
    }
//    5) day, month and year
    public static String dayMonthYear(int day, int month, int year){
        if ((day>31 || day <1) || (month >12 || month < 1) || (year <0)) {
            System.out.println("Please enter a valid date.");
            return "";
        }else if(month == 2)
            if(year%4 != 0 && day > 28) {
                System.out.println("Please enter a valid date.");
                return null;
            }
        switch (month) {
            case 2:
                if(day>29){
                    System.out.println("Please enter a valid date.");
                    return null;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day>30){
                    System.out.println("Please enter a valid date.");
                    return null;
                }
                break;
        }
        return ("day:" + day +" month:"+ month +" year:"+year);
    }
//    6) Omits word
    public static String omitWord(String phrase){
        String omitted="";
        for (int i = 0; i < phrase.length(); i++) {
            if(i%2 == 0)
                omitted+= phrase.charAt(i);
        }
        return omitted;
    }
//    7) only 5+ and exclude 4
    public static void printAllExcept4(int num){
        if(num<=5)
            System.out.println("This number is not greater than 5.");
        else{
            for (int i = 1; i < num; i++) {
                if (i!=4)
                    System.out.println(i);
            }
        }
    }
//    8) same number, addition and sum
    public static int additionSum(int num1, int num2){
        if (num1==num2)
            return (num1+=2) + (num2+=2);
        else
            return (num1+=1) + (num2+=1);
    }
//    9) print full country name
    public static void printCountry(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your country doamin: ");
        String country = input.nextLine();
        country = country.toLowerCase();

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
//    10) Consonant or Vowel
    public static void consonantVowel(){
        Scanner input = new Scanner(System.in);
        String character;
        do {
            System.out.println("Please enter a single character: ");
            character = input.nextLine();
        }while(character.length() >1 || (character.isEmpty()));
        character= character.toLowerCase();
        switch (character){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("This is a Vowel");
                break;
            default:
                System.out.println("This is a Consonant.");
        }
    }

    public static void main(String[] args) {
	// write your code here

        System.out.println("Is the number even?: " + isEven(5));

        System.out.println("Are these two words the same? :" + compareWord("Hello","hello"));

        seeW("This is a test if W will be seen.");

        System.out.println(random50());

        System.out.println(dayMonthYear(29, 12, 1980));

        System.out.println(omitWord("This is only a omit test"));

        printAllExcept4(6);

        System.out.println(additionSum(10, 5));

        printCountry();

        consonantVowel();
    }
}
