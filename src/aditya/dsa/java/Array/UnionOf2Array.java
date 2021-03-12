package aditya.dsa.java.Array;

import java.util.HashMap;
import java.util.Map;

public class UnionOf2Array {

    public static int getUnionOfArrays(int[] arr1, int[] arr2, int n, int m) {

        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            mp.put(arr1[i], i);
        }

        for (int i = 0; i < m; i++) {
            mp.put(arr2[i], i);
        }

        Map<Integer, Integer> mi = new HashMap<>();

        //Intersection
        for (int i=0 ; i<n ;i++){
            for(int j=0; j<m;j++){
                if(arr2[j] == arr1[i]){
                    mi.put(j,arr2[j]);
                }
            }
        }

        System.out.println(" Intersection : "+mi.size());


        return mp.size();
    }

    public static void main(String[] args) {
//        int[] arr1 = {1, 1, 2, 2, 3, 3};
//        int[] arr2 = {8, 9, 7, 6, 5};

        int[] arr1 = {85, 25, 1, 32, 54, 6};
        int[] arr2 = {85, 2};

        int sum = getUnionOfArrays(arr1, arr2, arr1.length, arr2.length);

        System.out.println(" Union : "+sum);
    }
}
