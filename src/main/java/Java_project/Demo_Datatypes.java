package Java_project;

public class Demo_Datatypes {
    public static void main(String[] args) {

        System.out.println(" Welcome to java full stack course");

        long creditcard_no =7383783792783l;

        System.out.println(" Bajaj card no is :"+creditcard_no);

        int min_ninedigit=(int)creditcard_no;
        System.out.println("long to int (narrowing)"+min_ninedigit);


        char gender='z';

        int MletterByeno=gender;


        System.out.println(" gender"+gender+"\n MletterByeno"+MletterByeno);

        int bytevalue=127;

        char lastbytenovalue = (char) bytevalue;

        System.out.println(lastbytenovalue);

//        typeparsing

        String sslcregisterno ="1424017";

        int sslcregno=Integer.parseInt(sslcregisterno);

        System.out.println(" String value regno "+sslcregisterno);
        System.out.println(" int value registerno"+sslcregno);

        }
}
