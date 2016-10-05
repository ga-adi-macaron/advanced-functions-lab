import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Scott Lindley on 10/5/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        printInstructions();
        while(true){
            int userInt = 11;
            String userInput = input.nextLine();
            try{
                userInt = Integer.parseInt(userInput);
            }catch (NumberFormatException nfe){

            }
            switch (userInt){
                case 0:
                    System.out.println("Thanks for playing!");
                    return;
                case 1:
                    System.out.println("Enter a number and I'll tell you if it is even.");
                    int num = input.nextInt();
                    System.out.println(isEven(num));
                    break;
                case 2:
                    System.out.println("Enter two words and I'll tell you whether or not they are identical");
                    System.out.println("What's the first word?");
                    String firstWord = input.next();
                    System.out.println("Okay, now the second word?");
                    String secondWord = input.next();
                    System.out.println(isSameSpelling(firstWord, secondWord));
                    break;
                case 3:
                    System.out.println("Enter some text and I will print out each letter except for the letter 'w'\n" +
                            "I HATE the letter 'w'...");
                    String word = input.next();
                    printLetters(word);
                    break;
                case 4:
                    int result = randomNumber();
                    if (result==-1){
                        System.out.println("That's because the generated number was less than 50. Because that's what" +
                                "the instructions said to do.");
                    }
                    break;
                case 5:
                    System.out.println("What number month are we in?");
                    int monthInt = 0;
                    int dayInt = 0;
                    int yearInt = 0;
                    String m = input.next();
                    try {
                        monthInt = Integer.valueOf(m);
                    }catch(NumberFormatException nfe){
                        System.out.println("That's not a number");
                        break;
                    }
                    System.out.println("What is the day today?");
                    String d = input.next();
                    try {
                        dayInt = Integer.parseInt(d);
                    }catch(NumberFormatException nfe){
                        System.out.println("That's not a number");
                        break;
                    }
                    System.out.println("What year is it?");
                    String y = input.next();
                    try {
                        yearInt = Integer.parseInt(y);
                    }catch(NumberFormatException nfe){
                        System.out.println("That's not a number");
                        break;
                    }
                    System.out.println(nextDay(dayInt,monthInt,yearInt));
                    break;
                case 6:
                    System.out.println("Enter text and I will spit out every other letter");
                    input.nextLine();
                    String text = input.nextLine();
                    System.out.println(everyOtherLetter(text));
                    break;
                case 7:
                    System.out.println("Enter a whole number and I'll count to that number starting at 1\n" +
                            "Except... there's this number between 3 and 5 that I always forget...");
                    String number = input.next();
                    int numberInt = 0;
                    try{
                        numberInt = Integer.parseInt(number);
                    }catch (NumberFormatException nfe){
                        System.out.println("That's not what I was looking for... Work with me here!");
                    }
                    dontPrint4(numberInt);
                    break;
                case 8:
                    System.out.println("Enter two numbers. If they're equal then I'll add 1 to each and then" +
                            " give you the sum of the incremented numbers.\nIf they're not the same I'll add two to" +
                            " each one and then return the sum");
                    double num1Double = 0;
                    double num2Double = 0;
                    System.out.println("What's number 1?");
                    String num1 = input.next();
                    System.out.println("What's number 2?");
                    String num2 = input.next();
                    try{
                        num1Double = Double.parseDouble(num1);
                        num2Double = Double.parseDouble(num2);
                    }catch (NumberFormatException nfe){
                        System.out.println("Don't be difficult...");
                    }
                    System.out.println(funkyCalculator(num1Double,num2Double));
                    break;
                case 9:
                    System.out.println("Enter a country domain and I'll tell you the name of the country");
                    String domain = input.next();
                    countryDomain(domain);
                    break;
                case 10:
                    System.out.println("Enter a single letter and I'll tell you whether or not it is a vowel");
                    String letter = input.next();
                    vowelFinder(letter);
                    break;
                case 11:
                    printInstructions();
                    break;
                default:
                    System.out.println("If you're confused you can type '11' to view the instructions.");
            }
        }
    }

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        return false;
    }

    public static boolean isSameSpelling(String word1, String word2){
        if(word1.equals(word2)){
            return true;
        }
        return false;
    }

    public static void printLetters(String word){
        for(int i =0; i<word.length(); i++){
            if(word.toLowerCase().charAt(i)=='w'){
                break;
            }
            System.out.println(word.charAt(i));
        }
    }

    public static int randomNumber(){
        Random random = new Random();
        int randInt = random.nextInt();
        if(randInt>50){
            System.out.println("Your random number is: "+randInt);
            return randInt;
        }
        System.out.println("Your random number is: -1");
        return -1;
    }

    public static String nextDay(int day, int month, int year){
        if(day<1||day>31||month<1||month>12){
            return "What are you smoking? That's not a real date.";
        }
        if(month==12){
            if(day == 31){
                day = 1;
                month = 1;
                year++;
            }else{
                day++;
            }
        }else if(month==4||month==6||month==9||month==11) {
            if (day > 30) {
                return "There aren't" + day + "days in that month...";
            }
            if (day == 30) {
                day = 1;
                month++;
            }else{
                day++;
            }
        }else{
            if(day==31){
                day = 1;
                month++;
            }else{
                day++;
            }
        }
        return "Tomorrow's date is: "+month+"/"+day+"/"+year;
    }

    public static String everyOtherLetter(String word){
        String newWord = "";
        for(int i=0; i<word.length(); i++){
            if(i%2==0){
                newWord += word.charAt(i);
            }
        }
        return newWord;
    }

    public static void dontPrint4 (int number){
        for(int i=1; i<=number; i++)
            if(i!=4){
                System.out.println(i);
            }
    }

    public static double funkyCalculator (double num1, double num2){
        num1++;
        num2++;
        if(num1 == num2){
            num1++;
            num2++;
        }
        return num1 + num2;
    }

    public static void countryDomain(String country){
        switch (country.toLowerCase()){
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

    public static void vowelFinder (String input){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        if(input.length()>1){
            System.out.println("I said one letter...");
            return;
        }
        if(alphabet.contains(input.toLowerCase())){
            switch (input.toLowerCase()){
                case "a":case "e":case "i":case "o":case "u":
                    System.out.println("That's a vowel!");
                    break;
                case "y":
                    System.out.println("That's sometimes a vowel...");
                    break;
                default:
                    System.out.println("That's a consonant");
            }
        }else{
            System.out.println("That's not a letter. Don't be difficult...");
        }
    }

    public static void printInstructions(){
        System.out.println("*************************\n" +
                "1: Even or Odd?\n" +
                "2: Same Spelling?\n" +
                "3: We Hate the Letter 'W'\n" +
                "4: Random Number Generator\n" +
                "5: What's Tomorrow's Date?\n" +
                "6: Every Other Letter\n" +
                "7: Unlucky Number 4\n" +
                "8: Funky Calculator\n" +
                "9: Country Domains\n" +
                "10: Vowel or Consonant?\n" +
                "11: Print These Instructions\n" +
                "0: Quit\n" +
                "*************************");
    }
}
