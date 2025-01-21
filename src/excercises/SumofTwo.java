package excercises;

import java.util.Scanner;

public class SumofTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        int a = sc.nextInt();
        System.out.println("Enter number b: ");
        int b = sc.nextInt();
        int c = a + b;

        System.out.println("Sum of two number: "+c);



        sc.close();
    }
}
