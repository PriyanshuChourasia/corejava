package excercises;

import java.util.Scanner;

class Employee{

    Scanner sc = new Scanner(System.in);


    private int fCode;
    private String name;
    private String category;
    private int yoe; // Year of Experience
    private double basicSal;
    private double gradePay;
    private double grossSal;

    public void acceptDetails()
    {
        System.out.println("Code: ");
        fCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Name: ");
        name = sc.nextLine();
        System.out.println("Category: (PRT/TGT/PGT) ");
        category = sc.nextLine();
        System.out.println("Year of Experience: ");
        yoe = sc.nextInt();
        computeSalary();
    }

    public void computeSalary(){
        if(category.equalsIgnoreCase("PRT"))
        {
            basicSal = (yoe < 10) ? 15000 : 17500;
        }
        else if(category.equalsIgnoreCase("TGT"))
        {
            basicSal = (yoe < 10) ? 20000 : 35000;
        }
        else if(category.equalsIgnoreCase("PGT"))
        {
            basicSal = (yoe < 10) ? 30000 : 45000;
        }

        gradePay = basicSal / 2;
        grossSal = basicSal + gradePay;
    }

    void  displayDetail()
    {
        System.out.println("Faculty Details: ");
        System.out.println("Code: "+this.fCode);
        System.out.println("Name: "+this.name);
        System.out.println("Category: "+ this.category);
        System.out.println("Year of Experience: "+this.yoe);
        System.out.println("Basic Salary: "+this.basicSal);
        System.out.println("Grade Pay: "+this.gradePay);
        System.out.println("Gross Salary: "+this.grossSal);
    }


}




public class Faculty {
    public static void main(String[] args)
    {
        System.out.println("Register your employee");


        Employee emp = new Employee();
        emp.acceptDetails();
        emp.displayDetail();
    }
}
