package sample1;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

  int number,count=0;
        System.out.println("please enter the number to check its prime or not");
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        for (int i=2;i<number;i++)
        {
              if ((number%i)==0)
               count=count+1;
        }
        if (count==0)
            System.out.println("number is prime");
        else System.out.println("number is not prime");




}
}