package com.company;

public class Hw2 {

    public static void main(String[] args) {

    }

    static void task1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) array[i] = 0;
            else if (array[i] == 0) array[i] = 1;
            }
        }


    static void task2 () {
        int[] array = new int[8];
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] + 3;
        }
    }


    static void task3 () {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8 , 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array [i] *= 2;
        }
    }


    static void task4 (int [][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            matrix [i][i] = 1;
            matrix [i][matrix.length - i - 1] = 1;
        }
        printArray(matrix);
    }

    static void printArray (int [][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    static void task5(int[] values) {
        System.out.println("max: " + findMax(values));
        System.out.println("min: " + findMin(values));
    }

    static int findMax(int[] values) {
        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    static int findMin(int[] values) {
        int min = values[0];
        for (int i = 1; i < values.length; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
}
