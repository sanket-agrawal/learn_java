package LC;

public class ProductSumDifference {
    public static void main(String[] args) {
        int n = 234;
        int product = 1;
        int sum = 0;
        while(n > 0){
            int temp = n%10;
            product *= temp;
            sum += temp;
            n /= 10;
        }
        int result = product-sum;
        System.out.println(result);
    }
}
