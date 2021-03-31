import java.util.Scanner;
public class Q9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How much your salary:");
		int salary=input.nextInt();
		System.out.println("How year of service for you:");
		int year=input.nextInt();
		
		double bonusAmount;
		if(year>5){
			bonusAmount=salary*0.05;
		}
		else{
			bonusAmount=0;
		}
		System.out.println("bonusAmount:" + bonusAmount);
		}
}

