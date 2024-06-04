package Java_project.Inheritance.singleinheritance;

import java.util.Scanner;

public class MyAccount
{
    static Scanner scan=new Scanner(System.in);
    String account_holder="manojkumar M";
    long account_number=32753627326l;
    float account_balance=12728.34f;

    public void withdraw(float withdrawamount)
    {

        if(withdrawamount<=account_balance)
        {
            account_balance-=withdrawamount;
            System.out.println(withdrawamount+" withdraw succfully");
            System.out.println("current balance :"+account_balance);
        }
        else
        {
            System.out.println(" insuffient bank balance");
        }
    }


    public void deposit(float depositamount)
    {

        account_balance+=depositamount;
        System.out.println("added successfully"+" \n current balance :"+account_balance);
    }

    public static void main(String[] args) {

        MyAccount account1=new MyAccount();

        account1.withdraw(1800.45f);
        account1.deposit(90300.45f);


    }

}
