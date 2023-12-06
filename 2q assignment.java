//2) Write a program to swap both halfs of a 4 digit number.
//Input a 4-digit number. Interchange the first half with the second half.
//Test case:
//Input: 4523
//Output : 2345


import java.util.Scanner;
  public class Demo {
    public static void main(String args[]) {

	Scanner sc=new Scanner(System.in);
	
	   System.out.print("Enter a 4-digit number: ");
        int number = sc.nextInt();

        if (number >= 1000 && number <= 9999) {
            int firstHalf = number / 100;
            int secondHalf = number % 100;
            int swappedNumber = (secondHalf * 100) + firstHalf;

            System.out.println("Original number: " + number);
            System.out.println("Swapped number: " + swappedNumber);
        } else {
            System.out.println("Please enter a valid 4-digit number.");
        }

    }
}