package Poorvi_Programs;
class SwapNumb{
    int a=10;
    int b=20;
    int t;

    void swapNumb(){
        t=a;
        a=b;
        b=t;
        System.out.println("Value of a is: " +a);
        System.out.println("Value of b:" +b);


    }




}

public class SwapNumber {
    public static void main(String args[]){
        SwapNumb refswap=new SwapNumb();
        refswap.swapNumb();





    }
}
