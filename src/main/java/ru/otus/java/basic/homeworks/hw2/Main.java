package ru.otus.java.basic.homeworks.hw2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] arrays = {{1, 2, 3}, {14, -7, 7, 7}, {1}};
        int[] array = {2, 2, 2, 2, 2, 2, 2,2};

        //test comment for commit 4
        //test comment for commit 5
        sumArrays(arrays);
        dotEqualityExamination(array);
        arraysOrderlinessExamination(array);
        reverseArray(array);

    }

    public static void sumArrays(int[]... arrays) {
        int maxLength = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i].length > maxLength) maxLength = arrays[i].length;
        }
        int[] resultArray = new int[maxLength];
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                resultArray[j] += arrays[i][j];
            }
        }
        System.out.println(Arrays.toString(resultArray));
    }

    public static boolean dotEqualityExamination(int[] array) {
        int leftSum = array[0];
        int rightSum = 0;
        for (int i = array.length-1; i > 0; i--) {
            rightSum += array[i];
        }
        if (rightSum%2 != 0) {
            System.out.println("точка отсутствует");
            return false;
        }
        for (int i = 0; i < array.length-1; i++) {
            if (leftSum == rightSum) {
                System.out.println("точка есть");
                return true;
            }
            leftSum+=array[i+1];
            rightSum-=array[i+1];
        }
        System.out.println("точка отсутствует");
        return false;
    }

    public static void arraysOrderlinessExamination(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите : \n\"+\", если нужно проверить массив по возрастанию" +
                "\n\"-\", если нужно проверить массив по убыванию");
        String orderlinessTipe = scanner.next();
        boolean result = true;

        if (orderlinessTipe.equals("+")) {
            for (int i = 0; i < array.length - 1; i++) {
                int buf;
                if (array[i] > array[i + 1]) {
                    result = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < array.length - 1; i++) {
                int buf;
                if (array[i] < array[i + 1]) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(result ? "порядок есть" : "порядок отсутствует");
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
