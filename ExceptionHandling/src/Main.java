import java.util.Scanner;

// for exception handling use try-catch block
//try block have line of code might be getting exception
//catch block have the explanation of exception means which type of exception.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println("division is : " + (a / b));
        }catch (Exception e){
            //Exception class is parent of all expection related classes
            //generally use specific exception if you aware of type of exception
            //otherwise use parent which will throw the appropriate exception

            System.out.println("division by zero not possible.");
        }finally{
            //compulsory finally block execute whether try/catch execute.
            //for example if you have taking input from user camera, if he allow or not camera should
            System.out.println("I am in finally block.");
        }
    }
}