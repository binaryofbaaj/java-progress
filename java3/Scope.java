package java3;

import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 10;
        int b = 20;
    }

    static void Random(){  //it is true for arguments also     //if we define something in function we can only acces it in function i.e. scope
        int num = 67;
        System.out.println(num);
    }
}
