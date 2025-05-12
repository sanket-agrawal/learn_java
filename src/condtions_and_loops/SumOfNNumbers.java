package condtions_and_loops;

import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= totalNumbers ; i++){
            sum+= sc.nextInt();
        }
        System.out.println(sum);
        sc.close();
    }
}
