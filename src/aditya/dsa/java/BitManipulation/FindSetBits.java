package aditya.dsa.java.BitManipulation;

//Write a function that takes an unsigned integer and returns the number of 1 bits it has.

public class FindSetBits {

    public static int getSetBits(long a){
        int count1=0;
        int count2=0;

        /*
         * METHOD 1
         * By counting number of least significant 1's and set it to 0
         */
        while(a!=0){
            a = a&(a-1);
            count1++;
        }

        /*
          METHOD 2
          By Checking last digit is 1 and shifting 1 bit to the right
         */
        while(a > 0){  //to use this method COMMENT method 1
            if((a&1)==1){
                count2++;
            }
            a = a>>1;
        }

        return count2;
    }

    public static void main(String[] args){
        long a = 13;
        System.out.println(getSetBits(a));
    }

}
