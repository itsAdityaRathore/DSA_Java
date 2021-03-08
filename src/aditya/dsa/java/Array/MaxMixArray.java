package aditya.dsa.java.Array;

/*
Find the maximum and minimum element in an array
 */
public class MaxMixArray {
    static class Pair{
        int max;
        int min;
    }

    static Pair getMaxMin(int[] arr, int n) {
        Pair maxmin = new Pair();
        //If array has only 1 element
        if(n==1){
            maxmin.max = arr[0];
            maxmin.min = arr[0];
            return maxmin;
        }

        //If array has 2 elements
        if(arr[0] > arr[1]){
            maxmin.max = arr[0];
            maxmin.min = arr[1];
        } else if (arr[0] < arr[1]){
            maxmin.max = arr[1];
            maxmin.min = arr[0];
        }

        //If array has more than 2 elements
        for(int i=2 ; i < n ; i++){
            if(arr[i] > maxmin.max){
                maxmin.max = arr[i];
            }else if(arr[i] < maxmin.min){
                maxmin.min = arr[i];
            }
        }
        return maxmin;
    }

    public static void main(String[] args) {
        int[] array = {101,44,29,67,36,51,786,87};

        Pair maxmin = getMaxMin(array,array.length);
        System.out.println("Max value : "+maxmin.max);
        System.out.println("Min value : "+maxmin.min);


    }

}
