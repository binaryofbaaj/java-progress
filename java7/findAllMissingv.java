package java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class findAllMissingv {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missing = findDisappearedNumbers(arr);
        System.out.println(missing);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }

        //just find missing numbers.
        List<Integer> ans = new ArrayList<>();

        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
