import java.util.Scanner;

public class Pallindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = sd.nextInt();
		
		int org_num = num;
		int rev = 0;
		
		while(num!=0)
		{
			rev = rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
	}

}
