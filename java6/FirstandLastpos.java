package java6;

import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstandLastpos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 7;
        int[] ans = searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1,-1};

        //check for first occurence if target first
        //start
        ans[0] = search(nums,target,true);
        //end

        if(ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
//
//        ans[0] = start;
//        ans[1] = end;

return ans;
    }

    // this function just return the index value of target.

    static int search(int[] nums, int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length -1;
        int ans = -1;

        while(start<=end){
            //find the middle element
            //    int mid = (start + end)/2; //might be s+e/2 may exceed the range of integer in java
            int mid = start +(end-start)/2;

            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start = mid + 1;
            }
            else{
                // potential ans found
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
