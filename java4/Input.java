package java4;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//        arr[3] = 4;
//        arr[4] = 5;

//        System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
//        System.out.println(arr[4]);
//        System.out.println(Arrays.toString(arr));
        //input using for loops
//        for(int i = 0 ; i < arr.length ; i++){
//            arr[i] = in.nextInt();
//        }

//        for(int i = 0 ; i < arr.length ; i++){
//            System.out.println(arr[i]);
//        }

//        for (int j : arr) {//for every element in array , print the element
//            System.out.println(j); //here j represents element in  the array this is known as for each loop
//      array of objects
        String[] str = new String[5];//by default its basically containing the reference variable to the object.
        for(int i = 0 ; i< str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
        }
    }

