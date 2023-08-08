package sample1;

import java.util.Scanner;
import static java.lang.System.exit;

public class WaterUsage {
    public static void main(String[] args) {


    int usage=0;
    int cost=0;
        System.out.println("enter the usage of water=");
        Scanner sc= new Scanner(System.in);
        usage=sc.nextInt();

         if (usage>=0 && usage< 500 )
             cost=0;
               else if (usage >=500 && usage <=1000)
             cost=usage*4;
         else if (usage >1000)
            cost=usage*7;
         else if (usage<0) {
             System.out.println("invalid input");
             exit(0);
         }
         System.out.println("amount to be paid="+cost);


         }

    }


