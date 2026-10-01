import java.util.*;
import java.lang.*;
import java.io.*;

abstract class shape {

    abstract double area();

    abstract int perimeter();
}

class rectangle extends shape {

    int l;
    int b;

    rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    @Override
    double area() {
        return l * b;
    }

    @Override
    int perimeter() {
        return 2 * (l + b);
    }
}

class triangle extends shape {

    int a;
    int b;
    int c;

    triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        return 0.5 * b * c;
    }

    @Override
    int perimeter() {
        return a + b + c;
    }
}

class square extends shape {

    int a;

    square(int a) {
        this.a = a;
    }

    @Override
    double area() {
        return a * a;
    }

    @Override
    int perimeter() {
        return 4 * a;
    }
}

class circle extends shape {

    int r;

    circle(int r) {
        this.r = r;
    }

    @Override
    double area() {
        return 3.14 * r * r;
    }

    @Override
    int perimeter() {
        return (int)(2 * 3.14 * r);
    }
}

class Codechef {

    public static void main(String[] args) throws java.lang.Exception {

        rectangle r1 = new rectangle(3, 4);
        triangle t1 = new triangle(4, 3, 2);
        circle c1 = new circle(4);
        square s1 = new square(2);

        System.out.println("Rectangle Area: " + r1.area());
        System.out.println("Rectangle Perimeter: " + r1.perimeter());

        System.out.println("Triangle Area: " + t1.area());
        System.out.println("Triangle Perimeter: " + t1.perimeter());

        System.out.println("Circle Area: " + c1.area());
        System.out.println("Circle Perimeter: " + c1.perimeter());

        System.out.println("Square Area: " + s1.area());
        System.out.println("Square Perimeter: " + s1.perimeter());
    }
}