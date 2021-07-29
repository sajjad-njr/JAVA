package assignment_2;

import java.util.Scanner;

public class Task_3 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int data = input.nextInt();
       
        int row, colum;
        for (row =  1; row <= data; row++) {
            for (colum = 1; colum <= data - row; colum++) {

                System.out.print(" ");
            }
            for (colum = 1; colum <= row; colum++) {

                System.out.printf("%d", colum);
            }
            System.out.println("");
        }
    }
}
 
