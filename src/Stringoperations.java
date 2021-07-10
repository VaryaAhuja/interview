import java.util.Scanner;

public class Stringoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java is Java";
		
		int totalcount = s.length();
		int totalreplacecount = s.replace("a","").length();
		
		int count = totalcount - totalreplacecount;
		System.out.println(count);

	}

}
