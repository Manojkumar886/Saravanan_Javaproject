package Java_project;

import java.util.Scanner;
import java.util.zip.ZipError;

public class using_methodsvariables
{
   static Scanner scan=new Scanner(System.in); //static object
    static int a=78;//static variable

    String PerformarName="Manojkumar Madheswaran";//Global variable

    public static void main(String[] args)
    {
        String content="type of method performance";  //Instance variable


        using_methodsvariables obj=new using_methodsvariables(); //Object creation

        obj.swappingtwonumbers();

        System.out.println(" static variable a value is :"+a);

        System.out.println(" Global variable value is :"+ obj.PerformarName);


    }

//    noreturntype and no arguments
    public void swappingtwonumbers()
    {
        System.out.println(" Enter your b value");
        int b=scan.nextInt();//Localvariable
        System.out.println("Before swapping : a="+a+" b="+b);

        int temp= a; //Local Variable
         a= b;

         b=temp;
        System.out.println("After swapping : a="+a+" b="+b);


    }
}
