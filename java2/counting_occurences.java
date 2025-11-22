package java2;
import java.util.Scanner;
public class counting_occurences {
    public static void main(String[] args) {
        int n = 145536;
        int k = 5;
        int count = 0;
        while(n > 0){
            int rem = n % 10;
            if(rem == k){
                count++;
            }
            n = n / 10;

        }
        System.out.println(count);
    }
}
