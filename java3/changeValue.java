package java3;

import java.util.Arrays;
import java.util.Scanner;

public class changeValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] arr = {1,2,3,4,5};
    change(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void change(int[] nums){
    nums[0] = 99;   //if you make a change via this reference variable ,same object will be changed.
    }


}
