//5) Input 3 numbers and find the largest.



import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	int largest;
	System.out.print("Enter the 3 numbers:");
        int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	
	largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  

	System.out.println("Largest number is:" +largest);

		 
}
       	
}