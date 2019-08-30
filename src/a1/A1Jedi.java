package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		/*
		 * Scan the grocery name and price into the array
		 * Also for jump into the people part
		 */
		int goodsNumber = scan.nextInt();
		String[] names = new String[goodsNumber];
		Double[] prices = new Double[goodsNumber];
		boolean[] hasBought = new boolean[goodsNumber];
		int[] goodsIndex = new int[goodsNumber];
		int[] howManyBuyIt = new int[goodsNumber];
		
		for (int i=0;i<goodsNumber;i++) {
			names[i] = scan.next();
			prices[i] = scan.nextDouble();
			goodsIndex[i] = 0;
		}
		
		int customerNumber = scan.nextInt();
		
		for (int i=0; i<customerNumber; i++) {
			scan.next();
			scan.next();
			for (int f=0;f<goodsNumber;f++) {
				hasBought[f] = false;
			}
			
			int listnumber = scan.nextInt();
			
			/*
			 * Check the name, boolean [i] changes to true when names match
			 * Add people number and quantity name to related array
			 */
			for (int b=0; b < listnumber; b++) {
				
				int quantity = scan.nextInt();
			    String nameVariable = scan.next();
			    
				for (int a=0; a< names.length; a++) { 
					
					if (names[a].equals (nameVariable)) {
						
						if (hasBought [a] == false) {
							hasBought[a] = true;
							goodsIndex [a]+= quantity;
							howManyBuyIt [a]+=1;
					     } else {
						
					    	 goodsIndex [a]+= quantity; 
		
				         }
			        }
		         }
		     }
		}
		for (int i=0; i<goodsNumber; i++) {
			if (howManyBuyIt[i]== 0) {
				
				System.out.println ("No customers bought " + names[i]);
				
			} else {
				
				System.out.println (howManyBuyIt[i] + " customers bought " + goodsIndex[i] + " " + names[i] );
			}
			
		scan.close();
		}
}
}
