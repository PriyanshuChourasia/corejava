package oops;

public class ClassMethod {
    int a;
    int b;

    static int d = 11;

    public ClassMethod(int a, int b){
        this.a = a;
        this.b = b;
        this.add();
        mul();
    }

    static void mul(){
        System.out.println(d);
    }

    public int add(){
        System.out.println("Hello number added");
        return a+b;
    }
}
