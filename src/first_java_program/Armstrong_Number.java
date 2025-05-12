package first_java_program;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = num;
        int digits = String.valueOf(num).length();
        double sum = 0;
        while(num > 0){
            int temp = num % 10;
            sum += Math.pow(temp, digits);
            num /= 10;
        }
        if(num2 == sum){
            System.out.println("is Armstrong");
        }else{
            System.out.println("Not Armstrong");

        }
        sc.close();



    }
}
