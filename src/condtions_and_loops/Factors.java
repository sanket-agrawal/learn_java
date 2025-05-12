package condtions_and_loops;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i =1;
//        for(int i = 1 ; i <= num; i = i+1){
//            if(num % i == 0){
//                System.out.println(i);
//            }
//        }

        while(i <= num){
            if(num % i == 0){
                System.out.println(i);
            }
            i = i + 1;
        }
    }
}
