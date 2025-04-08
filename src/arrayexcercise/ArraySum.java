package arrayexcercise;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int num = sc.nextInt();

        int[] arr;
        int sum = 0;
        arr = new int[num];

        System.out.println("Enter the array: ");
        for(int i=0; i<num; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum: "+ sum);
    }
}
