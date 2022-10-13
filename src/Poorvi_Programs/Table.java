package Poorvi_Programs;

import java.util.Scanner;

class Tables{
    void table(){

        Scanner sc= new Scanner(System.in);
        System. out.println("Please enter the number: ");
        int number=sc.nextInt();


        for(int i=1;i<=10;i++){

           System.out.println(number*i);
        }


    }





}
public class Table {
    public static void main(String args[]){
        Tables reftable=new Tables();
        reftable.table();



    }
}
