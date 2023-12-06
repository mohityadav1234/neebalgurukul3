//8)


import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	String name;
	int units;
	double amount, gst;
	System.out.print(" Name : ");
	name = sc.nextLine();
	System.out.print(" Unit : ");
	units = sc.nextInt();
	if(units <= 100){
			amount = 100*4;
	} else if (units > 100 && units <= 300){
		amount = (100*4)+(200*5);
		} else {
			amount = (100*4)+(200*5)+((units-300)*10);
	}
	if( amount > 1000.0) {
				amount = (0.05*amount)+amount;
	}
	gst = (0.18*amount);
	
	System.out.print(" Amount : " + (amount+gst));

		 
}
       	
}

