import test_package.Demo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the roll number");
        int roll = scanner.nextInt();
        System.out.println("You roll number is "+roll);
        scanner.close();
    }
}