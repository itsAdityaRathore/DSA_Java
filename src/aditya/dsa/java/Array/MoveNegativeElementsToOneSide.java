package aditya.dsa.java.Array;
/*
Move all negative numbers to beginning and positive to end with constant extra space
 */
public class MoveNegativeElementsToOneSide {

    public static void reArrangeNegativeElements(int[] array, int N){
int temp, j=0;
        for(int i=0 ; i<N ; i++){
            if(array[i] < 0){
                if(i!=j){
                    System.out.println("i = "+array[i]+" j = "+array[j]);
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
        reArrangeNegativeElements(array,9);
        for(int i : array)
            System.out.print(" "+i);
    }
}
