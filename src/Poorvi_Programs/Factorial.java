package Poorvi_Programs;

import java.util.Scanner;

class Factorials{



   void factorials(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number=sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;

        }
        System.out.println(fact);
    }



}

public class Factorial {
    public static void main(String args[]){

Factorials reffact=new Factorials();
reffact.factorials();

    }
}
