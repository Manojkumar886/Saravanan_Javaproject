package Java_project;

import java.util.Scanner;

public class Demo_ControlStatements
{
   static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {
        Demo_ControlStatements obj=new Demo_ControlStatements();



        System.out.println("Welcome To Zealous Bank...!");
        System.out.println(" Enter your current balance");
        float balance=scan.nextFloat();

        System.out.println("1.Check Balance");
        System.out.println("2.Withdraw");
        System.out.println("3.Deposit");
        System.out.println("4.DrivingInsurance validity");
        System.out.println(" Choose any one");

        int choice=scan.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Current Balance :"+balance);
                break;
            case 2:
               balance= obj.withdraw(balance);

                break;
            case 3:
                balance= obj.deposit(balance);
                System.out.println("Current Balance :"+balance);
                break;
            case 4:
                obj.drivinginsurance();
                break;
            default:
                System.out.println(" only used positive values...!");

        }

    }

//    with return and with arguments
    public float withdraw(float balance)
    {
        System.out.println("enter your withdraw amount");

        int debitamount =scan.nextInt();

        if( (balance>=debitamount))
        {
            balance-=debitamount ;
            System.out.println(debitamount+" withdraw successfully");
            System.out.println("Current Balance : "+balance);
        }
        else if (balance<=debitamount)
        {
            System.out.println("insufficient Bank balanace");
            System.out.println("Current Balance : "+balance);
        }
        else
        {
            System.out.println("Server Error");
        }
        return balance;
    }


    public float deposit(float balance)
    {
        System.out.println("enter your deposit amount");
        int deposit=scan.nextInt();

        balance+=deposit;

        return balance;
    }

    public void drivinginsurance()
    {
        System.out.println("Enter your age :");
        int age =scan.nextInt();

        boolean hasdrivinginsurancestatus =true ;

        if(age >18)
        {
            System.out.println(" your insurance is eligible for good driving perforamnce");
            if(age==25)
            {
                if(hasdrivinginsurancestatus ==true) {
                    System.out.println(" the insurance rate is $4500");
                }
            }
            else
            {
                System.out.println(" the insurance rate is below $1000");
            }
        }
        else
        {
            System.out.println(" this age user is not eligible for driving insurance");
        }
    }
}
