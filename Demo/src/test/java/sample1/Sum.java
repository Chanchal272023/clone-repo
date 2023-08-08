package sample1;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {


        int number,sum=1;
        System.out.println("please enter the number");
        Scanner sc= new Scanner(System.in);
        number=sc.nextInt();
         for(int i=2;i<=number;i++)
             sum=sum+i;
        System.out.println("sum of "+number+" numbers="+sum);

}
}