/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Zarin Tasnim
 */

import java.util.Scanner;

class inputs {
    public static void main(String args[]) {
        System.out.print("What is your name? ");
        Scanner input = new Scanner(System.in); //geting user input
        String name = input.next();
        System.out.print("Hello," + name);
        System.out.println(", nice to meet you!");


    }
}