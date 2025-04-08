package arrayexcercise;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        Scanner arrObj = new Scanner(System.in);

        System.out.println("Enter the size: ");
        int num = arrObj.nextInt();


        int[] arr;
        arr = new int[num];

        System.out.println("Enter the array numbers: ");

        for(int i=0; i<num; i++)
        {
            arr[i] = arrObj.nextInt();
        }

        for(int j=num-1; j>=0; j--)
        {
            System.out.println(arr[j]);
            num--;
        }

        arrObj.close();

    }
}
