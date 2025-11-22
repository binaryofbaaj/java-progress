package java;
import java.util.Scanner;
public class typecasting {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
//        float num = scanner.nextFloat();
//        System.out.println(num);
//        int num = (int)(67.66f);
//        //only give me before decimal value of 67.66.//typecasting
//        System.out.println(num);

        // automatic type promotion in expressions.
//         int a = 257;
//         byte b = (byte)(a);//257 % 256 =1 so answer is 1;
//        // as byte can store till 256 therefore it will store the remainder in the variable.
//        System.out.println(b);

//        byte a = 40;
//        byte b = 30;
//        byte c = 100;
//        int d = a * b / c;
//        // in bts it is looking like int d = (int)(a) * (int)(b) / (int)(c)
//        System.out.println(d);//it follows automatic type conversion here so we are seeing the full value.

      //  in byte evaluations automatically it converts it into int
//        byte b = 50;
//        b = b * 2; do it in byte as it was converted in int automatically

//        int number = 'a';
//        System.out.println(number);//converts it into number according to the ascii value.

        //int * float will give float
        //long*int will give long
        //so like in compatibe datatypes they will be converted to the large one automatically.

        int a = 1;
        byte b = 42;
        char c = 'a';
        short s = 1024;
        float f = 54.45f;
        double d = 45.566666;
        double result = ( f * b ) + ( a / c) - (d - s);
        System.out.println(( f * b ) +" "+ ( a / c) +" " + (d - s) );
        //float + int - double = double
        System.out.println(result);
    }
}
//how can this be happening that entering 67 and getting 67.0 === typecasting
//rules for typecasting
//the 2 datatypes should be compatible.(like int and float)
//asking for something bigger lke float and giving smaller like int that will work but not vice versa.

//auto typecasting is not fully helpful therefore need to do it manually known as narrowing conversion.


