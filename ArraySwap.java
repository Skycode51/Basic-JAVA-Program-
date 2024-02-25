package akash.learning;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {

        int [] arr = {1,3,23,9,18};
        swap(arr,1,3); //1= 3 and 3=9

        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1,int index2){
        int temp=arr[index1];    // temp store index 1
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
