package condtions_and_loops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 1;
        int product = 1;
        while(i <= num){
            product *= i;
            i++;
        }
        System.out.println(product);
        sc.close();
    }
}
