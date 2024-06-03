package Java_project.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DemoCreate_List
{
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args)
    {
        String [] IT_Companies={"Accenture","Wipro","TCS","Infosys","First American","SLK","CTS"};

//        TOSTRING METHOD
//        System.out.println(Arrays.toString(IT_Companies));

//        System.out.println(IT_Companies.length);
//        System.out.println(IT_Companies[0]);

//        FOR LOOP
//        for(int index=0;index<IT_Companies.length;index++)
//        {
//            System.out.println(IT_Companies[index]);
//        }


//        FOR EACH
//        for(String TOP : IT_Companies)
//        {
//            System.out.println(TOP);
//        }


//        RUN TIME DECLARATION

        int [] oddnumbers =new int[10];

//        oddnumbers[9]=77;
//        oddnumbers[2]=99;
//        oddnumbers[1]=55;
//        System.out.println(Arrays.toString(oddnumbers));


//        for(int size=0;size< oddnumbers.length;size++)
//        {
//            Scanner scan=new Scanner(System.in);
//            System.out.println(size+" position value is ");
//
//            oddnumbers[size]=scan.nextInt();
//        }
//
//
//        System.out.println(Arrays.toString(oddnumbers));

        System.out.println(" Before update IT_COMPANY"+Arrays.toString(IT_Companies));
        System.out.println(" which position of value u want delete in IT company");
        int pos =scan.nextInt();
        System.out.println(pos+" in this position of value is "+IT_Companies[pos]+" please replace new company");
        String newcompany =scan.next();
        IT_Companies[pos]=newcompany;

        System.out.println(" After update IT_COMPANY"+Arrays.toString(IT_Companies));
    }

}
