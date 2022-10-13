package Poorvi_Programs;

import java.util.Scanner;

class RevString{

    void revString(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word=sc.next();
        int len=word.length();
        String rev="";

        for(int i=len-1;i>=0;i--){

            rev=rev+word.charAt(i);


        }
        System.out.println(rev);



    }



}



public class ReverseString {
    public static void main(String args[]){
RevString refrevstring=new RevString();
refrevstring.revString();


    }
}
