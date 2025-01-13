package oops;

public class Person {

    public String name;
    public int age;

/**
 * We can have class without constructor only we will have to call each and every variable to set the value.
 *
 */


//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }

    public void greet(){
        System.out.println("Hello My name is "+name);
    }
}