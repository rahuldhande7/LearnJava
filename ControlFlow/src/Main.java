//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        **----------comparison operator-------------**
        * use when single condition need to check
        * return boolean value i.e. true/false
             equal to ==
             not equal to !=
             greater than >
             greater than equal to >=
             less than <
             less than equal to <=
        */

        /*
        **----------Logical operator-------------**
        * use when need to compare more than one condition
        * return boolean value i.e. true/false

             and and &&
             or ||
             not !
        */

         /*
        **---------Conditional statement-------------**

             if - else
             if - else if - else
             switch
        */
        // you can not compare string directly using euqal to operator.
        int a =5, b =5;
        System.out.println(a == b);//comparing integer value

       // String  c = "Navin", d = "Navin";//condition is true. because pointing to same memory location
       // String  c = "Navin", d = "navin";//condition is false. because pointing to different memory location

        String c= "5", d="5";
        System.out.println(c.equals(d));    //comparing string value

        /**---------Iterative statement-------------**
            for loop
            while loop
            do while loop
            for-each
        */
        // do while loop mostly use for input validation
        // atleast condition will execute once.

        int num=5;
        do{
            //System.out.println(num);
            num++;
        }while (num < 10);

        //-----------------using for each loop-------------------
        int[] marks = new int[]{50,52,54,56};
        for(int mark : marks){
            //System.out.println(mark);
        }

        //-----using while loop --------------
        int i =0;
        while(i < marks.length){
           // System.out.println(marks[i]);
            i++;
        }


        // break - will break the flow and exit from loop

        int aa = 5;
        while(true){
            if(aa == 10) break;
            //System.out.println(aa);
            aa++;

        }

        // continue - if condition satisfied will skip the lines below that statement and flow will continue. it will not break and will not exit.

        int bb = 5;
        while(bb != 10){
            bb++;
            if(bb == 8) continue;
            System.out.println(bb);
        }
    }
}