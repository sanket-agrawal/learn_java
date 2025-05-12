package condtions_and_loops;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int number = sc.nextInt();
        System.out.println("Enter Total Number to be taken");
        int totalNumbers = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= totalNumbers; i++){
            int number = sc.nextInt();
            sum += number;
        }

        int average = sum/totalNumbers;
        System.out.println(average);
    }
}
