public class Introduction {

    public static void main(String args[]) {  //Main method
        /*System.out.println("Welocme Deloitte team to java Training");
        int a=10;
        float b=25f;
        long c=100000l;
        double d=123.45d;

       // int studentno; //Single line comments
        /*int StudentNo;   Multiline comments
        int studentNo;

       // int studentRollNo  ;  //Variable lowerCamelCase

       // public void calculateTotalAmount(){  } //Method

        //Classname & Interface  ==>UpperCamelCase

       // public class UserDetails ();
       // public interface AccountDetails();
        //public static final int MAX_COUNT_VALUES=100;  //Constants

        System.out.println("Int"  + a);
        System.out.println("float"  + b);
        System.out.println("long"  + c );
        System.out.println("Double variable"  + d); */

        //If -Statment

      /*  int x=30;
        if(x<20){
            System.out.println("Condition true execute me");
        }
        else if(x==25){
            System.out.println("Condition false excute me ");
        }
        else if(x==40){
            System.out.println("yes it's 40");
        }
        else{
            System.out.println("Nothing Matched");
        }

    }*/

        //Looping Concept
        //for loop
        //while loop
        //do-while loop
        //switch statment

        /*for(Intization : Condition : update ){
            //code
        }
         */
      /*  for (int i = 0; i < 5; i++)
            System.out.println("Iteration:  " + i);*/



    /*while (Condition){
            //code
    }

     */

      /*  int count = 0;
        while (count < 5) {
            System.out.println("count: " + count);
            count++;
        }

        /*do{
            //code
        }while (Condition)
         */
       /* int cal=10;
        do{
            System.out.println("cal " +cal);
            cal++;
        }while(cal<5);

        /*switch(expression){
        Case 1:
           //code
        break;
        Case 2:
            //code
        break;

        default :

        }
         */

        String season="Spring";

        switch(season){
            case "Summer":
                System.out.println("It's summer");
                break;
            case "Spring":
                System.out.println("It's Spring");
                break;
            case "Autumn":
                System.out.println("It's a Autumn");
                break;
            default:
                System.out.println("It's a default");
                break;
        }

        //Switch  Java -12+
        int day=10;
        String dataType=switch (day){
            case 1,2,3,4,5 ->"weekday";
            case 6,7 ->"Weekend";
            default ->"Invalid day";
        };
        System.out.println("it's a " +dataType);

    }
}

