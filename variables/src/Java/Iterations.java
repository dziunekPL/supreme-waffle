package Java;

public class Iterations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * public class RandomDemo {
	
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt());		// any random int
		System.out.println(r.nextInt(100)); 	// any int from 0 to 99
		System.out.println(r.nextInt(100) + 1);	// any int from 1 to 100
		
	}
		 */
		
		/*
		 * public class WhileLoopDemo {

	public static void main(String[] args) {
		System.out.println("=========== while loop");
		int counter = 0;
		while (counter < 5) {
			System.out.println("counter: " + counter++);
		}
		 */
		
		/*
		 * public class DoWhileLoopDemo {

	public static void main(String[] args) {
		System.out.println("=========== do-while loop");
		int counter = 0;
		do {
			System.out.println("counter: " + counter++);
		} while (counter < 5);
		
		do {
			System.out.println("counter is five already: " + counter);
		} while (counter < 5);
		
		
	}
		 */
		
		/*
		 * public class ForWithConditionLoopDemo {

	public static void main(String[] args) {

		System.out.println("=========== for loop");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("counter: " + i);
			
		}

		// Infinite loop
//		for (;;) {
//
//		}
		
		
		System.out.println("=========== for loop | comma usage example");
		for (int i = 0, j = 10; i < j; i++, j--) {
			System.out.println("counters: i = " + i + ", j = " + j);
		}
		 */
		
		/*
		 * public class ForeachLoopDemo {
	
	public static void main(String[] args) {
		System.out.println("=========== foreach loop");
		int[] arr = {1, 2, 3};
		int sum = 0;
		for (int number : arr) {
			sum += number;
			System.out.println("Number: " + number);
		}
		System.out.println("Sum: " + sum);

		for (int i : arr) {
			
		}
		 */
		
		/*
		 * public class NestedLoopsDemo {
	
	public static void main(String[] args) {
		System.out.println("=========== nested loop");
		for (int i = 0; i < 5; i++) {
			System.out.println("*** i = " + i + " ***");
			for (int j = 0; j < 3; j++) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		 */
		
		/*
		 * public class JumpStatementsDemo {

	public static void main(String[] args) {
		System.out.println("=========== continue");
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break");
		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println("counter: " + i);
		}
		
		System.out.println("=========== break nested loop");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {	
					break;
				}
				System.out.print(j + " ");
			}
			
			System.out.println("counter: " + i);
		}
		 */
		
		/*
		 * public class LabelsDemo {
	
	public static void main(String[] args) {
		System.out.println("=========== labels");
		loop1: for (int i = 0; i < 5; i++) {
				System.out.println("counter i: " + i);
			loop2: for (int j = 0; j < 5; j++) {
					System.out.println("counter j: " + j);
						if (j >= 0 && j < 3) {
							System.out.println("continue loop2");
							continue loop2;
						} else {
							System.out.println("break loop1");
							break loop1;
						}
		 */
		
		/*
		 * 
		 */
	}

}
