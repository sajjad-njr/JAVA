package oop;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try{
            int a ;
            int b;
             a = input.nextInt();
             b = input.nextInt();

            System.out.println(a+b);
        }catch (Exception e)
        {
            System.out.println("Error");
        }
    }
}
