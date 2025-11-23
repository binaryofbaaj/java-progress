package java5;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={-1,3,4,5,9,1};
        System.out.println(min(arr));
    }

    static int min(int[] arr){
        int min = arr[0];
        for(int i = 1; i<arr.length ;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
