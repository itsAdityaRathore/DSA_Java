package aditya.dsa.java.Array;
/*
Find the maximum and minimum element in an array
 */
public class MaxMinArrayRecursion {
    static class Pair{
        int max;
        int min;
    }

    public static Pair getMaxMin(int[] arr, int first, int last){
        Pair maxmin = new Pair();
        Pair mmL;
        Pair mmR;
        int mid;

        if(last == first){
            maxmin.max = arr[last];
            maxmin.min = arr[last];
            return maxmin;
        }

        if(last == first+1){
            if (arr[first] > arr[last]){
                maxmin.max = arr[first];
                maxmin.min = arr[last];
            } else {
                maxmin.min = arr[first];
                maxmin.max = arr[last];
            }
            return maxmin;
        }

        mid = (first+last)/2;
        mmL = getMaxMin(arr,first,mid);
        mmR = getMaxMin(arr,mid+1,last);

        maxmin.max = Math.max(mmL.max, mmR.max);

        maxmin.min = Math.min(mmL.min, mmR.min);
        return maxmin;
    }

    public static void main(String[] args) {
        int[] array = {12,43,66,32,10,95};
        Pair minmax = getMaxMin(array,0,5);
        System.out.println("Maximum element : "+minmax.max);
        System.out.println("Minimum element : "+minmax.min);
    }
}
