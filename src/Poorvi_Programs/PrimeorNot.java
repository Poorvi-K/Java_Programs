package Poorvi_Programs;

import java.util.Scanner;

class Prime{

    void primeNum(){
        int temp=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Please enter a number :");
        int number=sc.nextInt();

        for(int i=2; i<=number-1;i++) {

            if (number % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp > 0) {
            System.out.println("Entered number is not prime");
        }
            else {
                System.out.println("Number is prime");
            }
        }






    }




public class PrimeorNot {
    public static void main(String args[]){
        Prime refprime=new Prime();
        refprime.primeNum();




    }
}
