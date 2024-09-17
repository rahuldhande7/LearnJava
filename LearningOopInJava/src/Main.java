import oops.Circle;
import oops.PolyClass;
import oops.Rectangle;
import oops.Shape;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public  class Main {
    //Rectangle rect1;
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(7,3);
        //rect1.length=5;
       // rect1.breadth=4;
        rect1.draw();
        rect1.printArea();

        Circle c1 = new Circle(8);
        c1.draw();
        c1.printArea();
        c1.printShapeArea();

        Shape shape = new Circle(8); // user can refer child class object.
        //here Shape is parent class and Circle is child class.
        //child cannot refer parent class object.
        //method are called of object not class. here method of Circle class will called.
        shape.draw();
        shape.printArea();
        //shape.printShapeArea(); // this line have error. shape is object of circle class
        //here shape is idetifier of Shape class that is parent class so parent child sharing smae method
        //but child class additionally implementing interface and printShapeArea() is method of that interface
        //therefore shape does not know about this method.
        //circle class identifier can call this method

        //----------------------polymorphisam---------------/

        PolyClass pc = new PolyClass();
        System.out.println("sum is: "+pc.add(5,6)); // add method have two parameters
        System.out.println("sum is: "+pc.add(5,6,9));// add method have three parameters
    }
}