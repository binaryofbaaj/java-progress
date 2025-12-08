package java8;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Gurman Singh hello world";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());//it will not change the original String.
        System.out.println(name.indexOf('a'));
        System.out.println("     gurman      ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
