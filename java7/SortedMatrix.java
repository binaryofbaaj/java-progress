package java7;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {{1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }

    //search in the rows provided between the columns provided.
static int[] BinarySearch(int[][] matrix , int row ,int cstart, int cend,int target){
        while(cstart <= cend){
            int mid = cstart + (cend -cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cstart = mid + 1;
            }else{
                cend = mid - 1;
            }
        }
        return new int[]{-1,-1};
}
    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length;  // be cautious over here

        if(rows == 1){
            return BinarySearch(matrix,0,0, cols-1,target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols/2;
        // run the loop till 2 rows are remaining.
        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }
        //now we have 2 rows.
        //check whether the target is in the columns of 2 rows.
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        if(matrix[rStart+1][cMid] == target){
            return new int[]{rStart+1,cMid};
        }
        //search in 1st half 2nd half 3rd half 4th half
        if (target <= matrix[rStart][cMid-1]){
            return BinarySearch(matrix,rStart,0,cMid-1,target);
        }
        if (target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1] ){
            return BinarySearch(matrix,rStart,cMid+1,cols-1,target);
        }
        if (target <= matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix,rStart + 1,0,cMid-1,target);

        }
        if (target >= matrix[rStart+1][cMid-1]){
            return BinarySearch(matrix,rStart + 1,cMid+1,cols - 1,target);
        }
        return new int[]{-1,-1};
    }
}
