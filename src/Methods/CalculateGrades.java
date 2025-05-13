package Methods;

import java.util.Scanner;

public class CalculateGrades {

    public static String printGrade(int num){
        if(num >= 41 && num <= 50){
            return "DD";
        }else if(num >= 51 && num <= 60){
            return "CD";
        }else if(num >= 61 && num <= 70){
            return "CC";
        }else if(num >= 71 && num <= 80){
            return "BC";
        }else if(num >= 81 && num <= 90){
            return "AB";
        }else if(num >= 91){
            return "AA";
        }

        return "Invalid Score";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Marks : ");
        System.out.println("Grade : "+printGrade(sc.nextInt()));
        sc.close();
    }
}
