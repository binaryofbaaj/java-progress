package java3;

import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1 :
                System.out.println("Gurman");
                break;
            case 2 :
                System.out.println("Kunal");
                break;
            case 3 :
                System.out.println("Rahul");
                switch(department){
                    case "IT" :
                        System.out.println("IT Department");
                        break;
                    case "manage" :
                        System.out.println("management department");
                        break;
                    default :
                        System.out.println("no department");
                }
        }
    }
}
