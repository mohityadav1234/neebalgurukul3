//4) Bluebird bus service operates a bus only when its entire 50 seats are
//occupied. X number of bookings have been made for the day. Write a program to
//find the number of people from X who will get to travel today.




import java.util.Scanner;

public class Demo {
    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Input NO : ");

	int a = sc.nextInt();

	System.out.println("People traveling : " + (50*(a/50)));

}

}

	
