package Methods;

public class PythagoreanTriplet {

    public static boolean isTriplet(int num1, int num2, int num3){
        return Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2);
    }

    public static void main(String[] args) {
        System.out.println(isTriplet(4,12,13));
    }
}
