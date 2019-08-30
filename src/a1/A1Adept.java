package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		int quantity = scan.nextInt();
		String[]names = new String[quantity]; 
		Double[]prices = new Double[quantity];
		
		for (int i=0;i <quantity; i++) {
			names[i] = scan.next(); 
			prices[i] = scan.nextDouble();
		}
		
		int numberOfCost = scan.nextInt();
		double biggest = 0;
		double smallest = Integer.MAX_VALUE; 
		String rich = "";
		String poor = "";
		double total = 0;
		
		/* The first for loop is set for the 
		 * following program to run from the first person to the last person
		 */
		for (int j=0; j<numberOfCost; j++) { 
			String customername = scan.next() +" "+ scan.next();
			int listNumber = scan.nextInt();
			Double Cost = 0.0;
			/* The second loop is loop inside each person's novice
			 * to go through each merchandise that person buy
			 */
			
			for (int t=0;t<listNumber;t++) {	
				int qGood = scan.nextInt();
				String nameVariable = scan.next();
				
				// The third loop is to calculate the cost of each item in each person
				for (int h=0; h<names.length; h++) { 
					if (names[h].equals(nameVariable)) {
 					Cost = Cost + qGood*prices[h]; 
					} 	
				 } 
			 }
			/*
			 * Codes here are used to find out who spend the most amount of money
			 */
			total = total + Cost;
			if (Cost > biggest) {
					biggest = Cost;
				    rich = customername;
				} 
			if (Cost < smallest ) {
					smallest = Cost;
					poor = customername;
			}
		
		 }
		System.out.println ("Biggest: " + rich + " " + "(" + String.format("%.2f", biggest)  + ")");
		System.out.println ("Smallest: " + poor + " "+ "(" + String.format("%.2f", smallest) + ")");
		System.out.println ("Average: " + String.format("%.2f", total/numberOfCost ));
		scan.close();
	}
}

