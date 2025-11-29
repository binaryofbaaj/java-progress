package java6;

import java.util.Scanner;

public class floor {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {-18,-12,-4,0,2,4,15,16,18,22,45,89};
        int target = 17;
        int ans = floorBS(arr,target);
        System.out.println(ans);
    }
//return the index greates number <= target.
    static int floorBS(int[] arr ,int target){
        int start = 0;
        int end = arr.length -1;


        while(start<=end){
            int mid = start + (end - start)/2;
            if(target> arr[mid]){
                start = mid+1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return mid;
            }

        }
        return arr[end];
    }
}

