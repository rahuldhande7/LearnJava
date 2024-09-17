import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //write equation s = ut + 1/2a t*t

        //input u , t and a value.
        Scanner scanner = new Scanner(System.in);
        double initVelocity , time;

        do {
            System.out.print("Enetr initial velocity :");
            initVelocity = scanner.nextDouble();
        } while(initVelocity < 0); //it will check condition until getting value more than zero. if less than zero will ask again to enter value

        do {
            System.out.print("Enetr time :");
            time = scanner.nextDouble();
        }while(time < 0);//it will check condition until getting value more than zero. if less than zero will ask again to enter value

        System.out.print("Enetr accelration :");
        double accelration = scanner.nextDouble();

        double distance = (initVelocity * time ) + (0.5 * accelration * Math.pow(time,2));

        System.out.println("distance is : "+distance);
    }
}