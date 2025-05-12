package first_java_program;

import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check");
        String s1 = sc.next();
        String s2 = "";
//        System.out.println(s1.charAt(0)+" "+s1.charAt(5));
        for(int i = s1.length() - 1 ; i >= 0 ; i--){
            s2+=s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("string is palindrome");
        }else{
            System.out.println("Not palindrome");
        }
        sc.close();
    }
}
