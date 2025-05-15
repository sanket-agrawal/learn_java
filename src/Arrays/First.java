package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class First {

    public static int length(int [] arr){
        return arr.length;
    }

    public static int []  changeLastIndex(int [] arr){
        arr[arr.length - 1] = 100;
        return arr;
    }

    public static int [] change(int[] arr){
        arr[0] = 123;
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
//        arr[arr.length -1 ] = 23;
//        System.out.println(arr);
//        System.out.println(length(arr));
        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(changeLastIndex(arr)));
        System.out.println(Arrays.toString(change(arr)));
//        for (int i : arr) {
//            System.out.println(i);
//        }
        sc.close();
    }
}
