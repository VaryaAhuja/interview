import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 1;
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sr.nextLine();
		
		for (int i =0;i<str.length()-1;i++)
		{
			if( (str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
				  
				
			}
			
		}
		System.out.println(count);
	}

}
