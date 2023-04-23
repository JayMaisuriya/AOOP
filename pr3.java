import java.util.Scanner;
class pr3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nenter number to revse :");
		int number =sc.nextInt();
		int  rev=0;
		while(number!=0)
		{
			int rem = number % 10;
			rev = rev * 10 + rem;
			number = number / 10;
		}
		System.out.println("\nrevse of number is :"+rev);
	}
}