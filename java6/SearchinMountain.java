package java6;
//https://leetcode.com/problems/find-in-mountain-array/description/
import java.util.Scanner;

public class SearchinMountain {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] arr = {0,1,2,3,4,5,6,9,8,6,5,3,2,1};
    int target = 9;
    int ans = search(arr,target);
        System.out.println(ans);
    }
static int search(int[] arr,int target){
int peak = peakIndexInMountainArray(arr);
int firstTry = orderAgBS(arr,target,0,peak);
if(firstTry!= -1) return firstTry;
return orderAgBS(arr,target,peak+1,arr.length -1);
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
                end = arr[mid];

            }else{
                //you are in the ascending part of array.
                start = mid+1;//because we know that mid +1 is greater than mid element.
            }
        }//in the end , start == end pointing to the largest number because of the 2 checks.
        //here start and end both are trying to find the largest element
        //hence when they point to the same value so it willbe the maximum value.
        return arr[start];
    }

    static int orderAgBS(int[] arr, int target,int start,int end){

//find whether the array is sorted in ascending or descending.
        boolean isAsc = arr[start] < arr[end];
//        if(arr[start]<arr[end]){
//            isAsc = true;
//        }else{
//            isAsc = false;
//        }



        while(start<=end){
            //find the middle element
            //    int mid = (start + end)/2; //might be s+e/2 may exceed the range of integer in java
            int mid = start +(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }
            if(isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
        }


        return -1;
    }
}
