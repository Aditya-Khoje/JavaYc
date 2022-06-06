import java.util.*;
import java.lang.Math;

abstract class shape {
    int a, b;

    abstract public void printarea();
}

class rectangle extends shape {
    public int area_rect;

    public void printarea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the length and breadth of the rectangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        area_rect = a * b;
        System.out.println("\nLength of rectangle: " + a + " Breadth of rectangle: " + b);
        System.out.println("\nThe area of the rectangle is: " + area_rect);
    }
}

class triangle extends shape {
    public int area_tri;

    public void printarea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter base and height of the Triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        area_tri = (a * b) / 2;
        System.out.println("\nBase of Triangle: " + a + " Height of Triangle: " + b);
        System.out.println("\nThe area of the triangle is: " + area_tri);
    }
}

class circle extends shape {
    public double area_circ;

    public void printarea() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter radius of the circle: ");
        a = sc.nextInt();
        area_circ = Math.PI * Math.pow(a, 2);
        System.out.println("\nThe radius of the circle is: " + a);
        System.out.println("\nThe area of the circle is: " + area_circ);
    }
}

class A5Area {
    public static void main(String[] args) {
        rectangle r = new rectangle();
        r.printarea();
        System.out.println(" ");
        triangle t = new triangle();
        t.printarea();
        System.out.println(" ");
        circle c = new circle();
        c.printarea();
    }
}
