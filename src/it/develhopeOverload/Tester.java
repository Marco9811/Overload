package it.develhopeOverload;


public class Tester {
    public static void main(String[] args) {
        Shape circleobj = new Shape(15.5);
        Shape squareobj = new Shape(4, 2.5);
        Shape rectangleobj = new Shape(4, 2.2,5.5);
        Shape triangleobj = new Shape(3, 2.4,2.5,2.8);
        Shape undefinedobj = new Shape();

        String circle = circleobj.getShapeDetails();
        String square = squareobj.getShapeDetails();
        String rectangle = rectangleobj.getShapeDetails();
        String triangle = rectangleobj.getShapeDetails();
        String undefined = undefinedobj.getShapeDetails();

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(triangle);
        System.out.println(undefined);
    }
}
