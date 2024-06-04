package Java_project.Inheritance.singleinheritance;

public class Transaction extends MyAccount
{

    public void MyExample()
    {
        System.out.println("Current class Method");
    }
    public static void main(String[] args) {

        Transaction t1=new Transaction();
        t1.deposit(345.6f);
        t1.withdraw(6778.78f);
        t1.MyExample();
    }
}
