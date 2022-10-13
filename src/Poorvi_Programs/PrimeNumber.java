package Poorvi_Programs;



class PrintPrime{

    void primenumb(){

        for(int i=1; i<=100;i++){
            int temp=0;

            for(int j=2; j<=i-1;j++) {

                if (i % j == 0) {

                    temp = temp + 1;
                }
            }

                if(temp==0){
                    System.out.println(i);
                }
            }


        }




    }








public class PrimeNumber {
    public static void main(String args[]){

PrintPrime refprime=new PrintPrime();
refprime.primenumb();


    }
}
