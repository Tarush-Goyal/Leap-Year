package codingDojo;
import java.util.*;

public class LeapYear {
	
	boolean isLessthan1582(int year) {	
		if(year<=1582) {
			return true;
		}
		
		return false;
	}
	
	boolean isDivisibleBy4(int year){
		if(year%4==0) {
			return true;
		}
		return false;
	}
	
	boolean isLeapYear(int year) {
		if(isDivisibleBy4(year) && isLessthan1582(year)){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		LeapYear ly= new LeapYear();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Year: ");
		String str=input.nextLine();

		try {
			int year=Integer.parseInt(str);	
			System.out.println("Year entered: " + year);
			boolean result=ly.isLeapYear(year);
			
			if(result==true) {
				System.out.println(year + " is a Leap Year");
			}
			
			else {
				System.out.println(year + " is not a Leap Year");
			}
			
			
			
			
		}
		catch(NumberFormatException ex) {
			System.out.println("Not a valid Year");
		}
		


	}

}
