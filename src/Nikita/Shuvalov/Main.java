package Nikita.Shuvalov;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    //1.Test for 1st

        //System.out.println(isEven(14));
        //System.out.println(isEven(303));
        //System.out.println(isEven(0));

        //2. Test for 2nd

//        System.out.println(isSameWord("Forty", "Farty"));
//        System.out.println(isSameWord("Koala", "Quola"));
//        System.out.println(isSameWord("FIRE", "fire"));
//        System.out.println(isSameWord("water","water"));

        //3. Test for third

//        printUntilW("SeeSaw");
//        printUntilW("Skyward");
//        printUntilW("Whales");
//        printUntilW("Fireflies");

        //4. Test for 4th
//        for (int i=0; i<30; i++ ){
//            System.out.println(randomNumber()+"\n");
//        }

        //5.Test for 5th
        //System.out.println(getNextDate(24,4,1989));
        //System.out.println(getNextDate(31,10,2016));
        //System.out.println(getNextDate(31,12,1999)); //testing y2k
        //System.out.println(getNextDate(40,1,3210)); //testing illegal day
        //System.out.println(getNextDate(5,14, 1445)); //testing illegal month

        //6. Test for 6th
//        System.out.println(omitEveryOther("It was a bright cold day in April"));
//        System.out.println(omitEveryOther("Oceania"));
//        System.out.println(omitEveryOther("Eastasia"));
//        System.out.println(omitEveryOther("Doublethink"));


        //7.Test for 7th
        printAllBut4(100);
        printAllBut4(4);
        printAllBut4(0);
        printAllBut4(5); //test cutoff




//        checkIfVowel();



    }

    //First function of assignment
    public static boolean isEven(int num){
        if (num %2 == 0){
            return true;
        }else {
            return false;
        }
    }

    //Second function of assignment
    public static boolean isSameWord(String firstStr, String secondStr){
        firstStr = firstStr.toLowerCase();
        secondStr = secondStr.toLowerCase();
        if (firstStr.equals(secondStr)){
            return true;
        }else {
            return false;
        }
    }

    //Third function of assignment
    public static void printUntilW(String word){
        int i = 0;
        while (i < word.length()){
            char character = word.toLowerCase().charAt(i);
            if (character != 'w'){
                System.out.println(word.charAt(i));
                i++;
            }else {
                break;
            }
        }
    }

    // Fourth function of assignment
    public static int randomNumber(){
        Random randomGen = new Random();
        int rNum = randomGen.nextInt(100);
        System.out.println(rNum);
        if (rNum>50){
            return rNum;
        }else {
            return -1;
        }

    }

    //Fifth function of assignment
    public static String getNextDate(int day, int month, int year){
        if (month>12){
            return "You entered an invalid month value.Please check your input";
        }
        else{
            int daysInMonth= 30;
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
            if (day>daysInMonth){
                return "There aren't that many days in that month. Please check your input.";
            }else {
                int nextDay = day + 1;
                if (nextDay > daysInMonth) {
                    monthHolder++;
                    nextDay = 1;
                    if (monthHolder > 12) {
                        yearHolder++;
                        monthHolder = 1;
                    }
                }
                String message = "day:" + nextDay + " month:" + monthHolder + " year:" + yearHolder;
                return message;
            }

        }

    }

    // Sixth function of assignment
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
            i++;

        }
        return newSpeak;
    }

    // Seventh function of assignment
    public static void printAllBut4(int num){
        int counter = 1;
        if (num <=5){
            System.out.println("Illegal number; number needs to be greater than 5");
        }else {
            while (num > counter) {
                if (counter != 4) {
                    System.out.println(counter);
                }
                counter++;
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
        if (userInput == null){
            System.out.println("You did not enter anything. Please try again.");
            checkIfVowel();
        }
        try {
            System.out.println(Double.valueOf(userInput)+ " is a numerical value. Please enter a letter.");
            checkIfVowel();
        } catch (Exception invalidType){
            char check = userInput.toLowerCase().charAt(0);
            switch(check){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(check + " is a vowel");
                    break;
                case 'y':
                    System.out.println("Some people may consider \"y\" as a vowel, but those same people may or may not huff glue.");
                default:
                    System.out.println(check + " is a consonant");

            }
        }
        checkIfVowel();

    }


}


//
//        Write a function that asks the user to type in a letter and prints out whether the letter is a vowel or a consonant.
// You may use control flow and multiple conditionals.