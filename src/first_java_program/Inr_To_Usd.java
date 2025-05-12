package first_java_program;

import java.util.Scanner;

public class Inr_To_Usd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in INR");
        float inr = sc.nextFloat();
        System.out.println("Total USD = "+inr/85);
        sc.close();
    }
}
