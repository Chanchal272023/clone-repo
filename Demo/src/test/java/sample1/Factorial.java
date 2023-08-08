package sample1;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {


        int number,fact=1;
        System.out.println("please enter the number");
        Scanner sc= new Scanner(System.in);
        number=sc.nextInt();
        for(int i=2;i<=number;i++)
            fact=fact*i;
        System.out.println("factorial of number="+fact);

    }
}