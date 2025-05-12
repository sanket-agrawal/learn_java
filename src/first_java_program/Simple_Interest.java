package first_java_program;

import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
public class Simple_Interest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal");
        int principal = sc.nextInt();
        System.out.println("Enter Time");
        int time = sc.nextInt();
        System.out.println("Enter Rate of Interest");
        float roi = sc.nextFloat();
        float simple_interest = (principal * time * roi) / 100;
        System.out.println("Simple Interest is "+simple_interest);
        sc.close();
    }
}
