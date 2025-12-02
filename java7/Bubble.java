package java7;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr){
        //run the steps (n-1) times.
        boolean swapped;
        for(int i=0; i<arr.length ; i++){
            swapped = false;
            // for each step, max item will come at the last respective index.
            for(int j = 1; j < arr.length - i  ;j++){
                //swap if the item is smaller than the previous item.
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swapped at the last value of i , it means the array is sorted hence stop the program
            if(!swapped){// !false = true
                break;
            }
        }
    }
}
