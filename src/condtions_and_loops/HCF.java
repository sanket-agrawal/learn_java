package condtions_and_loops;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        int limit = first;
        int hcf = 0;
        if(second > first){
            limit = second;
        }
        for(int i = 1 ; i <= limit ; i++){
            if(first % i == 0 && second % i == 0){
                if(i > hcf){
                    hcf = i;
                }
            }
        }

        System.out.println(hcf);
    }
}
