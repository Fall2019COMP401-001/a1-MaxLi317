package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int goodsnumber = scan.nextInt();
		String[]names = new String[goodsnumber];
		Double[]prices = new Double[goodsnumber];
		int[]goodsindex = new int[goodsnumber];
		int[] howmanybuyit = new int[goodsnumber];
		for (int i=0;i<goodsnumber;i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
			goodsindex[i] = 0;
		}
		int customernumber = scan.nextInt();
		for (int i=0; i<customernumber; i++) {
			scan.next();
			scan.next();
			int listnumber = scan.nextInt();
			for (int b=0; b < listnumber; b++) {
				int quantity = scan.nextInt();//dismatch
			    String namevariable = scan.next();
				for (int a=0; a< names.length; a++) {
					if (names[a].equals (namevariable)) {
						goodsindex [a] = +quantity;
						howmanybuyit [a]= + 1;
					}
				
				}
			}
		
		}
		for (int i=0; i<goodsnumber; i++) {
			if (howmanybuyit[i]== 0) {
				System.out.println ("No customer bought " + names[i]);
				
			} else {
				System.out.println (howmanybuyit[i] + " customers bought " + goodsindex[i] + " " + names[i] );
			   }
		scan.close();
		}
}
}