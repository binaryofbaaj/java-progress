package java7;
//https://leetcode.com/problems/set-mismatch/submissions/1848204135/
import java.util.Arrays;
import java.util.Scanner;

public class SetMismatch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1, 2, 2, 4}; // duplicate 2, missing 3 -> expected [2,3]
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i]<nums.length &&nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j + 1){
                return new int[]{nums[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }


    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
