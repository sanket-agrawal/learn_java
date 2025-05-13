package Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PrimeList {

    public static void primeList(int num1, int num2){
        for(int i = num1 ; i <= num2 ; i++) {
            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println(i);
            }
        }
    }


    public static void main(String[] args) {
        primeList(123,198);
    }
}
