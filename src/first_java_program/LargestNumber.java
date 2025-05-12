package first_java_program;

import java.util.Scanner;

//Take 2 numbers as input and print the largest number.
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("Largest of two is "+num1);
        }else{
            System.out.println("Largest of two is "+num2);
        }
        sc.close();
    }
}
