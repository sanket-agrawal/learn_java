package Methods;

public class IsPrime {

    public static boolean checkPrime(int num){
        boolean isPrime = true;
        for(int i = 2 ; i*i <= num ; i++){
            if(num % i == 0){
               isPrime = false;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        int num = 251;
        System.out.println(checkPrime(num));

    }
}
