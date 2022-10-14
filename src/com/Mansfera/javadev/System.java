package com.Mansfera.javadev;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.out;

public class System {
    public static void register(String[] args) {
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
            user user1 = new user(userID, username, password, firstName, lastname);
            out.println("Successfully registered in JavaSystem!");

            out.println("Okay now login time!");
            Scanner login = new Scanner(System.in);
            out.println("username:");
            String user_name = login.nextLine();
            if (Objects.equals(user_name, user1.username)) {
                Scanner login1 = new Scanner(System.in);
                out.println("password: ");
                String user_pass = login1.nextLine();
                if (user_pass == user1.password) {
                    out.println("Login successful!");
                } else {out.println("Wrong password");}
            } else {out.println("No user found");}
        } catch (Exception e) {
            out.println("Something went wrong... please try something like");
            out.println("1 user pass1234 Igor Smith");
            register();
        }
    }
}