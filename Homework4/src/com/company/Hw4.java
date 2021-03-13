package com.company;

import java.util.Random;
import java.util.Scanner;

public class Hw4 {

    public static void main(String[] args) {
        start();
    }
    static void start() {
        char[][] field = emptyField();
        drawField(field);

        while (true) {
            doPlayerMove(field);
            drawField(field);
            if (isWin(field, 'X')) {
                System.out.println("Congrats!!! You are winner!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("That's draw. Game is finished");
                break;
            }

            doAIMove(field);
            drawField(field);
            if (isWin(field, 'O')) {
                System.out.println("Sorry!!! You are looser!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("That's draw. Game is finished");
                break;
            }
        }
    }

    static boolean isDraw(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (isFreeCell(field, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    static boolean isWin(char[][] field, char symbol) {
        int countVertical;
        int countHorizontal;
        int countMainDiagonal = 0;
        int countSecondaryDiagonal = 0;

        for (int i = 0; i < field.length; i++) {
            countVertical = 0;
            countHorizontal = 0;
            for (int j = 0; j < field.length; j++) {

                if (field[i][j] == symbol) {
                    countHorizontal++;
                    if (countHorizontal == field.length) return true;
                }

                if (field[j][i] == symbol) {
                    countVertical++;
                    if (countVertical == field.length) return true;
                }
            }
                if (field[i][i] == symbol) {
                    countMainDiagonal++;
                    if (countMainDiagonal == field.length) return true;
                }

                if (field[i][field.length - i - 1] == symbol) {
                    countSecondaryDiagonal++;
                    if (countSecondaryDiagonal == field.length) return true;
                }
        }
        return false;
    }

    static void doPlayerMove(char[][] field) {
        int h, v;

        do {
            h = getCoordinate(field.length, 'h');
            v = getCoordinate(field.length, 'v');
        } while (isOccupiedCell(field, h, v));

        field[h][v] = 'X';
    }

    static int getCoordinate(int length, char symbol) {
        Scanner scanner = new Scanner(System.in);
        int coordinate;

        do {
            System.out.printf("Please input %s-value ...%n", symbol);
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate >= length);

        return coordinate;
    }

    static void doAIMove(char[][] field) {
        Random random = new Random();
        int h, v;

        do {
            h = random.nextInt(3);
            v = random.nextInt(3);
        } while (isOccupiedCell(field, h, v));

        field[h][v] = 'O';
    }

    static boolean isFreeCell(char[][] field, int h, int v) {
        return !isOccupiedCell(field, h, v);
    }

    static boolean isOccupiedCell(char[][] field, int h, int v) {
        return field[h][v] != '-';
    }

    static char[][] emptyField() {
        return new char[][]{
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };
    }

    static void drawField(char[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
