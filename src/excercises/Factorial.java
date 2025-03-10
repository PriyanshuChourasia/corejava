package excercises;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int fac = 1;


        System.out.println("Factorial of "+num);
        while(num > 0)
        {
            fac = fac * num;
            num--;
        }

        System.out.print(fac);



        sc.close();
    }
}
