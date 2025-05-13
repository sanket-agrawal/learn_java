package Methods;

public class SumOfNaturalNumbers {

    public static int sum(int num){
        int i = 1;
        int sum = 0;
        while(i <= num){
            sum += i;
            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(100));
    }
}
