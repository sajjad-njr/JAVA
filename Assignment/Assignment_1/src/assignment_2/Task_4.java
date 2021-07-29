 
package assignment_2;
 
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.print("Enter first number = ");
        num1 = input.nextInt();
        
        System.out.print("Enter second number = ");
        num2 = input.nextInt();
        
        System.out.println("\n1. Addition (+)");
        System.out.println("2. Substraction (-) ");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        
        int option ;
         
        System.out.print("Enter operation nummber = ");
        option = input.nextInt();
        
        switch (option) {
            case 1:
                {
                    int out = num1 + num2;
                    System.out.println("\nThe result is "+out);
                    break;
                }
            case 2:
                {
                    int out = num1 - num2;
                    System.out.println("\nThe result is "+out);
                    break;
                }
            case 3:
                {
                    int out = num1 * num2;
                    System.out.println("The result is "+out);
                    break;
                }
            case 4:
                {
                    float out = (float) num1 / num2;
                    System.out.println("\nThe result is "+out);
                    break;
                }
            default:
                System.out.println("\nWrong Input");
                break;
        }
        
    }
}
