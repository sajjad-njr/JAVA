package oop;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user First name :");
        String userFirstName = scanner.nextLine();

        System.out.print("Enter user Last name :");
        String userLastName = scanner.nextLine();

        System.out.print("Enter user Password :");
        String passWord = scanner.nextLine();

        System.out.println("*****************************************");
        System.out.println("For Log In Please Provide the details");


        System.out.print("Enter user Last name :");
        String LogInName = scanner.nextLine();

        System.out.println("Enter user Password :");
        String LogInPassWord = scanner.nextLine();

        if(userLastName.equals(LogInName)&& passWord.equals(LogInPassWord))
        {
            System.out.println("User Successfully Log in");
            System.out.println("***************----------------||||||||||||||?????///>>>>>>>>>>>");
        }
        else
        {

        }
/*
        try{
            if(userLastName.equals(LogInName)&& passWord.equals(LogInPassWord))
            {
                System.out.println("User Successfully Log in");
                System.out.println("***************----------------||||||||||||||?????///>>>>>>>>>>>");
            }


        }catch (Exception e)
        {
            System.out.println("In valid User Name of Password");
        }
        */

    }
}
