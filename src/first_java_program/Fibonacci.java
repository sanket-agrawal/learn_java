package first_java_program;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fibo1 = 0;
        int fibo2 = 1;
        int sum = 0;
        System.out.println(fibo1);
        System.out.println(fibo2);
        for(int i = 3 ; i <= num ; i++){
            sum = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = sum;
            System.out.println(sum);
        }
        sc.close();
    }
}
