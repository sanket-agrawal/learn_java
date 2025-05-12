package condtions_and_loops;

public class ReverseNumber {
    public static void main(String[] args) {
        int number = 876556;
        int tempStr = 0;
//        String str = String.valueOf(number);
//        for(int i = str.length() - 1; i >= 0 ; i--){
//            temp += str.charAt(i);
//        }
//        System.out.println(temp);
        while(number > 0){
            int temp = number % 10;
            tempStr = tempStr * 10 + temp;
            number /= 10;
        }
        System.out.println(tempStr);
    }
}
