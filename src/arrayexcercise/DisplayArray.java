package arrayexcercise;

import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args){
        Scanner arrObj = new Scanner(System.in);
        System.out.println("Enter size: ");

        int num = arrObj.nextInt();

        int[] arr;
        arr = new int[num];
        System.out.println("Enter the array num: ");

        for(int i=0; i<num; i++)
        {
            arr[i] = arrObj.nextInt();
        }

        for(int j=0; j<num; j++)
        {
            System.out.println(arr[j]);
        }

        arrObj.close();

    }
}
