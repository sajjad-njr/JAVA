package assignment_2;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[];
        //new int[10];
        System.out.print("Enter the number of elements: ");
        int n;
        n = input.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int count = 0, data = input.nextInt();

        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                count++;
            }
        }
        System.out.print(data + " occurred " + count + " times in the array.");
    }
}
