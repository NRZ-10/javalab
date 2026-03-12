import java.util.Scanner;

class Aofshapes {

    // area of circle
    double area(double r) {
        return 3.14 * r * r;
    }

    // area of rectangle
    double area(double l, double b) {
        return l * b;
    }

    // area of triangle
    double area(float b, float h) {
        return 0.5 * b * h;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        Aofshapes obj = new Aofshapes();

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");

        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        switch(ch) {

            case 1:
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                System.out.println("Area of Circle = " + obj.area(r));
                break;

            case 2:
                System.out.print("Enter length: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth: ");
                double b = sc.nextDouble();
                System.out.println("Area of Rectangle = " + obj.area(l,b));
                break;

            case 3:
                System.out.print("Enter base: ");
                float base = sc.nextFloat();
                System.out.print("Enter height: ");
                float h = sc.nextFloat();
                System.out.println("Area of Triangle = " + obj.area(base,h));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
