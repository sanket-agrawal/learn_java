package gfg;

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        if(arr.length == 0){
            return -1;
        }else{
            // code here
            int largest = arr[0];
            int secondLargest = arr[1];
            if(arr[1] > arr[0]){
                largest = arr[1];
                secondLargest = arr[0];
            }
            for(int i = 2 ; i < arr.length; i++){
                if(arr[i] > largest){
                    secondLargest = largest;
                    largest = arr[i];
                }else if(arr[i] < largest && arr[i] > secondLargest){
                    secondLargest = arr[i];
                }
            }

            if(largest == secondLargest){
                return -1;
            }else{
                return secondLargest;
            }

        }

    }
}
