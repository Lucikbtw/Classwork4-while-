package com.samsung;

import java.util.Scanner;

public class Classwork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isExit = false;
        while (!isExit) {

            System.out.println("Введите 2 значения: ");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Введите один из оператор ( + - / % ^ *): ");

            char cs = sc.next().charAt(0);


            switch (cs) {
                case '+':
                    System.out.println(a + b);
                    break;
                case '-':
                    System.out.println(a - b);
                    break;
                case '/':
                    System.out.println(a / b);
                    break;
                case '%':
                    System.out.println(a % b);
                    break;
                case '*':
                    System.out.println(a * b);
                    break;
                case 'e':
                    isExit = true;
                default:
                    System.out.println("Спасибо за работу");
            }

        }

    }
}
