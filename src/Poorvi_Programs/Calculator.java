package Poorvi_Programs;

import java.util.Scanner;

class CalculatorMachine{

    void calculations(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the First Number:");
         int firstnumber=sc.nextInt();
         System.out.println("Please enter Secondnumber:");
         int secondnumber= sc.nextInt();
         System.out.println("Please enetr the mathmatical symbol:(*,%,+,-)");
         String symbol=sc.next();
         int res;

         switch(symbol){


             case"-":
                 res=firstnumber-secondnumber;
             System.out.println("Subtraction is :" +res);
             break;

             case"+":
                 res=firstnumber+secondnumber;
                 System.out.println("Addition of two number is :" +res);
                 break;

             case "*":
                 res=firstnumber*secondnumber;
                 System.out.println("Product of two number is: " +res);
                 break;

             case"/":
                 res=firstnumber/secondnumber;
                 System.out.println("Division is:" + res);
                 break;

             default:
                 System.out.println("Invalid symbol");
                 break;





         }



    }

}

public class Calculator {
    public static void main(String args[]){
        CalculatorMachine refcal=new CalculatorMachine();
        refcal.calculations();


    }
}
