package java3;

import java.util.Scanner;

public class swap {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int temp = a;
         a = b;
         b = temp;

       System.out.println( a + " " + b );
    }


    static void swap(int num1,int num2){
       int temp = num1;
       num1 = num2;
       num2 = temp;
       //this change will only be valid in this function scope only.
    }
}

//values initialized inn block will remian in block we cannot access them outside that block.
//if something is initialized outside the block it cannot be initialized again
// but can be used modified etc in the block or in that scope

