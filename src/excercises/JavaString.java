package excercises;

import java.util.Scanner;

public class JavaString {
    public static void main(String[] args)
    {
        System.out.println("Enter name: ");
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        String reverseName = "";

        for(int i=0; i<name.length(); i++)
        {
            System.out.println(name.charAt(i));

            reverseName = name.charAt(i) + reverseName;
        }

        if(name.equals(reverseName))
        {
         System.out.println("This is a palindrome string");
        }
        else{
            System.out.println("This is not a palindrome string");
        }


        sc.close();
    }
}
