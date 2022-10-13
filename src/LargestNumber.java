import java.util.Scanner;

class LargestNum{

    void bigNum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter FirstNumber:");
       int firstNumber=sc.nextInt();
       System.out.println("Please enter SecondNumber:");
       int secondNumber=sc.nextInt();
       if(firstNumber>secondNumber){
           System.out.println("FirstNumber is greater than second number");
       }
       else{
           System.out.println("Second Number is Greate than First Number");
       }




    }

}





public class LargestNumber {
    public static void main(String args[]){
        LargestNum reflarge=new LargestNum();
        reflarge.bigNum();




    }
}
