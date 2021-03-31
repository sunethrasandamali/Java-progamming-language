import java.util.Scanner;
public class Q7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year number:");
		int year = input.nextInt();
		
		switch(year){
			
			case 1 : 
				System.out.println("1st year-freshman");
				break;
			
			case 2 : 
				System.out.println("2nd sophomore");
				break;
				
			case 3 : 
				System.out.println("3rd junior");
				break;
				
			case 4 : 
				System.out.println("4th year-senior");
				break;
				
			default : 
				System.out.println("error...! Not year as you entered");
				
		}	
			
		
	}
}

