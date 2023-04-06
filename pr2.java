import java.util.Scanner;
public class pr2
{
   public static void main(String args[])
{
    int a,b,c,large,temp;
    Scanner sc=new Scanner(System.in); 

    System.out.println("ENTER 1ST NUMBER : ");
    a=sc.nextInt();
    System.out.println("ENTER 2ND NUMBER : ");
    b=sc.nextInt();
    System.out.println("ENTER 3RD NUMBER : ");
    c=sc.nextInt();
   
    temp=a>b?a:b;
    large=c>temp?c:temp;
    System.out.println("THE LARGEST NUMBER :"+large);
     
}
}