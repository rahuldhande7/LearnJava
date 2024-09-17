package oops;

//abstrct class means it is incomplete
//you can declare it. its defination implemented by child class who will inherit.
//user can not create object of abstract class
//abstract class can be use in inheritance using extends keyword.
//abstract class must have one abstract method whos defination must be written by child class
//you can declare variable inside abstartc class.

public abstract class Shape {

    public Shape(){
        System.out.println("Inside Shape Constructor---");
    }
    public void draw(){
        System.out.println("--Drawing a Shape---");
    }

    public abstract void printArea();//this is abstratc method without defination.
}
