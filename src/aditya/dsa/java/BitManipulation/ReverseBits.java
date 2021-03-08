package aditya.dsa.java.BitManipulation;

public class ReverseBits {

    public static long reverseBits(int a){

        long result = 0;
        int i = 31;
        while(a > 0){
            result += (a % 2) * Math.pow(2, i);
            System.out.println("res : "+result);
            i--;
            a = a/2;
            System.out.println("A   : "+a);
        }
        return result;
//        int rev = 0;
//
//        while(a>0){
//            rev = rev << 1;
//
//            if((a&1)==1){
//                rev = rev ^ 1;
//                System.out.println(rev);
//            }
//            a = a >> 1;
//        }
//
//        return rev;
    }

    public static void main(String[] args){
        int a = 3;
        System.out.println(reverseBits(a));
    }
}
