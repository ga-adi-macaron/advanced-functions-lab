package com.jlieblich;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(evenOdd(67));
        System.out.println(compareStrings("UPPERCASE", "uppercase"));
        stopAtW("This is going to work!");
        System.out.println(randomAbove50());
        System.out.println(datePlusOne(31, 12, 1999));
        System.out.println(everyOtherLetter("First"));
        System.out.println(everyOtherLetter("Second"));
        notFour(12);
        notFour(3);
        System.out.println(compareAndSum(5, 5));
        System.out.println(compareAndSum(5, 4));
        System.out.println(countryDomain("us"));
        System.out.println(countryDomain("DE"));
        System.out.println(countryDomain("uk"));
        vowelChecker();
    }

    public static boolean evenOdd(int num) {
        return num%2 == 0;
    }

    public static boolean compareStrings(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        } else if(a.equalsIgnoreCase(b)) {
            return true;
        }
        return false;
    }

    public static void stopAtW(String str) {
        if(str.charAt(0) == 'w'||str.charAt(0) == 'W') {
            System.out.println("End of function");
            return;
        } else if(str.length() == 0) {
            System.out.println("Error: Empty String value");
            return;
        } else {
            System.out.println(str.charAt(0));
            stopAtW(str.substring(1, str.length()));
        }
    }

    public static double randomAbove50() {
        double num = Math.random();
        if(num > 50) {
            return num;
        }
        return -1;
    }

    public static String datePlusOne(int day, int month, int year) {
        int newDay = day+1;
        int newMonth = month+1;
        int newYear = year+1;
        switch (month) {
            case 12:
                if(day == 31) {
                    return "Day: 1 Month: 1 Year: " + newYear;
                }
            case 9:
                if(day == 30) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 11:
                if(day == 30) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 10:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 8:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 7:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 6:
                if(day == 30) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 5:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 4:
                if(day == 30) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 3:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 2:
                if(year%4 == 0 && day == 29) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                } else if(day == 28) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            case 1:
                if(day == 31) {
                    return "Day: 1 Month: " + newMonth + " Year: " + year;
                }
            default:
                return "Day: " + newDay + " Month: " + month + " Year: " + year;
        }
    }

    public static String everyOtherLetter(String str) {
        char[] result = new char[(str.length()/2)+1];
        int count = 0;
        for(int i=0; i < str.length(); i++) {
            if(i%2 == 0) {
                result[count] = str.charAt(i);
            }
        }
        return result.toString();
    }

    public static void notFour(int num) {
        int i = 1;
        if(num < 5) {
            System.out.println("Number must be greater than 5");
            return;
        }
        while(i <= num) {
            if(i == 4) {
                //do nothing
            } else {
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();
    }

    public static int compareAndSum(int x, int y) {
        if(x == y) {
            return (x+2)*2;
        } else {
            return x+y+2;
        }
    }

    public static String countryDomain(String str) {
        String country = str.toLowerCase();
        switch(country) {
            case "us":
                return "United States";
            case "de":
                return "Germany";
            case "hu":
                return "Hungary";
            default:
                return "Unkown";
        }
    }

    public static void vowelChecker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a single letter. If you enter more, only the first letter will count");
        char a = sc.nextLine().charAt(0);
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for(int i=0; i < vowels.length; i++) {
            if(a == vowels[i]) {
                System.out.println("Character " + a + " is a vowel.");
                return;
            }
        }
        System.out.println("Character " + a + " is a consonant");
    }
}
