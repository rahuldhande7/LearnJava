package oops;
//Encapsulation
//Constructor
//Abstraction
//Inheritance
//Interface


//Inheritance - you can extend only one class
//Interface - you can implements or call multiple interface by adding comma after interface name.
public class Circle extends Shape implements Drawing{

    private static final double PI =3.14;
    private int radius;

    public Circle(int radius){
        super();//this method is use for call parent class constructor method.
        //it must be always first line
        //though user not called it will automatically call. it called constructor chaining.
        this.radius = radius;
        System.out.println("into constructor Circle");
    }
//    public void draw(){
//        System.out.println("--Drawing a Circle---");
//    }
    @Override
    public void printArea(){
        System.out.println("Area of Circle is : "+ 2 *PI*this.radius);
    }

    public void drawShape(){ }

    public void printShapeArea(){
        System.out.println("printShapeArea Area of Circle is : "+ 2 *PI*this.radius);
    }
}

