package java4;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
//        ArrayList<Integer//we have to write wrapper classes here not primitives> List = new ArrayList<//can also write datatype here but is optional(Integer)>();
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        list.add(7);
//        list.add(8);
//        list.add(9);
//        list.add(10);
//
//        System.out.println(list.contains(2 ));
//        System.out.println(list);
//        list.set(0,99);
//        list.remove(2);
//        System.out.println(list);

        //input
        for (int i = 0; i<5;i++){
            list.add(in.nextInt());
        }

        //get items at any index
        for(int i = 0;i<5;i++){
            System.out.println(list.get(i)); //pas index here list[index] syntax will not work here
        }

    }
}
