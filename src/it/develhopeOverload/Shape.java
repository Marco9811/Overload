package it.develhopeOverload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("Creating shape...");
        this.shapeName = null;
    }
    public Shape(double radius){
        System.out.println("Creating shape...");
        this.shapeName = "Circle";
    }

    public Shape(int edges, double edgeLenght){
        System.out.println("Creating shape...");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2){
        System.out.println("Creating shape...");
        this.numberOfEdges = edges;
        this.shapeName = "Rectangle";
    }

    public Shape(int edges, double e1, double e2, double e3){
        System.out.println("Creating shape...");
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
    }

    public String getShapeDetails(){return "Shape: " + this.shapeName + "  NumberOfEdges: " + numberOfEdges;}
}
