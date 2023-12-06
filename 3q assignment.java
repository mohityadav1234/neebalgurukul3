//3) Given the days express in the form of Years: Months: Weeks: Days

import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	int m, year, month, week, day;
	Scanner sc=new Scanner(System.in);
	
	System.out.print("Enter the number of days:");
        m = sc.nextInt();
        year = m / 365;
        m = m % 365;
        System.out.println("No. of years:"+year);
	month = m / 30;
        m = m % 30;
        System.out.println("No. of month:"+month);
        week = m / 7;
        m = m % 7;
        System.out.println("No. of weeks:"+week);
        day = m;
        System.out.println("No. of days:"+day);
		 
}
       	
}