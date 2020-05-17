package codingDojo;
import java.util.*;

public class LeapYear {
	
	int isAYear(String str) {
		try {
			int year=Integer.parseInt(str);	
			System.out.println("Year entered: " + year);
			return year;
		}
		
		catch(NumberFormatException ex){
			return 0;
		}
			
	}
	
	boolean isDivisibleBy100(int year) {
		if(year%100==0) {
			return true;
		}
		return false;
	}
	
	boolean isDivisibleBy400(int year) {
		if(year%400==0) {
			return true;
		}
		return false;
	}
	
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
	
	boolean isLeapYear(String str) {
		
		int year=isAYear(str);
		
		if(year>0){

			if(isDivisibleBy4(year) && isLessthan1582(year)){
				return true;
			}
			
			if(isDivisibleBy400(year)) {
				return true;
			}
			
			if(isDivisibleBy100(year) && !isDivisibleBy400(year)) {
				return false;
			}
			
			return false;
			
		}
		else{
				return false;
			}
		
	}

	public static void main(String[] args) {

		LeapYear ly= new LeapYear();
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a Year: ");
		String str=input.nextLine();
			
			boolean result=ly.isLeapYear(str);
			
			if(result==true) {
				System.out.println(str + " is a Leap Year");
			}
			
			else{
				System.out.println(str + " is not a Leap Year");
			}
			
		}
		
		


	}


