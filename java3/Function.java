package java3;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {    //main funtion is the first function that will run
//    sum();//function call
        int ans =sum2();//sum2 will return the value of sum and it can be stored and printed.
        System.out.println(ans);
    }

    //if the question is return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a = in.nextInt();
        System.out.println("enter second numner");
        int b = in.nextInt();
        int sum = a + b;

        return sum;
        //return statement means the function is ended.
    }
//in this no value will be returned as the return type is void.
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter first number");
        int a = in.nextInt();
        System.out.println("enter second numner");
        int b = in.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    /*
    access modifier(in oops) return_type name (){
    // body
    return statement;
    }
     */
}
