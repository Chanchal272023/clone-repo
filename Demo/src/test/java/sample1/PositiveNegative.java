package sample1;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {


        int number;
        System.out.println("please enter the number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number>0)
            System.out.println("number is positive");
        else System.out.println("number is negative");
    }
}