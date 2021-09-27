/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("How many people? ");
        Scanner scanner = new Scanner(System.in);
        int people = scanner.nextInt();

        System.out.print("How many pizza do you have? ");
        int pizzas = scanner.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices = scanner.nextInt();

        int totalSlices = slices * pizzas;

        System.out.println(people + " people with "+ pizzas + " ("+ totalSlices + " slices)");

        System.out.println("Each person gets "+ (totalSlices/people) + " pieces of pizza.");

        System.out.println("There are "+ totalSlices%people + " leftover pieces.");
        scanner.close();
    }
}
