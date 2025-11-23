//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
package java5;

import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr ={12,345,2,6,-7896};
    int ans = findNumbers(arr);
        System.out.println(ans);
        System.out.println(digits(0));
    }

    static int findNumbers(int[] nums) {
    int count = 0;
    for(int num :nums){
        if(even(num)){
            count++;
        }
    }

    return count;
    }

    static boolean even(int nums){

        int noOfDigits = digits(nums);
//        if(noOfDigits % 2 == 0){
//            return true;
//        }
//        return false;
        return noOfDigits % 2 == 0;

    }


    static int digits(int num){
        if(num <0){
            num = num * -1;
        }
        if(num == 0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}

