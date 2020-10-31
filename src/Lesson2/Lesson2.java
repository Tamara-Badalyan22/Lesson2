package Lesson2;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.console;

public class Lesson2 {
    public static void main(String[] args) throws IOException {
        //Task1 -> Create an array and fill it with 2 number.
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Task2 -> Create an array and fill it with numbers from 1:1000.
//        int[] array = new int[1000];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i + 1;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();

        //Task3 -> Create an array and fill it with odd numbers from -20:20
//        int[] array = new int[20];
//        for (int i = 0, j = -19; i < array.length; i++, j += 2) {
//            array[i] = j;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();

        //Task4 -> Create an array and fill it. Print all elements which can be divided by 5.
//        int count = 0;
//        Random randNumber = new Random();
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = randNumber.nextInt(50);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Elements which can be divided by 5 :");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 5 == 0) {
//                System.out.print(array[i] + " ");
//                count++;
//            }
//        }
//        if (count == 0)
//            System.out.println("None");
//        System.out.println();

        //Task5 -> Create an array and fill it. Print all elements which are between 24.12 and 467.23.
//        int count = 0;
//        Random randNumber = new Random();
//        double[] array = {11.2,25.3,153.2,2.8,563.56};
//        System.out.println("All elements which are between 24.12 and 467.23 :");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] > 24.12 && array[i] < 467.23) {
//                System.out.print(array[i] + " ");
//                count++;
//            }
//        }
//        if (count == 0)
//            System.out.println("None");
//        System.out.println();

        //Task6 -> Create an array and fill it. Print count of elements which can be divided by 2.
//        int count = 0;
//        Random randNumber = new Random();
//        int[] array = new int[10];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = randNumber.nextInt(50);
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        System.out.println("Elements which can be divided by 2 :");
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 == 0) {
//                System.out.print(array[i] + " ");
//                count++;
//            }
//        }
//        System.out.println("\nCount of elements : " + count);
//        System.out.println();

        //Task7 -> Given an integer, 0< N < 21 , print its first 10 multiples.
        //QUESTIONS -> C#-um Tryparse funkcia ka exception-ic xusapelu hamar,stex chka?
        // Nayeci kar grac vor menk petqa sarqenk patrasti chka:)
        //3 tarberak kar console-ic kardalu,vorna aveli lav ogtagorcel?

//        Scanner in = new Scanner(System.in);
//        int number = Integer.parseInt(in.nextLine());
//        if (number > 0 && number < 21) {
//            for (int i = 1; i < 11; i++) {
//                System.out.println(number + " x " + i + " = " + (number * i));
//            }
//        }

    }
}
