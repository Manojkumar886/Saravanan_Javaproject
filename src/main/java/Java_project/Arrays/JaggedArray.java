package Java_project.Arrays;

public class JaggedArray
{
    public static void main(String[] args)
    {

        int [][] TransactionHistory=
                {
                        {4500,9000,-4500,-2000}, //account-1
                        {130,4434,10000},//account-2
                        {500,500},//account-3
                        {6700,9000,890,-12000,-100} //account-4
                };

        for(int row=0;row<TransactionHistory.length;row++)
        {
            for(int column=0;column< TransactionHistory[row].length ;column++)
            {
                System.out.print(TransactionHistory[row][column]+"    ");
            }
            System.out.println();
        }


    }
}
