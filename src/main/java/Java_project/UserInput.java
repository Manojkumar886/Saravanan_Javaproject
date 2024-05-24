package Java_project;

import java.util.Scanner;


public class UserInput {
    public static void main(String[] args)
    {

        Scanner scan=new Scanner(System.in);

//        System.out.println(" what is you current lPA");
//
//        float currentLPA =scan.nextFloat();

        System.out.println(" Enter your accountHoldername");

        String accHoldername=scan.nextLine();
//
//        System.out.println("Balance");
//
//        double currentBalance=scan.nextDouble();

//        System.out.println("Current Balance"+currentBalance);
//        System.out.println("LPA"+currentLPA);
        System.out.println("Holdername"+accHoldername);

    }
}
