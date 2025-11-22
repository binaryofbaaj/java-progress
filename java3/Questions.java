package java3;
import java.util.Scanner;
public class Questions {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
//    int n = in.nextInt();
//        System.out.println(isPrime(n));
//    }

    int n = in.nextInt();
        System.out.println(isArmstrong(n));
}
//check if the number is armstrong or not.
    static boolean isArmstrong(int n){
        int sum = 0;
        int n_n = n;
        int temp = n;
        int count = 0;
        while(n>0){
            int rem = n % 10;
            count += 1;
            n = n / 10;
        }
        while(n_n>0){
            int rem = n_n % 10;
            sum = sum + (int)Math.pow(rem,count);
            n_n = n_n / 10;
        }
        if(sum == temp){
            return true;
        }
        return false;
    }
     //check if the number is prime or not.
    static boolean isPrime(int n){
    if(n<=1){
        return false;
        }

    for(int i = 2 ; i * i <= n ; i++){
        if(n % i == 0){
            return false;
        }
    }
    return true;


    }
}
