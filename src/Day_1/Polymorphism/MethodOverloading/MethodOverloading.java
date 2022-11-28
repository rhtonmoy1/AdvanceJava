package Day_1.Polymorphism.MethodOverloading;

//Method Overloading in Java
//        If a class
//has multiple methods having same name but different in parameters, it is known as Method Overloading.
//
//        If we have to perform only one operation, having same name of the methods increases the readability of the program
//        .
//
//        Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behavior of the method because its name differs.
//
//        So, we perform method overloading to figure out the program quickly.
//
//        Advantage of method overloading
//        Method overloading increases the readability of the program.
//
//        Different ways to overload the method
//        There are two ways to overload the method in java
//
//        By changing number of arguments
//        By changing the data type
//
//        1) Method Overloading: changing no. of arguments
//        In this example, we have created two methods, first add() method performs addition of two numbers and second add method performs addition of three numbers.
//
//        In this example, we are creating static methods
//        so that we don't need to create instance for calling methods.
public class MethodOverloading {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a, int b, int c){
        return a+b+c;
    }
}
class MethodOverloadingTest extends MethodOverloading{
    public static void main(String[] args) {
        System.out.println(MethodOverloading.add(12,14));
        System.out.println(MethodOverloading.add(12,14, 15));
    }
}


//2) Method Overloading: changing data type of arguments
//        In this example, we have created two methods that differs in data type
//      . The first add method receives two integer arguments and second add method receives two double arguments.

class DataType{
   int add(int a, int b){
        return  a+b;
    }
    double add(double a, double b){
       return a+b;
    }
}
class DataTypeMain extends DataType{
    public static void main(String[] args) {
        DataType obj = new DataType();
        System.out.println(obj.add(2,2));
        System.out.println(obj.add(2.5,2.5));
    }
}


//Is-A relationship: Whenever one class inherits another class, it is called an IS-A relationship. --Inheritance-- work with MethodOverloading
// Has-A relationship: Whenever an instance of one class is used in another class, it is called HAS-A relationship. --Aggregation-- Does not work with MethodOverloading

//Q) Why Method Overloading is not possible by changing the return type of method only?
//        In java, method overloading is not possible by changing the return type of the method only because of ambiguity.

//Let's see how ambiguity may occur:
//
//
//class Adder{
//    static int add(int a,int b){return a+b;}
//    static double add(int a,int b){return a+b;}
//}
//class TestOverloading3{
//    public static void main(String[] args){
//        System.out.println(Adder.add(11,11));//ambiguity
//    }}
//    Test it Now
//        Output: Compile Time Error: method add(int,int) is already defined in class Adder

//System.out.println(Adder.add(11,11)); //Here, how can java determine which sum() method should be called?
//
//        Note: Compile Time Error is better than Run Time Error. So, java compiler renders compiler time error if you declare the same method having same parameters.

//    Can we overload java main() method?
//        Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM
//        calls main() method which receives string array as arguments only. Let's see the simple example:
//
//class TestOverloading4{
//    public static void main(String[] args){System.out.println("main with String[]");}
//    public static void main(String args){System.out.println("main with String");}
//    public static void main(){System.out.println("main without args");}
//}
//    Test it Now
//        Output:
//
//        main with String[]


//    Method Overloading and Type Promotion
//        One type is promoted to another implicitly if no matching datatype is found. Let's understand the concept by the figure given below:
//
//          ![](Type Promotion.png) Image
//
//        Java Method Overloading with Type Promotion
//        As displayed in the above diagram, byte can be promoted to short, int, long, float or double. The short datatype can be promoted to int, long, float or double. The char datatype can be promoted to int,long,float or double and so on.
//
//        Example of Method Overloading with TypePromotion
//
//class OverloadingCalculation1{
//    void sum(int a,long b){System.out.println(a+b);}
//    void sum(int a,int b,int c){System.out.println(a+b+c);}
//
//    public static void main(String args[]){
//        OverloadingCalculation1 obj=new OverloadingCalculation1();
//        obj.sum(20,20);//now second int literal will be promoted to long
//        obj.sum(20,20,20);
//
//    }
//}
//    Test it Now
//        Output:40
//        60


//    Example of Method Overloading with Type Promotion in case of ambiguity
//        If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity.
//
//
//class OverloadingCalculation3{
//    void sum(int a,long b){System.out.println("a method invoked");}
//    void sum(long a,int b){System.out.println("b method invoked");}
//
//    public static void main(String args[]){
//        OverloadingCalculation3 obj=new OverloadingCalculation3();
//        obj.sum(20,20);//now ambiguity
//    }
//}
//    Test it Now
//        Output:Compile Time Error
//
//        One type is not de-promoted implicitly for example double cannot be depromoted to any type implicitly.