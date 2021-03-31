import java.util.*; 
class Q10{ 
  public static void main(String asrg[]){
	  
    Scanner input=new Scanner(System.in); 
    
	System.out.print("Input number 1 : ");     
    int x=input.nextInt(); 
    
	System.out.print("Input number 2 : ");     
    int y=input.nextInt();     
    
	System.out.print("Input number 3 : ");     
    int z=input.nextInt();     
     
    //find the max 
    int max=0;

	if (x >= y && x >= z)
         max=x;
    else if (y >= x && y >= z)
         max=y;
    else
		max=z;
  
		
		
     
    //print the results 
    System.out.println("Max : " + max); 
  } 
} 