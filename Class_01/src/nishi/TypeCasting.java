package nishi;

import java.util.Scanner;

public class TypeCasting
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
//        float num=sc.nextFloat();
//        System.out.println(num);
//        int nu1m= (int)(56.36);// type casting it is

        //automatic type promoption in expression
        int a=289;
        byte b = (byte)(a);
        System.out.println(b); // for the greater it would show i:e :289%256
        //consider the example

        byte exp1=10;
        byte exp2=22;
        byte exp3=33;
        byte exp4=44;


        int sum=exp1+exp2+exp3+exp4;// here the intermediate file exceedint the byte size after the some eva
        // evaluation java automatic converts it into the int type for it
        int number ='a';
        System.out.println("こんにちは");






        System.out.println(sum);
        byte bi=43;
        char c='a';
        short s=1025;
        int i=100;
        float f=3.14f;
        double d= 23.2222;
    }
}
/* the rule book is that one piece is real*/
