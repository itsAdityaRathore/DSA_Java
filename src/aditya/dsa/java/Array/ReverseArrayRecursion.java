package aditya.dsa.java.Array;

public class ReverseArrayRecursion {

    static void reverseArray(int start, int end, int[] arr){
        int temp;
        if(start>end)
            return;

        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(start+1,end-1, arr);
    }

    public static void main(String[] args) {
        // write your code here
        int[] arr = {10,50,00,60,80};
        int start = 0;
        int end = arr.length-1;

        reverseArray(start,end, arr);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
