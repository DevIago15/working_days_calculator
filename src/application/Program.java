package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int days;
		int weekend = 8;
		String month;

		// data enter
		System.out.print("What month are we in? ");
		month = sc.next();
		System.out.printf("How many days are in the month of %s? ", month);
		days = sc.nextInt();

		// do calculation
		days = days - weekend;

		// data out
		System.out.printf("\nThe month of %s has %d working days.", month, days);

		sc.close();
	}
}