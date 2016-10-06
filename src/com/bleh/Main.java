package com.bleh;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

/* Sorry for the bit of a mess here...i ran into problems when trying to run all
functions at once..all except 3 & 6 are working at the moment but they need to be
run by themselves. i do apologize for the annoying note markers i used to separate
the different problems but hopefully it makes sense on your end
 See you in class :)
 thanks
 Colin Bradley
 */


public class Main {

/*
// *FUNCTION 1* //
    public static void main(String[] args) {
        System.out.println("i love numbers...especially even numbers they are my favorite :) what's your favorite number?");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput % 2 == 0) {
            System.out.println("woah your favorite number is even :) we both like even numbers..awesome");
        } else {
            System.out.println("well that's odd..you like odd numbers :/ odds are cool too i guess..");

        }
    }
*/

/*
// FUNCTION 2 //

    public static void main(String[] args){
    System.out.println("write a word twice and ill see if you spelt them the same");
        Scanner input = new Scanner(System.in);
        String userInput1 = input.nextLine();
        String userInput2 = input.nextLine();
        if (userInput1 .equals(userInput2)){
            System.out.println("yup...not sure if its spelled corectly though :/ im not a dictionary");}
            else {
                System.out.println("are you sure those are the same, or are you messing with me");
        }
    }
*/

/*
// FUNCTION 3 //****

    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        userInput ;

    }
*/

/*
//  *FUNCTION 4*  //
    public static void main(String[] args) {
        System.out.println("i will pick a random number...i'll only show you the real number if it is over 50..good luck");
        double num = Math.random()*100;
        if (num > 50) {
            System.out.println(num);
        } else {
            System.out.println("-1");
        }
    }
*/

/*
// *FUNCTION 5* //
    public static void main(String [] args){
        System.out.println("please enter any date like this");
        System.out.println("DAY");
        System.out.println("MONTH");
        System.out.println("YEAR");
        System.out.println("and i'll tell you a secret..");
        Scanner input = new Scanner(System.in);
        int userImputDay = input.nextInt();
        int userImputMonth = input.nextInt();
        int userImputYear = input.nextInt();
        int nextDay = userImputDay + 1;
        String stDay = Integer.toString(nextDay);
        String stMonth = Integer.toString(userImputMonth);
        String stYear = Integer.toString(userImputYear);
        String nextDate = "the day after that would be " + stDay + "/" + stMonth + "/" + stYear + " :)";
        System.out.println(nextDate);
    }
*/

/*
// FUNCTION 6 // ******
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String inputWord = input.nextLine();
        String omit = "";
        for (int x =0; x < inputWord.length(); x++){
            if (x % 2 == 0){
                omit += inputWord.charAt(x);
            }
        } return omit;

    }
*/

/*
// *FUNCTION 7* //
    public static void main(String [] args){
        System.out.println("please enter a number greater than 5");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();
        int x = 3;
    while (inputNum > 4){
        System.out.println(inputNum);
        inputNum--;
    }
    while (x > 0) {
        System.out.println(x);
        x--;
    }
    System.out.println("wait...i feel like i'm forgetting something :/ eh probably not important.");
    }
*/

/*
//  *FUNCTION 8*  //
    public static void main(String [] args){
        System.out.println("give me 2 numbers on the next 2 lines and i'll do some weird math..i like math");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sameNum1 = num1 + 2;
        int sameNum2 = num2 + 2;
        int difNum1 = num1 + 1;
        int difNum2 = num2 + 1;
        int sameAns = sameNum1 + sameNum2;
        int difAns = difNum1 + difNum2;
        if (num1 == num2){
            System.out.println(sameAns);
        }
        else {
            System.out.println(difAns);
        }
    }
*/

/*
//  *FUNCTION 9*  //
public static void main(String [] args) {
    System.out.println("Please type a country domain");
    Scanner input = new Scanner(System.in);
    String userCountry = input.nextLine();

    switch (userCountry){
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
*/

/*
//  *FUNCTION 10*  //
    public static void main(String [] args) {
        System.out.println("give me a letter and i will tell u what kind of letter it is");
        Scanner input = new Scanner(System.in);
        String inputLetter = input.nextLine();
        String lowerLetter = inputLetter.toLowerCase();
        if (lowerLetter.equals("a")) {
            System.out.println("that is the vowel 'A'");
        } else if (lowerLetter.equals("e")) {
            System.out.println("that is the vowel 'E'");
        } else if (lowerLetter.equals("i")) {
            System.out.println("that is the vowel 'I'");
        } else if (lowerLetter.equals("o")) {
            System.out.println("that is the vowel 'O'");
        } else if (lowerLetter.equals("u")) {
            System.out.println("that is the vowel 'U'");
        } else if (lowerLetter.equals("y")) {
            System.out.println("well that is a conson...no wait it's a vow..uhh it really depends on context for that letter");
        } else {
            System.out.println("that is a consonant");
        }
    }
*/

}
