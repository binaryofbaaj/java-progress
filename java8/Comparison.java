package java8;

public class Comparison {
    public static void main(String[] args) {
        String a = new String("Kunal");
        String b = new String("Kunal");


        //==
        System.out.println(a.equals(b));//.equals will only check the value
        System.out.println(a==b);//== will check if the reference variable is pointing to the same object.
        System.out.println(b.charAt(2));
    }
}
