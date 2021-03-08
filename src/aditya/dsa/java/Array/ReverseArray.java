package aditya.dsa.java.Array;

public class ReverseArray {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {10,50,00,60,80};
        int start = 0;
        int end = arr.length-1;
        int temp;

        while(start<=end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
