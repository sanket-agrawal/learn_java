package condtions_and_loops;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal = sc.nextFloat();
        float rate = sc.nextFloat() / 100;
        double numberTime = sc.nextInt();
        double duration = sc.nextInt();
        double finalAmount = principal * Math.pow(( 1 + (rate / numberTime)),(numberTime*duration));
        System.out.println(finalAmount);
    }
}
