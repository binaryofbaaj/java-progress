package java7;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/missing-number/
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,0,2,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    static int missingNumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i]<nums.length &&nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return nums.length;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
