package java3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VarArgs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        fun(2,3,4,5,6,7,7,8,8,8,8,8,8);
        multiple(2,3,"gurman","gurman","gurman");//variable parameters must be the last in the list.
    }

    //for multile arguments we can do
    static void multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }


    static void fun(int ...v){//you can take any number of arguments.length is not constant.
        // we can take any datatype like string also
        System.out.println(Arrays.toString(v));
    }
}
