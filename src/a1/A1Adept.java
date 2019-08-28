package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		// Your code follows here.
		String[]names = new String[quantity];
		Double[]prices = new Double[quantity];
		for (int i=0;i <quantity; i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
		}
		int numberofcost = scan.nextInt();
		double Biggest = 0;
		double Smallest = Integer.MAX_VALUE;
		String rich = "";
		String poor = "";
		double total = 0;
		
		for (int j=0; j<numberofcost; j++) {
			String customername = scan.next() +" "+ scan.next();//key
			int listnumber = scan.nextInt();
			Double Cost = 0.0;
			for (int t=0;t<listnumber;t++) {	
				int Qgood = scan.nextInt();
				String namevariable = scan.next();
				for (int h=0; h<names.length; h++) { 
					if (names[h].equals(namevariable)) {//这里的input会再变吗
					Cost = Cost + Qgood*prices[h];
					// 这地方加重复 total = total + Cost;
					} 	
				 } 
			 }
			total = total + Cost;
			if (Cost > Biggest) {
					Biggest = Cost;
				    rich = customername;
				} 
			if (Cost < Smallest ) {
					Smallest = Cost;
					poor = customername;
			}
		
		 }
		System.out.println ("Biggest: " + rich + " " + Biggest);
		System.out.println ("Smallest: " + poor + " "+ Smallest);
		System.out.println ("Average: " + total/numberofcost);
		scan.close();
	}
}

