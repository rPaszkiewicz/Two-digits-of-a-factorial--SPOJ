package com.TwoDigitFactorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.println("\n enter number:");
            int number = reader.nextInt();

            if (number==0)
                break;
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            StringBuilder sb = new StringBuilder().append(factorial);

            if (sb.length() >= 2) {
                for (int i = 0; i < sb.length(); i++)
                    System.out.print(sb.charAt(i) + " ");
            } else {
                System.out.println(0 + " " + sb);
            }
        }
    }
}
