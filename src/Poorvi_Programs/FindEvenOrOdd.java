package Poorvi_Programs;


import java.util.Scanner;

class EvenOdd{
    void evenOdd(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=sc.nextInt();
        if(number%2==0){
            System.out.println("Number is Even:" +number);
        }
        else {
            System.out.println("Number is odd:" +number);
        }




    }



}

public class FindEvenOrOdd {
    public static void main(String args[]){
        EvenOdd refEvenOdd=new EvenOdd();
        refEvenOdd.evenOdd();





    }
}
