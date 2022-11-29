package Day_2.Abstract_class_and_Interface.AbstractClass;

public class test {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
        System.out.println(obj.sum1(4,5));
    }

}

abstract class A{
    public abstract void print();
    public int sum1(int a, int b){
        return a+b;
    }
}

class B extends A{
    public void print(){
        System.out.println("Sum of 2 numbers");
    };
}