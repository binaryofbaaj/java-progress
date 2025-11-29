package java6;
// https://leetcode.com/problems/peak-index-in-a-mountain-array/
import java.util.Scanner;

public class Mountain {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {0,1,2,3,4,6,4,3,2,1};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while(start < end){
             int mid = start +(end - start)/2;
             if(arr[mid] > arr[mid+1]){
                 //you are in decreasing part of array.
                 //this may be the answer , but look at left.
                 //this is why end != mid -1;
                 end = mid;

             }else{
                 //you are in the ascending part of array.
                 start = mid+1;//because we know that mid +1 is greater than mid element.
             }
        }//in the end , start == end pointing to the largest number because of the 2 checks.
        //here start and end both are trying to find the largest element
        //hence when they point to the same value so it willbe the maximum value.
        return start;
    }
}
