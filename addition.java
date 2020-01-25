import java.util.Scanner;
public class addition
{
public static void main(String []ar)
{

        Scanner sc=new Scanner(System.in);
        System.out.print("enter name");
       String name=sc.next( );
       System.out.print("Enter no1 & no2");
       int x=sc.nextInt();
       int y=sc.nextInt();
        int z=x+y;
       System.out.println("Name is"+name);
       System.out.printf("the sum of %d&%d is %d ",x,y,z);
}
}     

