package Java_project;

import java.util.Scanner;

public class Demo_Operators
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);

        System.out.println(" Please tell us your annual income");

        int annualincome=scan.nextInt();

        int monthlysalary;
//        arithemeticOperator
        monthlysalary=annualincome/12;

        float monthlytax=4.5f;

        float monthlytaxamount= monthlysalary*monthlytax /100 ;

        System.out.println(" MonthlyIncome :"+monthlysalary);
        System.out.println("Monthly Tax Amount"+monthlytaxamount);
//Assignmentoperator
        monthlysalary-=333;
        System.out.println(" round of your salary :"+monthlysalary);
//      relational operator
        System.out.println(annualincome>=monthlysalary); //true

//        logical
        System.out.println("AND O/P :"+
                ((annualincome>=250000) && (monthlytaxamount<=1000))
        );//false
        System.out.println("OR O/p :"+
                ( (annualincome>=250000) || (monthlytaxamount!=1000))
        );//true


//        TernaryOPerator


        boolean statement = ((annualincome == 280000) || (annualincome >=250000))?
                                 true :
                                false ;

        System.out.println(" annuali income is greater then 2.5 lakhs "+statement

        );
       }
}
