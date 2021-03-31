import java.util.Scanner;
public class Q1{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		float number=input.nextFloat();
		
		if(number==0){
			System.out.println("number:" + number);
		}
		
		else if(number>0){
			System.out.println("number: positive");
		}
		
		else{
			System.out.println("number: negative");
		}
	}
}

		
		