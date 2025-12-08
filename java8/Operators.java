package java8;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //operator is converting a and b in its character value.
        System.out.println("a" + "b");  //now it is concatinating the value.
        System.out.println((char)('a'+ 3));  // it will convert it into its ascii value and then add.

        System.out.println("a" + 1);
        //this is same as after the few steps: "a" + "1".
        //integer will be converted to Integer that will call toString().

        System.out.println("kunal" + new ArrayList<>());
        System.out.println("kunal" + new Integer(50));
    //    String ans = new Integer(50)+ "" + + new ArrayList<>();
    //   System.out.println(ans);
        // + operator only works for primitives and only overloaded for String type
        System.out.println("a" + 'b');

    }
}
