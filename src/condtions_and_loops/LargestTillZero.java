package condtions_and_loops;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int largest = 0;
        do{
            number = sc.nextInt();
            if(number > largest){
                largest = number;
            }
        }while (number != 0);
        System.out.println(largest);
    }
}
