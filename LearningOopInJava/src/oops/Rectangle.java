package oops;

//Encapsulation
//Constructor
//Abstraction
public class Rectangle {
    //public int length, breadth;
    private int area;

    public Rectangle(int length, int breadth){
        this.area = length * breadth;
        System.out.println("into constructor Recctangle");
    }
    public void draw(){
        System.out.println("--Drawing a Rectangle---");
    }

    public void printArea(){
        System.out.println("Area is : "+this.area);
    }
}
