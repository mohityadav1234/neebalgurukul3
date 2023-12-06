//7)The military uses a 4-digit number system for communicating the time of day.
//For example, 2350 hours ie 23 hours and 50 minutes in 24-hour clock which is 11:50pm.





import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);
	int a,value,minutes,hour;
	String str;
	a= sc.nextInt();
	value =a;
	minutes = value%100;

	value = value/100;
	if ( value >12 && value <=24){
		str = "pm";
	} else {
		str = "am";
	}
	hour =value/2; 
	
	System.out.println( a + " >>> "+ hour + " : " + minutes + str);

		 
}
       	
}

