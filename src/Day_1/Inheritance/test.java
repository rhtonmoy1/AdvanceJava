package Day_1.Inheritance;

//Is-A relationship: Whenever one class inherits another class, it is called an IS-A relationship. --Inheritance
// Has-A relationship: Whenever an instance of one class is used in another class, it is called HAS-A relationship. --Aggregation

//Exercise 1 Single Inheritance
class Test extends Employee{
    int bonus = 100;
    public static void main(String[] args) {
       Test t = new Test();
        System.out.println("Salary = "+t.salary);
        System.out.println("Bonus = "+t.bonus);
    }
}

class Employee{
    int salary = 1000;
}


//Exercise 2 Multilevel Inheritance
class Animal{
    void eat(){
        System.out.println("eating bons");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("barking");
    }
}

class AnimalMain{
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.eat();
        obj.sound();
    }
}

//Exercise 3 Hierarchical Inheritance

class Bird{
    void fly(){
        System.out.println("Bird is flaying");
    }
}
class Chicken extends Bird{
    void sound(){
        System.out.println("Chock Chock");
    }
}

class Duck extends Bird{
    void sound(){
        System.out.println("pack pack");
    }
}

class BirdMain{
    public static void main(String[] args) {
        Chicken obj1 = new Chicken();
        Duck obj2 = new Duck();
        obj1.fly();
        obj1.sound();
        obj2.sound();
    }

}


//Exercise 4 Aggregation
class Operation{
    int square(int n){
        return n*n;
    }
}

class Circle{
    Operation obj = new Operation();
    double pi = 3.1416;
    double area(int redius){
        return pi*obj.square(redius);
    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        double result = obj.area(5);
        System.out.println("Area of a Circle is: "+result);
    }
}


