package condtions_and_loops;

import java.util.Scanner;

public class Occurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int frequency = sc.nextInt();
        int count = 0;
        while(number > 0){
            int temp = number % 10;
            if(temp == frequency) count++;
            number /= 10;
        }
        System.out.println(count);
    }
}
