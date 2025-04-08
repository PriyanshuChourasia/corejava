package arrayexcercise;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int num  = sc.nextInt();

        int[]  arr;
        arr = new int[num];
        int[] brr;

        System.out.println("Enter the numbers: ");

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        brr = arr;

        for(int j=0; j<num; j++){
            System.out.println("Num: "+ brr[j]);
        }
        sc.close();
    }
}
