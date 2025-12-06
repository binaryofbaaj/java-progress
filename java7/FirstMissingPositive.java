package java7;
//https://leetcode.com/problems/first-missing-positive/description/
import java.util.Scanner;

public class FirstMissingPositive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {3,4,-1,1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);
    }

    static int firstMissingPositive(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0 && nums[i]<nums.length && nums[i] != nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for first missing number
        for(int j = 0;j<nums.length;j++){
            if(nums[j] != j + 1){
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


}
