package ru.otus.java.basic.homeworks.hw1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        boolean increment;

        System.out.println("введите число от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int methodMumber = scanner.nextInt();

        switch (methodMumber) {
            case 1:
                greetings();
                break;
            case 2:
                a = generateInt(-100, 100);
                b = generateInt(-100, 100);
                c = generateInt(-100, 100);
                checkSign(a, b, c);
                break;
            case 3:
                a = generateInt(0, 30);
                selectColor(a);
                break;
            case 4:
                a = generateInt(-100, 100);
                b = generateInt(-100, 100);
                compareNumbers(a, b);
                break;
            case 5:
                a = generateInt(-100, 100);
                b = generateInt(-100, 100);
                c = generateInt(0, 2);
                increment = (c == 1 ? true : false);
                addOrSubtract(a, b, increment);
                break;
            default:
                System.out.println("введено неверное число");
        }
    }

    //(1) Реализуйте метод greetings(), который при вызове должен отпечатать в столбец 4 слова:
    // Hello, World, from, Java;
    public static void greetings() {
        System.out.println("Hello,\nWorld,\nfrom,\nJava");
    }

    //(2) Реализуйте метод checkSign(..), принимающий в качестве аргументов 3 int переменные
    // a, b и c. Метод должен посчитать их сумму, и если она больше или равна 0,
    // то вывести в консоль сообщение “Сумма положительная”,
    // в противном случае - “Сумма отрицательная”
    public static void checkSign(int a, int b, int c) {
        int sum = a + b + c;
        if (sum >= 0) {
            System.out.println("Сумма положительная (либо равна 0)");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //(3) Реализуйте метод selectColor() в теле которого задайте int переменную data с любым начальным значением.
    // Если data меньше 10 включительно, то в консоль должно быть выведено сообщение “Красный”,
    // если от 10 до 20 включительно, то “Желтый”, если больше 20 - “Зеленый”;
    public static void selectColor(int data) {
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    //(4) Реализуйте метод compareNumbers(), в теле которого объявите две int переменные a и b
    // с любыми начальными значениями. Если a больше или равно b, то необходимо вывести
    // в консоль сообщение “a >= b”, в противном случае “a < b”;
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    //(5) Создайте метод addOrSubtractAndPrint(int initValue, int delta, boolean increment).
    // Если increment = true, то метод должен к initValue прибавить delta и отпечатать
    // в консоль результат, в противном случае - вычесть;
    public static void addOrSubtract(int initValue, int delta, boolean increment) {
        if (increment) {
            initValue += delta;
            System.out.println(initValue);
        } else {
            initValue -= delta;
            System.out.println(initValue);
        }
    }

    // randomizer
    //  min <= result < max
    public static int generateInt(int min, int max) {
        return min + (int) (Math.random() * (max - min));
    }

}
