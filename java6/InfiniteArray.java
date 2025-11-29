package java6;
//https://www.geeksforgeeks.org/dsa/find-position-element-sorted-array-infinite-numbers/
import java.util.Scanner;

public class InfiniteArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160,170};
    int target = 10;
        System.out.println(FindingRange(arr,target));
    }
    static int FindingRange(int[] arr,int target){
        //first find the range.
        int start = 0;
        int end = 1;
        //condition for the target to lie in the range.
        while(target > arr[end]){
            int newStart = end+1;
            //double the box value.
            //end = previous end + sizeofbox*2;//it is coming from e-(s-1) => e-s+1
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){


        while(start<=end){
            //find the middle element
            //    int mid = (start + end)/2; //might be s+e/2 may exceed the range of integer in java
            int mid = start +(end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                //arr found
                return mid;
            }
        }
        return -1;
    }
}
