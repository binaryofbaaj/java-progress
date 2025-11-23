package java5;

import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,0,99};
        int target = 11;

        System.out.println(linearSearch(arr,target,3,5));
    }

    static int linearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int i = start; i<= end ;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
