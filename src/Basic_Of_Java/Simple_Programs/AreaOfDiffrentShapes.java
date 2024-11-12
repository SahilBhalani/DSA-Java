package Basic_Of_Java.Simple_Programs;

public class AreaOfDiffrentShapes {
    public static void main(String[] args) {

        Circle(21.5);
        triangle(10.7,20.9);
        rectangle(20.6,10.9);
        isoTriangle(60.5,80.4);
        parallelogram(40.1,50.9);
        rhombus(30.4,50.5);
        equiTriangle(55.6);
    }
    static void Circle(double radius) {
         double area = (3.14 * radius * radius);
        System.out.println("Area Of Circle :"+area);
    }

    static void triangle(double breadth,double lenght) {
        double area = 0.5 * (breadth * lenght);
        System.out.println("Area Of triangle :"+area);
    }

    static void rectangle(double width,double lenght) {
        double area = width * lenght;
        System.out.println("Area Of rectangle :"+area);
    }

    static void isoTriangle(double base,double lenght) {
        double area = (1 *base * lenght) / 2;
        System.out.println("Area Of isoTriangle :"+area);
    }

    static void parallelogram(double base,double height) {
        double area = base * height;
        System.out.println("Area Of Parallelogram :"+area);
    }

    static void rhombus(double diagnol1,double diognol2) {
        double area = (diagnol1 * diognol2) / 2;
        System.out.println("Area Of Rhombus :"+area);
    }

    static void equiTriangle(double side) {
        double area = Math.sqrt(3) / 4 * side * side;
        System.out.println("Area Of EquiTriangle :"+area);
    }

}


