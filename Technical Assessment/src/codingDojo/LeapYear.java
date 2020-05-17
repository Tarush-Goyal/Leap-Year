package codingDojo;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		String str=input.nextLine();

		try {
			int num=Integer.parseInt(str);	
			System.out.println(num);
		}
		catch(NumberFormatException ex) {
			System.out.println("Not a number");
		}
		


	}

}
