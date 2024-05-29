package Java_project;

import java.util.Scanner;

public class Demo_Looping
{
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args)
    {
        Demo_Looping loop=new Demo_Looping();
//        loop.For_Loop();

//        loop.While_Loop();

        loop.dowhile_loop();
    }

    public void For_Loop()
    {
        System.out.println("you can build up to 5 transactions (withdraw or deposit)");

        int balance =78000;
        for(int i=1;i<=5;i++)
        {
            System.out.println("transaction count :"+i+"withdraw(w) or deposit(d)");
            char choice=scan.next().charAt(0);
            if(choice=='w' || choice== 'W')
            {
                System.out.println("enter your withdraw amount ..!");
                int withdraw=scan.nextInt();

                if(balance>=withdraw)
                {
                    balance-=withdraw;
                }
            }
            else if(choice=='d' || choice == 'D')
            {
                System.out.println("Enter your deposit amount");
                int deposit=scan.nextInt();

                balance+=deposit;
            }
            System.out.println("current balance :"+balance);
        }


        System.out.println(" Final bank routine balance:"+balance);
    }

    public void While_Loop()
    {
        System.out.println("Poorvika mobile shop..!");
        int available=20;
        int topayable;
        int quantity;

        while (available>0)
        {
            System.out.println(" how many redmi mobiles you want");
            quantity=scan.nextInt();

            if(quantity<=available)
            {
                topayable=quantity*15000;
                System.out.println("pay this amount  :"+topayable);
                System.out.println("Enter your amount");
                int amount =scan.nextInt();

                if(topayable<=amount)
                {
                    System.out.println(" you bought redmi mobiles..!");
                    available-=quantity;
                }
                else
                {
                    System.out.println("insuffient amount");
                }

                System.out.println(" currently available mobile count is :"+available);
            }
        }

    }

    public void dowhile_loop()
    {
        int count =0;
        int staffcount=5;
        do
        {
            System.out.println("Staff Registerno :"+staffcount);
            System.out.println(" Enter your entry time ?");
            double time=scan.nextDouble();

            if((time>=8.0) &&( time<=9.0))
            {
                System.out.println("Perfect Time....!");
            }
            else
            {
                System.out.println("imperfect time -your salary is decrease 10%");
                count++;
            }

            staffcount--;

        }
        while(staffcount>0);

        System.out.println("today late comer staff count :"+count);

    }
}
