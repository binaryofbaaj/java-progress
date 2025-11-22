package java3;
import java.util.Scanner;
public class Shadowing {
    static int x = 90;//this will be shadowed when variable with same name is initialized i.ie in this prog at line 7.
   public static void main(String[] args) {
       System.out.println(x);
       int x = 40;  //shadowing
       System.out.println(x); // now it will print 40
       fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
//shadowing is the process of using 2 variables with the same name within the scope that overlaps
//lower level will override the upper level.
//shadowing will begin when the local variable will be declared.
//shadowing effect does not take place in methods.