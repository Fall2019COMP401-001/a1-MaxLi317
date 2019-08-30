package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		Double c=scan.nextDouble();
		for (int i = 0; i<c; i ++) { 
			
			String name = scan.next(); 
			String wholeName = name.substring(0,1) + ". " + scan.next()+": ";
			int y = scan.nextInt();
			double totalPrice = 0;
			/*
			 * use the scan to get quantity and price
			 * the result is total price and it is formatted in 2 decimals 
			 */
			for (int j=0; j<y; j++) {
				int quantity = scan.nextInt(); 
				name = scan.next();
				double price = scan.nextDouble();
				totalPrice = totalPrice + quantity * price;		
			}
			System.out.println(wholeName+String.format("%.2f", totalPrice));
			
		}
		scan.close();
	}
}
