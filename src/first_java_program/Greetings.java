package first_java_program;
//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        if(name.equals("") || name.equals(null)){
            System.out.println("No Name entered");
        }else{
            System.out.println("Welcome to the program "+name);
        }
        sc.close();
    }
}
