package java11;

public class NoOfDigits {
    public static void main(String[] args) {
        int n = 15;
        int b = 2;
        int ans = (int) (Math.log(n)/Math.log(b)) + 1;
        System.out.println(ans);
    }
}
//time complexity = O(log n);
