package java8;

public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());


        builder.deleteCharAt(0);
        System.out.println(builder);


        builder.reverse();
        System.out.println(builder);
    }
}
 //stringbuilder are mutable i.e. you can modify it in place without creating a new object.
//StringBuilder fixes this by being mutable
//
//It lets you append, insert, delete, modify characters without creating new objects every time.