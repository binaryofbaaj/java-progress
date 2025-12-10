package java10;

public class Fibonacci {
    public static void main(String[] args) {
    int ans = fibinacci(50);
        System.out.println(ans);
    }
    static int fibinacci(int n){
        if(n<2){
            return n;
        }
        // base condition;

        return (fibinacci(n-1) + fibinacci(n-2));
    }
}
