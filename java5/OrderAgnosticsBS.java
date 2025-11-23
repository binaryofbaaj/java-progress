package java5;

public class OrderAgnosticsBS {
    static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,4,15,16,18,22,45,89};
        int target = 0;
        int ans = orderAgBS(arr,target);
        System.out.println(ans);
    }

    static int orderAgBS(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
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
                return mid;
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
