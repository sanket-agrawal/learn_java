package Methods;

public class EvenOdd {

    public static boolean isEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 19;
        boolean is_Even = isEven(num);
        if(is_Even){
            System.out.println("Is Even");
        }else{
            System.out.println("Is Odd");
        }
    }
}
