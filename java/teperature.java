package java;
import java.util.Scanner;
public class teperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter temp in C");
        float TempC = scanner.nextFloat();
        float TempF = (TempC * 9/5) +32 ;

        System.out.println(TempF);
    }
}
