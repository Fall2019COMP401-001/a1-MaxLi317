package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		Double c=scan.nextDouble();
		for (int i = 0; i<c; i ++) {
			String x = scan.next();
			String z = x.substring(0,1) + ". " + scan.next()+": ";
			int y = scan.nextInt();
			double d = 0;
			for (int j=0; j<y; j++) {
				int h = scan.nextInt();
				x = scan.next();
				double g = scan.nextDouble();
				d = d + h * g;		
			}
			System.out.println(z+String.format("%.2f", d));
			
		}
		scan.close();
	}
}
