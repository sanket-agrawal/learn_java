package condtions_and_loops;

import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().trim().charAt(0);
        if(s == 'a' || s == 'e' || s == 'i' || s == 'o' || s  == 'u'){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
