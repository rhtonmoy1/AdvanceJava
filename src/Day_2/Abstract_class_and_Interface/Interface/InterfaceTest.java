package Day_2.Abstract_class_and_Interface.Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        C obj = new C();
        obj.printC();
        obj.printB();
        obj.printA();
    }
}

interface A{
    void printA();

}

interface B extends A{
    void printB();
}

class C implements B{
    public void printC(){
       System.out.println("hello C");
    }
    @Override
    public void printA() {
        System.out.println("Hello A");
    }

    @Override
    public void printB() {
        System.out.println("Hello B");
    }
}