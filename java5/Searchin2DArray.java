package java5;

import java.util.Arrays;
import java.util.Scanner;

public class Searchin2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {1,2,3,4},
                {5,6},
                {7,8,9}
        };
        int target  = 7;
//        int[] ans = search(arr,target);   //format of return value {row,col}
//        System.out.println(Arrays.toString(ans));
        int ans = max( arr, target);
        System.out.println(ans);
    }

//    static int[] search(int[][] arr , int target){
//        for(int row = 0; row < arr.length ;row++ ){
//            for(int col = 0; col < arr[row].length; col++){
//                if(arr[row][col] == target){
//                    return new int[]{row,col};
//                }
//            }
//        }
//        return new int[]{-1,-1};
//    }


    static int max(int[][] arr , int target){
        int max = arr[0][0];
        for(int row = 0; row < arr.length ;row++ ){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
