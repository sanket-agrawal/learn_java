package Arrays;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>(10);
        arrList.add(10);
        arrList.add(10);
        arrList.add(10);
        arrList.add(10);
        arrList.add(10);
       arrList.forEach(i -> System.out.print(i));
    }
}
