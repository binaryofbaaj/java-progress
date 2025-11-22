package java2;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //take input from user till user does not press x or X

int ans = 0;
        while(true){
            System.out.println(" enter the operator ");
            char ch = in.next().trim().charAt(0);
            System.out.println();
            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                //input 2 numbers
                System.out.println("enter 2 numbers");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                System.out.println();
                if(ch == '+'){
                    ans = num1 + num2;
                }
                if(ch == '-'){
                    ans = num1 - num2;
                }
                if(ch == '*'){
                    ans = num1 * num2;
                }
                if(ch == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(ch == '%'){
                    ans = num1 % num2;
                }
            }else if(ch == 'x' || ch == 'X'){
                break;
            }
            else{
                System.out.println("invalid operation");
            }
            System.out.println(ans);
        }

    }
}
