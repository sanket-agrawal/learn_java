package condtions_and_loops;

import java.util.Scanner;

public class SumOfDifferentNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int negative = 0;
        int positiveEven = 0;
        int positiveOdd = 0;
        int number;
        do{
            number = sc.nextInt();
            if(number < 0){
                negative += number;
            }else if(number % 2 == 0){
                positiveEven += number;
            }else if(number % 2 == 1){
                positiveOdd += number;
            }
        }while(number != 0);
        System.out.println(positiveEven+" "+positiveOdd+" "+negative);
        //comment
    }
}
