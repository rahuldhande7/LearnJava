package oops;
//polymorphisam
//it means many forms means many types


public class PolyClass {
    // in polymorphisam you can define same name of method but each method have different numbers of parameters.
    //this is also called method overloading
    // method overloading means multiple behaviour based on argument.
    // method overwriting means writing new defination of the method of parent class.

    public int add(int a, int b){// here add method have two parameters
        return  a+b;
    }

    public int add(int a, int b, int c){// here add method have three parameters
        return  a+b+c;
    }

}

