package Java_project.Constructor;

public class DemoDefault_param
{
    int widht;
    int heights;
//    Default Constuctor
    public DemoDefault_param()
    {
        System.out.println("Default..!");
    }

//    Parameterized COnstrutot
    public DemoDefault_param(int width,int height)
    {

        this.widht=widht;  //same this keywords
        heights=height;
        System.out.println(" height * width = "+(width * heights) );
    }

    public static void main(String[] args)
    {

//        DemoDefault_param param1=new DemoDefault_param(10,20);

//        DemoDefault_param param2=new DemoDefault_param();


        new DemoDefault_param();

        new DemoDefault_param(12,10);

     }
}
