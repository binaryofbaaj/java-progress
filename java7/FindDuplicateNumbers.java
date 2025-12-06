package java7;

import java.util.Scanner;

//https://leetcode.com/problems/find-the-duplicate-number/submissions/1848188600/
public class FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = {1,3,4,2,2};
        int ans = findDuplicate(arr);
        System.out.println(ans);
    }


    static int findDuplicate(int[] nums) {
        int i = 0;
        while(i<nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }
            }else{
                i++;
            }
        }


        return -1;
    }


    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
