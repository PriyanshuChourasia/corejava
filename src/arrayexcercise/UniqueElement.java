package arrayexcercise;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size: ");
        int num = sc.nextInt();

        int[] arr;
        arr = new int[num];

        System.out.println("Enter array: ");
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        boolean flag;

        System.out.println("Print array");

        System.out.println("Unique elements of array");

        for(int j=0; j<num; j++)
        {
            flag = false;
            for(int k=0; k<num; k++)
            {
                if(arr[j] == arr[k] && j != k ) {
                    flag = true;
                    break;
                }
            }

            if(flag == false)
            {
                System.out.println(arr[j]);
            }

        }


        sc.close();
    }
}
