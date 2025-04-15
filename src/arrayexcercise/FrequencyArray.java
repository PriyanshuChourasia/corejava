package arrayexcercise;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int count;
        boolean flag;
        System.out.println("Enter the size: ");
        int num = sc.nextInt();

        int[] arr;
        arr = new int[num];

        System.out.println("Enter the array: ");

        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<num; i++)
        {
            count = 1;
            flag = true;
            for(int j=0; j<num; j++)
            {
                if(arr[i] == arr[j] && j<i)
                {
                    flag = false;
                    break;
                }
                else if(arr[i] == arr[j] && j>i)
                {
                    count++;
                }
            }
            if(flag)
            {
                System.out.println("Frequency of "+arr[i]+" = "+count);
            }
        }



        sc.close();
    }
}
