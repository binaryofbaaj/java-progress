package java2;
import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        Syntax of for loops
            for( initialization ; condition ; increment/decrement ){
            // body
            }
         */
        //print nos from 1 to 5
//        for(int i = 1 ;i <= 5 ; i++){
//            System.out.println(i);
//        }

        // print number from 1 to n.
//        int n = scanner.nextInt();
//        for(int i = 1 ; i <= n ; i++){
//            System.out.println(i);
//        }





        //syntax of while loops
        /*
        initialization
        while( condition ){
        //body
        increment/decrement
        }
         */

//        int i = 1;
//        while(i <= 5){
//            System.out.println(i);
//            i = i + 1;
//        }




        //syntax of do while loop
        /*
        initialization
        do {
        //body
increment/decrement
        } while ( condition  )
         */


//        int i = 1;
//        do{
//            System.out.println(i);
//            i = i + 1;
//        } while(i < 1);

        //difference between while and do while
        // is if while loop is false it will not run
        //but if do while loop is wrong it will run at least a single time and then stop.
        //because first it will execute the body then it will validate the checks in the program
    }
}
