package Methods;

public class LargestSmallest {
    static int largest(int num1, int num2, int num3){
        int largest = num1;
        if(num2 > largest){
            largest = num2;
        }

        if(num3 > largest){
            largest = num3;
        }

        return largest;
    }

    static int smallest (int num1, int num2, int num3){
        int smallest = num1;
        if(num2 < smallest){
            smallest = num2;
        }

        if(num3 < smallest){
            smallest = num3;
        }

        return smallest;
    }
    public static void main(String[] args) {
        int largest = largest(6,8,4);
        System.out.println(largest);
        int smallest = smallest(6,8,4);
        System.out.println(smallest);
    }

}
