package com.Mansfera.javadev;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {
    private static List<User> users = new ArrayList<>();
    public static void main(String[] args) {
        boolean appIsRunning = true;

        while (appIsRunning) {
            out.println("Hello and welcome to JavaSystem!");
            Scanner scanner = new Scanner(System.in);
            out.println("1 register;\n" +
                    "2 find user;\n" +
                    "3 remove user;\n" +
                    "4 get all;\n" +
                    "5 login\n"+
                    "6 exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> register();
                case 2 -> findUser();
                case 3 -> removeUser();
                case 4 -> getAll();
                case 5 -> login();
                default -> appIsRunning = false;
            }
        }

    }

    private static void register() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter your username: ");
        String user_name = scanner.nextLine();
        if (users.contains(user_name)) {
            out.println("User already exists!");
            register();
        }
        out.println("Enter your password: ");
        String password = scanner.nextLine();
        out.println("Enter your firstName: ");
        String firstName = scanner.nextLine();
        out.println("Enter your lastName: ");
        String lastName = scanner.nextLine();
        User user = new User(user_name, password, firstName, lastName);
        users.add(user);
        out.println("USER WAS CREATED > "+user.firstName+" "+user.lastName);
    }

    private static void findUser() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter username of user: ");
        String username = scanner.nextLine();
        if (users.contains(username)) {
            out.println("USER EXIST");
        } else {
            out.println("USER DON'T EXIST");
        }

    }

    private static void removeUser() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter username of user: ");
        String username = scanner.nextLine();
        if (users.contains(username) && users.remove(username)){
            out.println("USER WAS REMOVED");
        } else {
            out.println("USER DON'T EXIST");
        }
    }

    private static void getAll() {
        if (users.isEmpty()) {
            out.println("No users found");
        } else {
            for (User user : users) {
                out.println("> "+user);
            }
        }
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);
        out.println("Enter username of user: ");
        String username = scanner.nextLine();
    }

    private static void getInfo(String username) {

    }
}
