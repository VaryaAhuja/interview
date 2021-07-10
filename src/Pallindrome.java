import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner se = new Scanner(System.in);
				System.out.println("Enter a String:");
				String sr = se.nextLine();
				String or_str =sr;
				
				String rev ="";
				
				int len = sr.length();
				
				for (int i =len-1;i>=0;i--)
				{
					rev=rev+sr.charAt(i);
				}
				if(or_str.equals(rev))
				{
					System.out.println("pallindrome String");
				}
				else
				{
					System.out.println("Not a Pallindrome");
				}
				}
	}


