import java.awt.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            //System.out.println("i = " + i);
        }

        //variables and data types in java
        //data type: Primitive and non primitive
        //primitive - by default java define it and user can use it directly. it can store only single value

        // by default number type of variable have int data type.
        // by default floating type of variable have double data type.

        int firstVariable =5;
        byte marks = 55;//primitive data type range(-128 to 127)
        boolean isPass = true;
        long phoneNum  = 9876543210L;
        float percentage=85.55F;
        double pi = 3.1456789999;


        //Non-primitive - it does not have define data type. user can define it and can store more than one value.
        //for example - it can be class, array.string

        String firstEssay = new String("This is first essay");
        Date newDate = new Date();

        // memory management
        //primitive data type are called "Call by value".

        int a = 5;
        int b = a;//here user assign a measn its value to b variable. now b is 5.
        System.out.println("-------------------\"Call by value\"---------------------");
        System.out.println("value of b is => "+b);

        a = 7; //user has change value of a to 7. but it wont change value of b. because it refer call by value.
        System.out.println("value of b after changing a is => "+b);

        // memory management
        //non-primitive data type are called "Call by reference".
        Point aa = new Point(1, 2);
        Point bb = aa;
        System.out.println("-----------------\"Call by reference\"-----------------------");
        System.out.println("value of b is => "+bb);
        aa.x = 4;
        System.out.println("value of b changing a is => "+bb);
        //it happend because in complex object data type when user define it, java allocate some memory space to that value.
        //in above declaration point i.e new Point(1, 2); have some memory space is allocated by java
        //as soon as user assign this point value to aa then java assign memory space reference that is address of variable where
        //this value is stored instead of actual value.
        //so when user assign aa to bb, it assign reference of that memory space not actual value.
        //thats why after changing the value of aa it also change value in bb. because both aa and bb pointing same reference of memory space.


        //------------String--------------------

        String strTest = new String("This is test string");//it will create two object . one in heap area and second is in string constant pool.
        //String strTest = "This is test string");//it will create one object only into string constant pool.
        //both declaration are valid.
        //String object are immutable. means you can not change its value once its created or define.

        String str2 = strTest.concat(" by Rahul");
        //it will combine this literal to original value of strTest and create new object with new reference.
        //and str2 with point to new reference
        // the literal value i.e. 'by rahul' is stored into strig constant pool.
        System.out.println("-----------------\"String\"-----------------------");
        System.out.println(strTest);
        System.out.println(str2);

        strTest = strTest.concat(" by Rahul2");
        System.out.println(strTest);
        //here now strTest will point to new object reference which is create by combining new literal "by Rahul2"
        //but it will not change original value of steTest i.e. "This is test string".
        //rather it just point out new reference.

        //So maaking string mutable means user want to change then there are two other classes in njava
        //1. StringBuffer
        //2. StringBuilder
        //both classes store in heaparea only therefore it can be change. both can perform fast as compare to String class.

    //-------------------------------Arrays---------------------------------------------------------//

        int[] studentMarks = new int[]{50,40,30,20};
        System.out.println("-----------------\"Arrays\"-----------------------");
        System.out.println(studentMarks + " <== This the memory location and hash code.");//you can not directly print array. it will print memory location and hash code.
        //for printing you can use array toString method or using loop
        System.out.println(Arrays.toString(studentMarks));

        //two-dimensional array

        int[][] studentMarksNew = new int[][]{{50,40},{30,20}};
        System.out.println("---two-dimensional array---");
        System.out.println(Arrays.deepToString(studentMarksNew));

    //-------------------------------Constant---------------------------------------------------------//
        //for declaring constant use "final" keyword.
        //final value can not be change once you declare and define.
        //naming convension is use caps letter with snake style convension.

        final float PI_IN_MY_PROGRAM = 3.14F;

    //-------------------------------Type casting---------------------------------------------------------//
        //large data type to small data type called type casting
        //implecit casting - small to large. this is done by java itself.
        //Consider the example of using a bucket and a mug. When you pour water from the mug into the bucket, it's easy to avoid spillage.
        // However, if you try to transfer water from the bucket into the mug, you're likely to spill a lot of water.

            int smallVal =10;
            long longVal = smallVal;

        //for casting large to small then you have to specify datatype before assigning.
            long largeNum = 10;
            int smallNum = (int) largeNum;

        //sequence of implicit casting small to large.
        // byte > short > int > long > float > double.
        // for converting input number from string to integer use utility classes.

        int strNum = Integer.parseInt("5");

        //if you try to parse string i.e. "Rahul" the will throw number format exception error.
        //int strNum2 = Integer.parseInt("Rahul"); // will throw exception

    //-------------------------------taking input from user---------------------------------------------------------//

        //for input use Scanner utility class

        Scanner scanner = new Scanner(System.in);//always pass system.in to scanner class
        //System.out.print("Enter Name: ");
       // String name = scanner.next();
        //System.out.println(name);

        //scanner.next() method work like as token. meand once you enter string and add space or other delimiter it will
        //consider it another token. theredore for whole line reading use nextLine method.

        System.out.print("Enter Name: ");
        String nameWhole = scanner.nextLine();
        System.out.println(nameWhole);
    }
}