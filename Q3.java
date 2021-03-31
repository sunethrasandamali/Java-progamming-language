import java.util.Scanner;
public class Q3{
	public static void main(String[] args){
		int sum = 0;
		double average = 0;
		
		Scanner input = new Scanner(System.in);
		int [] value = new int[5];
		
		//enter values to array...
		for(int i=0;i<5;i++){
					System.out.println("Enter values for:" + i);
					value[i] = input.nextInt();
		}
		
		//display  array values...
		System.out.println("---Display Five numbers---");

		for(int i=0;i<5;i++){
					System.out.println("value" + i + ":" + value[i] + " ");
		}
		
		//calculate sum & average...
		System.out.println("---calculate sum and average of entered five numbers---");
		
		for(int i=0;i<5;i++){
			sum = sum+ value[i];
			average = sum /(i+1);
		}

		//display sum & average...
		System.out.println("Summation of five numbers:" + sum );
		System.out.println("Average of five numbers:" + average );
		
	}
}