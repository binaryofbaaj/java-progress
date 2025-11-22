package java4;

import java.util.Arrays;
import java.util.Scanner;

public class PassingInFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {3 , 4 , 5 , 6};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
