package com.Mansfera.javadev;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class main {
    public static void register() {
        out.println("Hello and welcome to JavaSystem!");
        out.println("Please register to use system.");

        Scanner input = new Scanner(System.in);
        out.println("Please enter your userID: ");
        int userID = input.nextInt();

        Scanner input1 = new Scanner(System.in);
        out.println("Please enter your username: ");
        String username = input1.nextLine();

        Scanner input2 = new Scanner(System.in);
        out.println("Please enter your password: ");
        String password = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        out.println("Please enter your first name: ");
        String firstName = input3.nextLine();

        Scanner input4 = new Scanner(System.in);
        out.println("Please enter your last name: ");
        String lastname = input4.nextLine();

        try {
            user systemUser = new user(userID, username, password, firstName, lastname);
            out.println("Successfully registered in JavaSystem!");
            login();
        } catch (Exception e) {
            out.println("Something went wrong... please try something like");
            out.println("1 user pass1234 Igor Smith");
            register();
        }
    }
    public static void login() {
        out.println("Okay now login time!");
        Scanner login = new Scanner(System.in);

    }
}