package java;
import java.util.Scanner;
public class sum {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2 ;
        System.out.println("Sum = " + sum);
    }
}

//int num1 = scanner.nextFloat();
//int num2 = scanner.nextFloat();
//
//float sum = num1 + num2 ;

//this can happen due to the process of type conversion or type casting.
