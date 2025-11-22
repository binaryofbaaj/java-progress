package java3;

import java.util.Scanner;
//string function example
// pass the value of numbers when you are calling the method in main(); === arguments
public class Stringex_function {
    public static void main(String[] args) {
//String message = Greet();
//        System.out.println(message);
//    int ans = sum3(20,30);
//        System.out.println(ans);
Scanner in = new Scanner(System.in);
        System.out.println("enter your name");
String name = in.nextLine();
        String personalized = myGreet(name);
        System.out.println(personalized);
    }

    static String myGreet(String name){
        return "hello " + name;
    }
static int sum3(int a,int b){
        int sum = a+b;
        return sum;
}

    static String Greet(){
        String Greeting = "how are you";
        return Greeting;
    }
}
