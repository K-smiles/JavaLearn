package com.chelu.assign;

import static com.chelu.assign.Util.scanner;

public class App {

    public static void main(String[] args) {
        menu();
    }

    public static void menu()
    {
        System.out.println("Welcome to Monash Rental Space\n" +
                "Place to Find Your Ideal Residence!\n");
        System.out.println("\t(1) Sign in\n" +
                "\t(2) Log in\n" +
                "\t(3) Quit\n");
        System.out.println("\n" +
                "Please type in your option (number):");
        Boolean flag = true;
        while(flag)
        {
            String option = scanner.nextLine();  // Read user input
            switch (option){
                case "1":
                    System.out.println("sign in");
                    break;
                case "2":
                    System.out.println("log in");
                    Tenant.Login();
                    break;
                case "3":
                    System.out.println("exit");
                    flag = false;
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
    }
}
