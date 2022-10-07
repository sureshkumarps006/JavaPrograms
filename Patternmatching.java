import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Patternmatching {

	public static void main(String[] args) {
		// TODO Auto-er method stub

		//Pattern p = Pattern.compile(".ab");
		/*Pattern p = Pattern.compile("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher m = p.matcher("abb");
		boolean b = m.matches();
		System.out.println(b);*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your email:");
		String email= sc.next();
		String reg ="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]++$";
		/*Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(email);
		boolean b = m.matches();*/
		boolean result = email.matches(reg);
		if(result) {
			System.out.print(result);
		}
		else
		{
			System.out.print(result);
		}
		
		
		
		
	}

}
