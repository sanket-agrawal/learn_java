package condtions_and_loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().trim().charAt(0);
        if(c >= 'a' && c <= 'z'){
            System.out.println("Lower case");
        }else if(c >= 'A' && c <='Z' ){
            System.out.println("Upper case");
        }else{
            System.out.println("Not a alphabet");
        }
        sc.close();
    }
}
