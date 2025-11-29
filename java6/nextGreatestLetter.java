package java6;

import java.util.Scanner;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/?source=submission-ac
public class nextGreatestLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] arr ={'c','f','j'};

        char target = 'k';

         char ans = greatestletter(arr,target);
        System.out.println(ans);
    }

    static char greatestletter(char[] arr,char target ){
        int start = 0;
        int end = arr.length-1;

        while(start<= end){
            int mid = start+(end-start)/2;

            if(arr[mid]<= target){
                start = mid+1;
            }
            else{
                end= mid -1;
            }

        }
        return arr[start%arr.length];
    }
}
