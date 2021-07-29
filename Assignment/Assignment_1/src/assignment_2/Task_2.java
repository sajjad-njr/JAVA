package assignment_2;
import java.util.Scanner;

public class Task_2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nums[], count = 0;
        nums = new int[10];

        for (int i = 0; i < 10; i++) {
            nums[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (nums[i] >= 0) {
                count++;
            }
        }
        int neg = 10 - count;
        System.out.println("Positive number = " + count);
        System.out.println("Negative number = " + neg);
    }
}
