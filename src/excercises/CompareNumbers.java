package excercises;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("A is greater");
            }
            else if(a<c)
            {
                System.out.println("C is greatest");
            }
            else
            {
                System.out.println("A and C is equal and greatest");
            }
        }
        else if(b>a)
        {
            if(b>c)
            {
                System.out.println("B is the greatest");
            }
            else if(c>b)
            {
                System.out.println("C is the greatest");
            }
            else
            {
                System.out.println("C and B are equal and greatest");
            }
        }
        else
        {
            if(a>c)
            {
                System.out.println("A and B is greatest and equal");
            }
            else if(c>a)
            {
                System.out.println("C is greatest and A and B are equal");
            }
            else
            {
                System.out.println("A,B and C are equal");
            }
        }


        sc.close();
    }
}
