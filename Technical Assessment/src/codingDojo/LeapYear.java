package codingDojo;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.print("Enter a number: ");
		String str=input.nextLine();

		try {
			int num=Integer.parseInt(str);	
			System.out.println("Year entered: "+num);
			
			if(num<=1582 && num%4==0){
				System.out.println(num+" is a Leap Year");
			}
		}
		catch(NumberFormatException ex) {
			System.out.println("Not a number");
		}
		


	}

}
