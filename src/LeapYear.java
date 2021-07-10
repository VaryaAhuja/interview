import java.util.Scanner;

public final class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 0;
		Scanner leap = new Scanner(System.in);
		System.out.println("Enter the year:");
		n = leap.nextInt();
		
		
		if (n%400==0)
		{
			
		System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a Leap Year");
				}
			}
	
}
