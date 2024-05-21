package Java;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class zmienne {

	public static void main(String[] args) {

		/*
		 * int b = 200; int A = 100,j;
		 * 
		 * System.out.println( "pierwsza liczba: " + A); System.out.println(
		 * "druga liczba: " + b);
		 */

		/*
		 * int tablica[] new int [10]; tablica[0] = 10;
		 * System.out.println("zerowy fragment to: " + tablica[0]);
		 */

		/*
		 * int a, b; a = 100; b = 250; int c = a % b; System.out.println("b % a = " +
		 * c); System.out.println("a % 3 = " + a % 3); c = a * b;
		 * System.out.println("(a * b) % 120 = " + c % 120);
		 * System.out.println("wyswietl liczbe: " + c);
		 */

		/*
		 * int x = 1, y; System.out.println (--x); System.out.println (x--);
		 * System.out.println (x); y = x--; System.out.println (y); y = --x;
		 * System.out.println (--y);
		 */

		/*
		 * int a, b, c; a = 8; b = 3; c = 2; System.out.println("a = " + a);
		 * System.out.println("b = " + b); System.out.println("c = " + c);
		 * System.out.println("a / b = " + a / b); System.out.println("a / c = " + a /
		 * c); System.out.println("b / c = " + b / c);
		 */

		/*
		 * long a, b = (long) Math.pow(2, 63) +1; a = b + b; System.out.println("a = "
		 * +a);
		 */

		/*
		 * int x = 1, y; y = (x==1 ? 10 :20); System.out.println("y = " + y);
		 */

/*		int parametrA = 1, parametrB = -1, parametrC = -6;
		 System.out.println ("Parametry równania:\n");
		 System.out.println ("A: " + parametrA + " B: " + parametrB + " C: "
		 + parametrC + "\n");
		 if (parametrA == 0){
		 System.out.println ("To nie jest równanie kwadratowe: A = 0!");
		 }
		 else{
		 double delta = parametrB * parametrB - 4 * parametrA * parametrC;
		 if (delta < 0){
		 System.out.println ("Delta < 0.");
		 System.out.println ("To równanie nie ma rozwi¹zania w zbiorze liczb rzeczywistych");
		 }
		 else{
		 double wynik;
		 if (delta == 0){
		 wynik = - parametrB / 2 * parametrA;
		 System.out.println ("Rozwi¹zanie: x = " + wynik);
		 }
		 else{
		 wynik = (- parametrB + Math.sqrt(delta)) / 2 * parametrA;
		 System.out.print ("Rozwi¹zanie: x1 = " + wynik);
		 wynik = (- parametrB - Math.sqrt(delta)) / 2 * parametrA;
		 System.out.println (", x2 = " + wynik);
		 }
		 }
		 }
}
*/
		
	/*	int a = 15;
		switch(a){
			case 1:
				System.out.println("a=1");
				break;
			case 10:
				System.out.println("a=10");
				break;
			default:
			System.out.println("ani 1 ani 10");
	}
}
		
*/		
		

/*	int i = 20;
		System.out.println(i / 3);				// 6
		System.out.println(i - (6 * 3));		// 2
		System.out.println((double)i / 3);		// 6.666666666666667
//		
		BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
		BigDecimal amountOfPeople = BigDecimal.valueOf(3);
		BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
		System.out.println(chargePerPerson);	// 6.67
//		
		double d = 3.1;
		double d2 = 1.21;
//		
		System.out.println(d - d2);								// 1.8900000000000001
//		
		BigDecimal bd3 = BigDecimal.valueOf(3.1).setScale(2);
		BigDecimal bd4 = BigDecimal.valueOf(1.21).setScale(2);
		System.out.println(bd3.subtract(bd4));					// 1.89
		
	}
*/		
		
	/*	System.out.println(Math.PI);		// 3.141592653589793
		System.out.println(Math.max(3, 5)); // 5
		System.out.println(Math.min(3, 5));	// 3
		System.out.println(Math.sqrt(4));	// 2.0
		int absoluteValue = Math.abs(-5);
		System.out.println(absoluteValue);	// 5
		
		System.out.println(Math.sqrt(-1));	// NaN
		System.out.println(0 / 0.0);		// NaN
		System.out.println((0 / 0.0) + 5);	// NaN
		
		System.out.println(5 / 0.0);		// Infinity
		System.out.println(-5 / 0.0);		// -Infinity
		
		System.out.println(Math.round(20.0 / 3.0));						// 7
		System.out.println(Math.round( 20.0 * 100.0 / 3.0) / 100.0);	// 6.67
		
		System.out.println(Math.random());						// between 0.0 and 1.0
		System.out.println((int)(Math.random() * 100)); 		// between 0 and 100 
		System.out.println((int)(Math.random() * 100) + 100); 	// between 100 and 200 
		
	}
	*/	
		
/*		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any word: ");
		String word = sc.next();
		System.out.println("You entered this word: " + word);
		System.out.print("Please, enter any integer number: ");
		int i = sc.nextInt();
		System.out.println("You entered this integer number: " + i);
		*/
	}
		
		
		
	
}
