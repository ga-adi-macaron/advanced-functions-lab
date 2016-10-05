package Nikita.Shuvalov;

import sun.nio.ch.Interruptible;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



    }
    public static boolean isEven(int num){
        if (num %2 == 0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isSameWord(String firstStr, String secondStr){
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();
        if (firstStr.equals(secondStr)){
            return true;
        }else {
            return false;
        }
    }
    public static void printUntilW(String word){
        int i = 0;
        while (i < word.length()){
            char character = word.charAt(i);
            if (character == 'w'){
                break;
            }
            System.out.println(character);
            i++;

        }
    }
    public static int randomNumber(){
        Random randomGen = new Random();
        int rNum = randomGen.nextInt();
        System.out.println(rNum);
        if (rNum>50){
            return rNum;
        }else {
            return -1;
        }

    }
    public static String getNextDate(int day, int month, int year){
        int daysInMonth;
        int nextDay = day++;
        int monthHolder = month;
        int yearHolder= year;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth= 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth=30;
                break;
            case 2:
                if (year%4==0){
                    daysInMonth=29;
                }else {
                    daysInMonth=28;
                }
        }
        if (day >daysInMonth){
            monthHolder++;
            nextDay = 1;
            if (month>12){
                yearHolder++;
                monthHolder=1;
            }
        }
        String message = "day:" + nextDay + " month:" + monthHolder + " year:" + yearHolder;
        return message;
    }


    public static String omitEveryOther(String word){
        boolean keepCurrent = true;
        int i = 0;
        String newSpeak= "";
        while (i<word.length()){
            if (keepCurrent){
                newSpeak += String.valueOf(word.charAt(i));
                keepCurrent= false;
        }else {
                keepCurrent=true;
            }

        }
        return newSpeak;
    }

    public static void printAllBut4(int num){
        int counter = 1;
        if (num <=5){
            System.out.println("Illegal number; number needs to be greater than 5");
        }
        while (num< counter){
            if (counter != 4){
                System.out.println(counter);
            }
        }
    }

    public static int checkNumbers(int num1, int num2){
        if (num1 != num2 ){
            num1++;
            num2++;
        } else {
            num1+=2;
            num2+=2;
        }
        return num1+num2;
    }

    public static void askClientCountry (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input country");
        String userInput = scanner.nextLine();
        switch (userInput.toLowerCase()){
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

    public static void checkIfVowel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter to see if it is a vowel or consonant");
        String userInput = scanner.nextLine();
        if (userInput.length()>1){
            System.out.println("I'm sorry, you entered too many characters. Please try again.");
            checkIfVowel();
        }
        try {
            System.out.println(Double.valueOf(userInput)+ " is a numerical value. Please enter a letter.");
            checkIfVowel();
        } catch{
            char check = userInput.toLowerCase().charAt(0);
            switch(check){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

            }
        }

    }


}


//
//        Write a function that asks the user to type in a letter and prints out whether the letter is a vowel or a consonant.
// You may use control flow and multiple conditionals.