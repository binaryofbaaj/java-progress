package java3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//cases have to be of the same type
// duplicate case values are not allowed
        //break is used to terminate
        //default will execute when none of the above does
        //if default is not at the end put break after it
//        switch(fruit){
//            case "mango" :
//                System.out.println("king of fruits");
//                break;
//            case "apple" :
//                System.out.println("a sweet red fruit");
//                break;
//            case "orange" :
//                System.out.println("Round Fruit");
//                break;
//            case "grapes" :
//                System.out.println("small fruit");
//                break;
//            default :
//                System.out.println("please enter a valid fruit");
//        }



//        int day = in.nextInt();
//
//        switch(day){
//            case 1 :
//                System.out.println("today is monday" );
//                break;
//            case 2 :
//                System.out.println("today is tuesday" );
//                break;
//            case 3 :
//                System.out.println("today is wednesday" );
//                break;
//            case 4 :
//                System.out.println("today is thursday" );
//                break;
//            case 5 :
//                System.out.println("today is friday" );
//                break;
//            case 6 :
//                System.out.println("today is saturday" );
//                break;
//            case 7 :
//                System.out.println("today is sunday" );
//                break;
//            default :
//                System.out.println("enter valid day");
//        }



        int day = in.nextInt();

        switch(day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            case 6:

            case 7:
                System.out.println("weekend");
                break;
            default:
                System.out.println("enter valid day");
        }
    }
}
