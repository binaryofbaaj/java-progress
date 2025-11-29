package java6;

import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }

    public static int splitArray(int[] nums, int k) {
    int start = 0;
    int end = 0;
    for(int i=0;i<nums.length;i++){
        start = Math.max(start,nums[i]);  // in the end of this, start will be having the max value in the array.
        end += nums[i];
    }


    while(start<end){
        int mid = start + (end - start)/2;

        //calculate how many peices you can divide this in with this maxsum
        int sum = 0;
        int peices = 1;
        for(int num : nums){
            if(sum + num >mid){
                //you cannot add this in this subarray,make new one.
                //say you add this num in new subarray,then that subaaray is sum == num;
                sum = num;
                peices++;
            }
            else{
                sum += num;
            }
        }
        if(peices > k){
            start = mid + 1;
        }
        else{
            end = mid;
        }

    }

    return end;//as start==end in the last;
    }
}
