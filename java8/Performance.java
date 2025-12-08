package java8;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for(int i= 0 ;i < 26;i++){
            char ch = (char)('a'+i);
         //   System.out.print(ch +" ");
            series = series + ch;

        }
        System.out.println(series); // all the values will be added as a string in series variable.

    }
    //O(n^2)


    //1+2+3+4+5+6........N
  //  n(n+1)/2
}
