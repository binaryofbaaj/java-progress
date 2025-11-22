package java2;
import java.util.Scanner;
public class Casecheck {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);

        if(ch >= 'a'  &&  ch <= 'z'){
            System.out.println("lowercase");
        }
        else if(ch >= 'A' && ch <= 'Z'){
            System.out.println("uppercase");
        }
        else{
            System.out.println("error! not any uppercase or lowercase");
        }
    }
}
