package Poorvi_Programs;

import java.util.Scanner;

class FindLeapYear{

    void findLeapYear(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter four year: ");
        int year=sc.nextInt();

        if(year %400==0 ||(year %4==0 && year%100!=0)){

            System.out.println("Entered Year is Leap Year:" +year);
        }
        else{
            System.out.println("Entered Year is not Leap Year" +year);
        }



    }






}
public class LeapYear {
    public static void main(String args[]){
        FindLeapYear reffindleap=new FindLeapYear();
        reffindleap.findLeapYear();



    }
}
