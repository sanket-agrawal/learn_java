package Methods;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int num){
        int i = 1;
        int factorial = 1;
        while(i <= num){
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial : "+factorial(scanner.nextInt()));
    }
}
