package java3;

public class Overloading {
    public static void main(String[] args) {
    fun(7);
    fun("gurman");
 //   fun();//case of ambiguity in this the compiler will not be able to decide which function to call
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second one");
        System.out.println(name);
    }
    // 2 or more functions of the same name can exist if the parameters are different.(different arguments)
}
