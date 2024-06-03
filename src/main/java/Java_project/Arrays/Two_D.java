package Java_project.Arrays;

public class Two_D
{
    public static void main(String[] args)
    {

//        int [][]matrix ={{23,45,67},{56,7646,45},{75,3523,34}};


        int [][] matrix =new int[3][3];

//        matrix[0][2]=45;
//        matrix[2][1]=78;
        int count=10;

//        add a values

        for(int row=0;row<matrix.length;row++)
        {

            for(int column=0;column<3;column++) {
                matrix[row][column] = count;
                count += 10;
            }
        }


//        print two-d array

        for(int row=0;row<matrix.length;row++)
        {
            for(int column=0;column<3;column++)
            {
                System.out.print(matrix[row][column]+" ");
            }
            System.out.println();
        }


    }
}
