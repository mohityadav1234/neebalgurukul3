//1)Write a program to convert MilliSec To Hrs,Mins,Secs
//Given the time in milliseconds, express in the form of Hours: Minute:


import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	int mili = sc.nextInt();

 	int a = (mili/1000);
	int s = a%60;
	int b = a%60;
	int m = b%60;
	int h = (mili/(1000*60*60));

       
	System.out.printf("output: %d : %d : %d " , h , m , s);

		 
}
       	
}