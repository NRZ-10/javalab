import java.util.Scanner;

class AreaShapes {

    // Area of Circle
    double area(double r) {
        return 3.14 * r * r;
    }

    // Area of Rectangle
    double area(double l, double b) {
        return l * b;
    }

    // Area of Triangle
    double area(double b, double h, int x) {
        return 0.5 * b * h;
    }

    public static void Aofshapes(String[] args) {

        Scanner sc = new Scanner(System.in);
        AreaShapes obj = new AreaShapes();

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        System.out.println("Area of Circle = " + obj.area(r));

        System.out.println("Enter length and breadth of rectangle:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle = " + obj.area(l, b));

        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Area of Triangle = " + obj.area(base, height, 1));

        sc.close();
    }
}
