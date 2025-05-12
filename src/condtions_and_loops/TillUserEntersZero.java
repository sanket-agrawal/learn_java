package condtions_and_loops;

import java.util.Scanner;

public class TillUserEntersZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        boolean isZero = true;
        int num = sc.nextInt();
        sum += num;
        while(isZero){
            num = sc.nextInt();
            if(num == 0){
                isZero = false;
            }else{
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
