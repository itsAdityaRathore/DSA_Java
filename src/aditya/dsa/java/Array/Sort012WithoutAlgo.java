package aditya.dsa.java.Array;
/*
Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 */
public class Sort012WithoutAlgo {

    public static void sortArray(int[] array, int n){
        int c0=0, c1=0, c2=0;
        int i;
        for (i=0;i<n;i++){

            switch (array[i]) {
                case 0 -> c0++;
                case 1 -> c1++;
                case 2 -> c2++;
            }
        }
        i=0;
        while (c0>0){
            array[i++] = 0;
            c0--;
        }

        while (c1>0){
            array[i++] = 1;
            c1--;
        }
        while (c2>0){
            array[i++] = 2;
            c2--;
        }

    }

    public static void main(String[] args) {
        int[] array = {0,2,1,2,0};

        sortArray(array,5);

        for (int i: array
             ) {
            System.out.println(i);
        }
    }
}
