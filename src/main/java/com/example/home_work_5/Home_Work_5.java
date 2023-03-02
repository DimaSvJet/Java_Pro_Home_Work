package com.example.home_work_5;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Home_Work_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter your text: ");
        String yourString = scanner.nextLine();
        System.out.print("Enter your symbol: ");
        String yourCharacter = sc1.nextLine();
        int amountSymbols = findSymbolOccurance1(yourString,yourCharacter);
        System.out.println("Total same symbols: "+amountSymbols);
       // int countSymbol = findSymbolOccurance2(yourString,yourCharacter);//It's my the second version, but
        //something wrong, please HELP!!!
       // System.out.println("Amount of symbol: "+countSymbol);

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter your next text: ");
        String nextText = sc2.nextLine();
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter your check text: ");
        String checkText = sc3.nextLine();
        int indexFirstSymbol = findWordPosition(nextText,checkText);
        System.out.println("The index of the first symbol: "+indexFirstSymbol);
        System.out.println("The revers your text: "+stringReverse(nextText));
        System.out.println("Your text is Palindrome: " + isPalindrome(nextText));

        Random random = new Random();
        String [] secretWord = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        Scanner sc4 = new Scanner(System.in);

        int indexElement = random.nextInt(secretWord.length);
        String randomWord = secretWord[indexElement];

        //System.out.println(indexElement);
        //System.out.println(secretWord[indexElement]);
        int account = 1;
        while ((account-1)<randomWord.length()) {
            System.out.println("Round "+account);
            System.out.print("Enter your word (vegetable or fruit): ");
            String yourRandomWord = sc4.nextLine().trim().toLowerCase();
            if (yourRandomWord.equals(randomWord)) {
                System.out.println("Congratulation!!! You are Winner! ");
                break;
            } else {
                System.out.println("Wrong! Try again!");
                account++;
                String checkWorld = "###############";
                System.out.println(randomWord.substring(0,(account-1))+checkWorld.substring(account-1));
                }
            }
        System.out.println("Unfortunately, you are lose! Don't wary! Next time you get lucky!");
        }


    public static int findSymbolOccurance1(String yourString,String yourCharacter) {
        int amountChracter = 0;
        for (int i = 0; i < yourString.length(); i++) {
            if ((String.valueOf(yourString.charAt(i))).equals(yourCharacter)){
               amountChracter++;
            }
        }

    return amountChracter;

    }
    public static int findSymbolOccurance2(String yourString,String yourCharacter){
        char yourChar = yourCharacter.charAt(0);
        int numerChar = 0;
        int count = 0;
        int numer;

        do {int indexC = yourString.indexOf(yourChar,numerChar); //It's every time == 0. Something wrong!
            System.out.println(indexC);
            numer = indexC;
            if (indexC>0) count++; numerChar=indexC;
        } while (numer!= -1);
        return count;
    }

    public static int findWordPosition(String nextText, String checkText) {

        int indexFirst;
        if (nextText.contains(checkText) ) {
            indexFirst = nextText.indexOf(checkText);
            return indexFirst;
        } return -1;
    }
    public static String stringReverse(String nextText) {

        return "\u202E" + nextText;
    }

    public static boolean isPalindrome (String nextText) {
        String youStr = nextText.trim().toUpperCase(Locale.ROOT);
        System.out.println("Orig.text: "+youStr);
        String youRevStr = stringReverse(nextText.trim().toUpperCase()).substring(1);//I don't realize,
        // why youRevStr.charAt(0) == 0, that's why I use .substring/ I spent a lot of time to find that ((((((((((
        System.out.println("Rev.text: "+youRevStr);
        return youStr.equalsIgnoreCase(youRevStr);

    }


}
