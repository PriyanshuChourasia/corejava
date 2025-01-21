package oops;

abstract class Animal{
        abstract  void makeSound();

        void eat(){
            System.out.println("This animal is eating");
        }
}

class Dog extends Animal{
    void sleep(){
        System.out.println("DOg is sleeping");
    }
    @Override
    void makeSound(){
        System.out.println("woof woof");
    }
}


class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("meow meow");
    }
}



public class AbstractMethod {
    public static void main(String[] args)
    {
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
    }
}
