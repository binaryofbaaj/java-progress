package java6;
//ceiling of a number

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {-18,-12,-4,0,2,4,15,16,18,22,45,89};
        int target = 89;
int ans = ceilingBS(arr,target);
        System.out.println(ans);
    }
 //return the no of smallest no >= target.
    static int ceilingBS(int[] arr ,int target){
       //but what if the target is greater than the largest element in the array.

        if(target>arr[arr.length-1]){
    return -1;
        }
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
                return arr[mid];
            }

        }
        return arr[start];
    }
}
