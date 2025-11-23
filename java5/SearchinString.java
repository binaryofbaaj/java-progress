package java5;

import java.util.Arrays;
import java.util.Scanner;

public class SearchinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "kunal";
        char target = 'u';
        System.out.println(Arrays.toString(name.toCharArray()));    //convert string to character array.
        System.out.println(search(name,target));

    }

//    static boolean search(String str, char target) {
//        if (str.length() == 0) {
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }
//        return false;
//    }


    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

       for(char ch: str.toCharArray()){         //for each loop
           if(ch == target){
               return true;
           }
       }
        return false;
    }
}
