//6)


import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	int i,u,t,h,actualValue;
	System.out.print(" Input : ");
	i=sc.nextInt();
	actualValue=i;
	u=i%10;
	i=i/10;
	t=i%10;
	i=i%10;
	h=i%10;

	if (((u*u*u)+(t*t*t)+(h*h*h))== actualValue){

		System.out.print( actualValue + "is an Armstrong Number");
	} else {
		System.out.print( actualValue + "is not an Armstrong Number");

	
	
}
		 
}
       	
}

