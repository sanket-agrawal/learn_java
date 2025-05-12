package condtions_and_loops;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Orignal Selling price");
        double original = sc.nextDouble();
        System.out.println("Enter Discounted percentage");
        double discountPercentage = sc.nextDouble();
        double discount = (original * discountPercentage) / 100;
        double finalPrice = original - discount;
        System.out.println(finalPrice);
    }
}
