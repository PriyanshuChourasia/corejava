package excercises;

import java.util.Scanner;

public class FareCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distance: ");
        int distance = sc.nextInt();
        int fare = 0;


        if(distance < 10){
            fare = 80;
        }
        else if(distance < 20){
            fare =   (distance - 10) * 6 + 80;
        }
        else if(distance < 30){
            fare = 80 + (10*6)+ (distance - 20) * 5;
        }
        else{
            fare = 80 + (10*6) + (10*5) + (distance - 30) * 4;
        }

        System.out.println("The fair of distance "+ distance + " km " + " = " + fare);

        sc.close();
    }
}
