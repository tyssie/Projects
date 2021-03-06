package com.company;

import java.util.Random;
import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) {

    }

    static void guessNumber() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int playerNumber;

        while (true) {
            int flag = 0;
            int randNumber = random.nextInt(10);
            System.out.println("Guess number is starting...");
            System.out.println("Enter a number from 0 to 9");

            while (flag < 3) {
                playerNumber = scanner.nextInt();

                if (randNumber == playerNumber) {
                    System.out.println("Congrats!!! You are winner!");
                    break;
                } else {
                    String message = randNumber > playerNumber ? "Bigger than" : "Less than";
                    System.out.println(message);
                }
                flag++;
                if (flag == 3) System.out.println("You loss");
            }


            System.out.println("Do you want to start new game?... Yes - press any number / No - press 0 ");
            int isNewGame = scanner.nextInt();
            if (isNewGame == 0) {
                System.out.println("Thanks! See you soon.");
                break;
            }
        }
    }



    static void guessWord() {
        Random random = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int indWord = random.nextInt(words.length - 1);
        String word = words[indWord];

        System.out.println("Try to guess the word!");
        //System.out.println(word); - строчка для проверки работы программы//

        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Your answer...: (if u wanna exit, press Enter)");
            String answer = scanner.nextLine();

            if (answer.equals("")) break;
            else if (word.equals(answer)) {
                System.out.println("You right, congrats!!!");
                break;
            }

            char[] charsAnswer = answer.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                if (i >= charsAnswer.length) break;
                if (word.charAt(i) != charsAnswer[i]) charsAnswer[i] = '#';
                System.out.print(charsAnswer[i]);
            }
            System.out.print("########");

            for (int j = word.length(); j < answer.length(); j++) {
                charsAnswer[j] = '#';
                System.out.print(charsAnswer[j]);
            }
            System.out.println();

        }
        while (true);
    }
}
