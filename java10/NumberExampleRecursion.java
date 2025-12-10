package java10;

public class NumberExampleRecursion {
   public  static void main(String[] args) {
       print(1);
    }
    static void print(int n){

       if(n == 5){
           System.out.println(n);
           return;
       }
//recursive call
        //if you are calling a function again and again, you can treat it as a seperate call in the stack.
       System.out.println(n);
        print(n+1);
    }
}

