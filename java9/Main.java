package java9;

public class Main {
    public static void main(String[] args) {
  //  pattern2(4);
    //pattern1(4);
    //pattern3(5);
   // pattern4(5);
       // pattern6(5);
//        pattern28(5);
//        pattern30(5);
//        pattern17(5);
        pattern31(4);

    }

    static void pattern2(int n){
        for(int row = 1;row <= n ; row++){
            //for every row run the col.
            for(int col = 1; col <= row ;col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern1(int n){
        for(int row = 1;row <= n ; row++){
            //for every row run the col.
            for(int col = 1; col <= n ;col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int row = 0;row < n ; row++){
            //for every row run the col.
            for(int col = 1; col <= n-row ;col++ ){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern4(int n){
        for(int row = 1;row <= n ; row++){
            //for every row run the col.
            for(int col = 1; col <= row ;col++ ){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int row = 1; row <= 2 * n - 1 ;row++){
          //  int totalcolsinrow = row > n ? 2 * n - row : row;
            int totalcolsinrow = 0;
            if(row > n){
                totalcolsinrow = 2 * n - row;
            }
            else{
                totalcolsinrow = row;
            }
            for(int col = 1; col <= totalcolsinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern28(int n){
        for(int row = 1; row <= 2 * n - 1 ;row++){
            //  int totalcolsinrow = row > n ? 2 * n - row : row;
            int totalcolsinrow = 0;
            if(row > n){
                totalcolsinrow = 2 * n - row;
            }
            else{
                totalcolsinrow = row;
            }

            int noOfSpaces = n-totalcolsinrow;
            for(int s = 0 ;s < noOfSpaces;s++ ){
                System.out.print(" ");
            }
            for(int col = 1; col <= totalcolsinrow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
//whenever there are number patterns try not to use o based indexing use numbers from 1 to directly use them in patterns.

    static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 0;s<n-row;s++){
                System.out.print("  ");
            }
            for(int col = row ; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2;col <= row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    static void pattern17(int n){
        for(int row = 1; row <= 2*n ; row++){
            int totalcolsinrow = 0;
            if(row > n){
                totalcolsinrow = 2 * n - row;
            }
            else{
                totalcolsinrow = row;
            }
            for(int s = 0;s<n-totalcolsinrow;s++){
                System.out.print("  ");
            }
            for(int col = totalcolsinrow ; col >= 1; col--){
                System.out.print(col+" ");
            }
            for(int col = 2;col <= totalcolsinrow; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern31(int n){
        int OriginalN = n;
        n = 2*n;
        for(int row = 0;row <= n;row++){
            for(int col = 0;col <= n;col++){
                int up = row;
                int down =n - row;
                int left = col;
                int right = n - col;
                int atEveryIndex = OriginalN-Math.min(Math.min(up,down),Math.min(left,right));
                System.out.print(atEveryIndex +" ");
            }
            System.out.println();
        }

    }
}
