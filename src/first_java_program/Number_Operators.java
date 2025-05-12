package first_java_program;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;

public class Number_Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter operation +-*/");
        String operatorString = sc.next();
        int output;
        if(operatorString.equals("+")){
            output = num1 + num2;
        }else if(operatorString.equals("-")){
            output = num1 - num2;
        }else if(operatorString.equals("*")){
            output = num1 * num2;
        }else{
            output = num1 / num2;
        }

        System.out.println("Output is "+output);

        sc.close();
    }
}
