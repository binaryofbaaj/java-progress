package java5;

import java.util.Scanner;

public class linSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] arr = { 23,45,67,89,12,34};
    int target = 67;
    boolean ans = linearSearch(arr,target);
        System.out.println(ans);

        }

       // search in the array
//    static int linearSearch(int[] arr,int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        //run a for loop.
//
//        for(int index = 0; index < arr.length ;index++){
//            int element = arr[index];
//            if(element == target){
//                return index;
//            }
//        }
////this line will execute if none of the above return statement has executed
//        //hence the target is not found;
//        return -1;
//    }


//    static int linearSearch(int[] arr,int target){
//        if(arr.length == 0){
//            return -1;
//        }
//        //run a for loop.
//
//        for(int index = 0; index < arr.length ;index++){
//            int element = arr[index];
//            if(element == target){
//                return element;
//            }
//        }
////this line will execute if none of the above return statement has executed
//        //hence the target is not found;
//        return -1;
//    }



static boolean linearSearch(int[] arr,int target){
    if(arr.length == 0){
        return false;
    }
    //run a for loop.

    for(int index = 0; index < arr.length ;index++){
        int element = arr[index];
        if(element == target){
            return true;
        }
    }
//this line will execute if none of the above return statement has executed
    //hence the target is not found;
    return false;
}
}
