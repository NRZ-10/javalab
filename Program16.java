// File: TestPackage_figures.java

package Test;

import java.util.Scanner;

// ---------- Interfaces ----------

interface FigureSq
{
    int perimeter();
    int area();
}

interface FigureCi
{
    double perimeter();
    double area();
}

interface FigureTr
{
    int perimeter();
    double area();
}

// ---------- Square Class ----------

class Square implements FigureSq
{
    private int side;

    public Square(int s)
    {
        side = s;
    }

    public int perimeter()
    {
        return (4 * side);
    }

    public int area()
    {
        return (side * side);
    }
}

// ---------- Circle Class ----------

class Circle implements FigureCi
{
    private double radius;

    public Circle(double r)
    {
        radius = r;
    }

    public double perimeter()
    {
        return (2 * 3.14 * radius);
    }

    public double area()
    {
        return (3.14 * radius * radius);
    }
}

// ---------- Triangle Class ----------

class Triangle implements FigureTr
{
    private int side1, side2, side3;

    public Triangle(int s1, int s2, int s3)
    {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public int perimeter()
    {
        return (side1 + side2 + side3);
    }

    public double area()
    {
        // Heron's Formula
        double s = (side1 + side2 + side3) / 2.0;

        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}

// ---------- Main Class ----------

public class TestPackage_figures
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        // Square
        System.out.print("Enter the side of Square: ");
        int s = sc.nextInt();

        Square sq = new Square(s);

        System.out.println("Perimeter : " + sq.perimeter());
        System.out.println("Area      : " + sq.area());

        // Circle
        System.out.print("\nEnter the radius of Circle: ");
        int r = sc.nextInt();

        Circle ci = new Circle(r);

        System.out.println("Perimeter : " + ci.perimeter());
        System.out.println("Area      : " + ci.area());

        // Triangle
        System.out.print("\nEnter side1 of Triangle: ");
        int s1 = sc.nextInt();

        System.out.print("Enter side2 of Triangle: ");
        int s2 = sc.nextInt();

        System.out.print("Enter side3 of Triangle: ");
        int s3 = sc.nextInt();

        Triangle tr = new Triangle(s1, s2, s3);

        System.out.println("Perimeter : " + tr.perimeter());
        System.out.println("Area      : " + tr.area());

        sc.close();
    }
}
