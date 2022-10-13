package Poorvi_Programs;

import java.util.Scanner;

class ReverseNumbers{

    void reverseNum(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter two digit number: ");
        int number=sc.nextInt();
        int remainder;
        int reversenumber=0;


        while (number!=0){

            remainder=number%10;
           reversenumber=reversenumber*10+remainder;
            number=number/10;
        }

      System.out.println(reversenumber);



    }



}

public class ReverseNumber {
    public static void main(String args[]){
        ReverseNumbers refrevnumber=new ReverseNumbers();
        refrevnumber.reverseNum();


    }
}
