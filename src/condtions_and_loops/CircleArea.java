package condtions_and_loops;

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pi = 3.14f;
        float radius = sc.nextFloat();
        double area = Math.PI * Math.pow(radius, 2);
        System.out.println("Area of circle with radius "+radius+" is "+area);
    }
}
