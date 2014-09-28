/*
 * AUTHOR - ZULFIQAR SALAHUDDIN
 */


import java.util.Scanner;

public class quarterBack {

	private static Scanner user_input;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Variables for the formula

		//ATT = Number of passing attempts
		//COMP = Number of completions
		//YDS = Passing yards
		//TD = Touchdown passes
		//INT = Interceptions

		double ATT;
		double COMP;
		double YDS;
		int TD;
		int INT;

		user_input = new Scanner(System.in);

		System.out.print("Enter number of Passing ATTEMPTS: ");
		ATT = user_input.nextInt();

		System.out.print("Enter number of COMPLETIONS: ");
		COMP = user_input.nextInt();

		System.out.print("Enter the passing YARDS: ");
		YDS = user_input.nextDouble();

		System.out.print("Enter amount of TOUCHDOWN passes: ");
		TD = user_input.nextInt();

		System.out.print("Enter amound of INTERCEPTIONS: ");
		INT = user_input.nextInt();

		//Implement NFL passer rating Formula
		//First i take parts of the formula and
		//break down into four letter sections (a,b,c,d)
		//Then call actual formula with those sections

		float a;
		a = (float) ((((COMP / ATT) * 100) - 30) * 0.05);
		//System.out.println(a);

		float b;
		b = (float) (((YDS / ATT) - 3) * .25);
		//System.out.println(b);

		float c;
		c = (float) (((TD / ATT) * 100) * 0.2);
		//System.out.println(c);

		float d;
		d = (float) (2.375 - (((INT / ATT) * 100) * 0.25));
		//System.out.println(d);

		double finalRate;

		finalRate = ((a + b + c + d) / 6) * 100;

		System.out.printf("The passer rating for the player stats is: "
				+ "%3.2f", finalRate);

		System.out.println();

		if (finalRate > 66.7 && finalRate < 100)

			System.out.println("The rating " + finalRate
					+ " indicates that of an average performance.");

		else if (finalRate > 100) 

			System.out
					.println("The rating "
							+ finalRate
							+ " indicates the player has an excellent performance.");

	}

}
