public abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) {
        this.radius = radius;
    }
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    double base, height;
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);
        Shape s3 = new Triangle(4, 5);
        System.out.println(s1.calculateArea());
        System.out.println(s2.calculateArea());
        System.out.println(s3.calculateArea());
    }
}
 {
    
}





abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPal extends Payment {
    void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

class BankTransfer extends Payment {
    void processPayment() {
        System.out.println("Processing bank transfer");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new BankTransfer();
        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}





abstract class Vehicle {
    abstract double calculateRent(int days);
}

class Car extends Vehicle {
    double calculateRent(int days) {
        return days * 1000;
    }
}

class Motorcycle extends Vehicle {
    double calculateRent(int days) {
        return days * 500;
    }
}

class Bicycle extends Vehicle {
    double calculateRent(int days) {
        return days * 200;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Motorcycle();
        Vehicle v3 = new Bicycle();
        System.out.println(v1.calculateRent(3));
        System.out.println(v2.calculateRent(3));
        System.out.println(v3.calculateRent(3));
    }
}








abstract class MenuItem {
    abstract void prepare();
}

class Appetizer extends MenuItem {
    void prepare() {
        System.out.println("Preparing appetizer");
    }
}

class MainCourse extends MenuItem {
    void prepare() {
        System.out.println("Preparing main course");
    }
}

class Beverage extends MenuItem {
    void prepare() {
        System.out.println("Preparing beverage");
    }
}

public class Main4 {
    public static void main(String[] args) {
        MenuItem m1 = new Appetizer();
        MenuItem m2 = new MainCourse();
        MenuItem m3 = new Beverage();
        m1.prepare();
        m2.prepare();
        m3.prepare();
    }
}





abstract class ManipulateShape {
    abstract void resize();
    abstract void rotate();
}

class CircleM extends ManipulateShape {
    void resize() {
        System.out.println("Resizing circle");
    }
    void rotate() {
        System.out.println("Rotating circle");
    }
}

class SquareM extends ManipulateShape {
    void resize() {
        System.out.println("Resizing square");
    }
    void rotate() {
        System.out.println("Rotating square");
    }
}

class TriangleM extends ManipulateShape {
    void resize() {
        System.out.println("Resizing triangle");
    }
    void rotate() {
        System.out.println("Rotating triangle");
    }
}

public class Main5 {
    public static void main(String[] args) {
        ManipulateShape s1 = new CircleM();
        ManipulateShape s2 = new SquareM();
        ManipulateShape s3 = new TriangleM();
        s1.resize(); s1.rotate();
        s2.resize(); s2.rotate();
        s3.resize(); s3.rotate();
    }
}








class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main6 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));
        System.out.println(c.add(2.5, 3.1));
        System.out.println(c.add(1, 2, 3));
    }
}













class Geometry {
    double calculateArea(double radius) {
        return 3.14 * radius * radius;
    }

    double calculateArea(double length, double width) {
        return length * width;
    }

    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }
}

public class Main7 {
    public static void main(String[] args) {
        Geometry g = new Geometry();
        System.out.println(g.calculateArea(5));
        System.out.println(g.calculateArea(4, 6));
        System.out.println(g.calculateArea(4, 5, true));
    }
}











class Employee {
    double calculateSalary() {
        return 30000;
    }
}

class Manager extends Employee {
    double calculateSalary() {
        return super.calculateSalary() + 10000;
    }
}

public class Main8 {
    public static void main(String[] args) {
        Employee e = new Manager();
        System.out.println(e.calculateSalary());
    }
}












class Account {
    double calculateInterest() {
        return 0;
    }
}

class SavingsAccount extends Account {
    double calculateInterest() {
        return 500;
    }
}

class FixedDepositAccount extends Account {
    double calculateInterest() {
        return 1000;
    }
}

public class Main9 {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount();
        Account a2 = new FixedDepositAccount();
        System.out.println(a1.calculateInterest());
        System.out.println(a2.calculateInterest());
    }
}










class Character {
    void attack() {
        System.out.println("Basic attack");
    }
}

class Warrior extends Character {
    void attack() {
        System.out.println("Warrior attacks with sword");
    }
}

class Mage extends Character {
    void attack() {
        System.out.println("Mage casts a spell");
    }
}

public class Main10 {
    public static void main(String[] args) {
        Character c1 = new Warrior();
        Character c2 = new Mage();
        c1.attack();
        c2.attack();
    }
}














abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Playing piano sound");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Playing guitar sound");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Playing violin sound");
    }
}

public class Main11 {
    public static void main(String[] args) {
        Instrument i1 = new Piano();
        Instrument i2 = new Guitar();
        Instrument i3 = new Violin();
        i1.playSound();
        i2.playSound();
        i3.playSound();
    }
}













