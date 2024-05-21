package zadania;

import java.util.Scanner;



public class zadania{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* zad 1	
		  int a = Integer.parseInt(args[0]);
          int b = Integer.parseInt(args[1]);
          int res = (a + b);
          System.out.println(res);
*/

		/* zad 2
				Scanner sc = new Scanner(System.in);
				double s1, s2, s3, triangleArea, S;
				Scanner scanner;
				scanner = new Scanner(System.in);
				
				System.out.print("Please, enter A side of a triangle: ");
				s1 = scanner.nextInt();
				
				System.out.print("Please, enter B side of a triangle: ");
				s2 = scanner.nextInt();

				System.out.print("Please, enter C side of a triangle: ");
				s3 = scanner.nextInt();

		        S = (s1 + s2 + s3) / 2;
		        triangleArea = Math.sqrt(S * (S - s1) * (S - s2) * (S - s3));          
				System.out.println("Triangle area is: " + triangleArea);
				
			}

		

	        }
		 
	*/

				    
	/* zad 3
	 		      double r, circleCircumference;
	 
			      Scanner s = new Scanner(System.in);

			      r = s.nextDouble();
			      
			      	      s.close();

			      
			      circleCircumference = (double)(Math.PI*2*r);
				System.out.println("Circle circumference is: " + circleCircumference);
			}
		    
	}
    
*/
		
		/* zad 4
		public class PINumberFormatting {
	
	public static void main(String[] args) {
		System.out.printf("%.1f%n", Math.PI);
		System.out.printf("%.2f%n", Math.PI);
		System.out.printf("%.3f%n", Math.PI);
		System.out.printf("%.4f%n", Math.PI);
		System.out.printf("%.5f%n", Math.PI);
	}

}
		 */
		
		/* zad 5
		 public class SplitWords {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		System.out.print("You entered these words: ");
		System.out.println(Arrays.toString(userInput.split("[\\p{P}\\s]+"))); // POSIX character classes
	
		/*
				\p{Lower}   A lower-case alphabetic character: [a-z]
				\p{Upper}   An upper-case alphabetic character:[A-Z]
				\p{ASCII}   All ASCII:[\x00-\x7F]
				\p{Alpha}   An alphabetic character:[\p{Lower}\p{Upper}]
				\p{Digit}   A decimal digit: [0-9]
				\p{Alnum}   An alphanumeric character:[\p{Alpha}\p{Digit}]
				\p{Punct}   Punctuation: One of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~
				\p{Graph}   A visible character: [\p{Alnum}\p{Punct}]
				\p{Print}   A printable character: [\p{Graph}\x20]
				\p{Blank}   A space or a tab: [ \t]
				\p{Cntrl}   A control character: [\x00-\x1F\x7F]
				\p{XDigit}  A hexadecimal digit: [0-9a-fA-F]
				\p{Space}   A whitespace character: [ \t\n\x0B\f\r]
				
		*/
		
		/* zad 6
		 public class AddNumbers {

	public static void main(String[] args) {
		if (args[0].contains(".") || args[1].contains(".")) {
			double paramDouble1 = Double.parseDouble(args[0]);
			double paramDouble2 = Double.parseDouble(args[1]);
			System.out.println(paramDouble1 + paramDouble2);
		} else {
			int paramInt1 = Integer.parseInt(args[0]);
			int paramInt2 = Integer.parseInt(args[1]);
			System.out.println(paramInt1 + paramInt2);
		}
	}
	
	/* zad 7
	 public class AdminGuestMode {
	
	public static void main(String[] args) {
		String inputArguments = String.join(",", args);
		String adminFlag = "--admin";
		String guestFlag = "--guest";
		if (inputArguments.contains(adminFlag) && inputArguments.contains(guestFlag)) {
			System.out.println("Please, select either 'ADMIN' or "
					+ "'GUEST' mode for this program");
		} else if (inputArguments.contains(adminFlag)) {
			System.out.println("Hello, Admin!");
		} else if (inputArguments.contains(guestFlag)) {
			System.out.println("Hello, Guest!");
		}
		
		
		
		
		
		/*	zad 8 user activity selector
		 import java.util.Scanner;

public class UserActivitySelector {

	public static void main(String[] args) {
		System.out.print("Please, enter action name: ");
		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

		switch (userInput) {
			case "login":
				System.out.println("Please, enter your username");
				break;
			case "sign_up":
				System.out.println("Welcome!");
				break;
			case "terminate_program":
				System.out.println("Thank you! Good bye!");
				break;
			case "main_menu":
				System.out.println("Main menu");
				break;
			case "about_app":
				System.out.println("This app is created by me ");
				break;
			default:
				System.out.println("Please, enter one of these values: login, "
						+ "sign_up, terminate_program, main_menu, about_app");
				break;
		}

	}
}
*/
		
		/*
		 * zad 9 new line for digit
		 * import java.util.Scanner;

public class NewLineForDigit {

	public static void main(String[] args) {
		System.out.print("Please, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String intString = sc.next();
		for (char digit : intString.toCharArray()) {
			System.out.println(digit);
		}
	}
}
		 */
		
		/*
		 * zad 10 pyramid in console
		 * import java.util.Scanner;

public class PyramidInConsole {
	
	public static void main(String[] args) {
		System.out.print("Please, enter height of the pyramid: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		
		for (int i = 1; i < height + 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
		for (int i = height - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}

		 */
		
		/*
		 * zad 11 print matrix to console
		 * public class PrintMatrixToConsole {

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3, 4, 5,},
				{6, 7},
				{8, 9, 10}
		};
		
		for(int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.Out.println();
		}
	}
	
}
		 */
		
		/*
		 * zad 12 find max int
		 * import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInt {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");
		String numbers = sc.nextLine();
		int[] intArray = convertStringArrayToIntArray(numbers.split("\\s+"));
		int maxInt = findMaxIntInArray(intArray);
		System.out.println("*** Initial Array ***");
		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	
	public static int findMaxIntInArray(int[] intArray) {
		int max = intArray[0];
		for (int i : intArray) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}

	private static int[] convertStringArrayToIntArray(String[] stringArray) {
		int[] intArray = new int[stringArray.length];
		for (int i = 0; i < stringArray.length; i++) {
			intArray[i] = Integer.valueOf(stringArray[i]);
		}
		return intArray;
	}
	
	// ====================== SOLUTION WITH STREAM API
	
	public static int findMaxIntInArrayStreamApi(int[] intArray) {
		return Arrays.stream(intArray).max().getAsInt();
	}

	private static int[] convertStringArrayToIntArrayStreamApi(String[] stringArray) {
		return Arrays.stream(stringArray)
				.mapToInt(s -> Integer.valueOf(s))
				.toArray();
	}

}		 
		 * 
		 */
		
		/*
		 * zad 13 draw empty rectangle
		 * import java.util.Scanner;

public class EmptyRectangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		
		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0 || j == width - 1 || i == 0 || i == height -1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}

}
		 */

		/*
		 * 	zad 14 amount of words
		  import java.util.Scanner;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		int amountOfWords = getWordsAmount(userInput);
		System.out.println("Amount of words in your text: " + amountOfWords);
	}

	public static int getWordsAmount(String text) {
		return text.split("[\\p{P}\\s]+").length;
	}
}
		 * 
		 */
		
		/*
		 * zad 15 filter strings array
		 import java.util.Arrays;
import java.util.Scanner;

public class FilterStringArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any words separated by space: ");
		String userInput = sc.nextLine();
		System.out.print("Please, enter minumum word length to filter words: ");
		int minLength = sc.nextInt();
		
		String[] words = userInput.split("\\s+");
		String[] filteredWords = filterWordsByLength(minLength, words);
		System.out.println(Arrays.toString(filteredWords));
	}

	
	
	public static String[] filterWordsByLength(int minLength, String[] words) {
		String[] filteredArray = new String[words.length];
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() >= minLength) {
				filteredArray[i] = words[i];
			}
		}
		
		filteredArray = filterNulls(filteredArray);
		
		return filteredArray;
	}



	private static String[] filterNulls(String[] arr) {
		int newArraySize = 0;
		for (String word : arr) {
			if (word != null) {
				newArraySize++;
			}
		}
		
		String[] filteredArray = new String[newArraySize];
		
		int filteredArrayIndex = 0;
		for (String word : arr) {
			if (word != null) {
				filteredArray[filteredArrayIndex++] = word;
			}
		}
		
		return filteredArray;
	}



	//===================== SOLUTION WITH STREAM API
	
	public static String[] filterWordsByLengthStreamApi(int minLength, String[] words) {
		return Arrays.stream(words)
				.filter(s -> s.length() >= minLength)
				.toArray(String[]::new);
	}

}
		 */
		
		/*
		 * zad 16 rotate matrix
		 *import java.util.Scanner;

public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Please, enter matrix size: ");
		int size = in.nextInt();
		double[][] matrix = generateMatrix(size);

		System.out.println("How you want to rotate matrix:" + System.lineSeparator() +
				"\t1 - 90" + System.lineSeparator() +
				"\t2 - 180" + System.lineSeparator() +
				"\t3 - 270");
		int mode = in.nextInt();

		System.out.println(System.lineSeparator() + "Base matrix:" + System.lineSeparator());
		printMatrixToConsole(matrix);
		System.out.println();

		if (rotateMatrix(matrix, mode)) {
			printMatrixToConsole(matrix);
		}
	}

	private static double[][] generateMatrix(int size) {
		double[][] matrix = new double[size][size];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = Double.valueOf(Integer.toString(i) + "." 
						+ Integer.toString(j));
			}
		}
		return matrix;
	}

	private static boolean rotateMatrix(double[][] matrix, int mode) {
		switch (mode) {
			case 1:
				System.out.println("90 degrees rotated:" + System.lineSeparator());
				rotate90(matrix);
				break;
			case 2:
				System.out.println("180 degrees rotated:" + System.lineSeparator());
				rotate180(matrix);
				break;
			case 3:
				System.out.println("270 degrees rotated:" + System.lineSeparator());
				rotate270(matrix);
				break;
			default:
				System.out.println("You selected non-existing mode!");
				return false;
			}
		return true;
	}
	
	private static void transposeMatrix(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < i; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	private static void verticalReflection(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
	}

	private static void horizontalReflection(double[][] matrix) {
		double temp;
		for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = 0; j < matrix.length; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - i][j];
				matrix[matrix.length - 1 - i][j] = temp;
			}
		}
	}

	public static void rotate90(double[][] matrix) {
		transposeMatrix(matrix);
		verticalReflection(matrix);
	}

	public static void rotate180(double[][] matrix) {
		verticalReflection(matrix);
		horizontalReflection(matrix);
	}

	public static void rotate270(double[][] matrix) {
		transposeMatrix(matrix);
		horizontalReflection(matrix);
	}

	private static void printMatrixToConsole(double[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	

}
		 */
	
		/*
		 * zad 17 extend array
		 import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExtension {

	public static final int MULTIPLIER = 2;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter length of initial array: ");
		int baseArrayLength = sc.nextInt();
		int[] arr = generateRandomArray(baseArrayLength);
		int[] extendedArray = extendArray(arr);
		System.out.println("*** Initial array ***");
		System.out.println(Arrays.toString(arr));
		System.out.println("*** Extended array ***");
		System.out.println(Arrays.toString(extendedArray));
	}


	 * The method extends array.
	 * If array {1, 2, 3} has been passed to this method then array {1, 2, 3, 2, 4, 6}
	 * is returned from this method.
	 * 
	 * @param arr - base of extension. Extended array contains elements from this array
	 * and additionally contains the same elements multiplied by two. 
	 * @return extended array.
	
	
	public static int[] extendArray(int[] arr) {
		int newArrayLenght = arr.length * 2;
		int[] resultArray = Arrays.copyOf(arr, newArrayLenght);
		
		for (int i = arr.length; i < newArrayLenght; i++) {
			resultArray[i] = arr[i - arr.length] * MULTIPLIER;
		}
		
		return resultArray;
	}

	public static int[] generateRandomArray(int amountOfElements) {
		Random r = new Random();
		int[] resultArray = new int[amountOfElements];
		for (int i = 0; i < amountOfElements; i++) {
			resultArray[i] = r.nextInt(100) + 1;
		}
		return resultArray;
	}

}
		 
		 */
		
		/*
		 * zad 18 greatest common divisor
		 import java.util.Scanner;

public class GreatestCommonDivisor {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter two numbers separated by space: ");
		String userInput = sc.nextLine();
		
		String[] inputArgumentsArray = userInput.split("\\s+");
		int number1 = Integer.parseInt(inputArgumentsArray[0]);
		int number2 = Integer.parseInt(inputArgumentsArray[1]);

		System.out.println(gcdRecursive(number1, number2));
	}
	
	public static int gcdRecursive(int firstNumber, int secondNumber) {
		if (secondNumber == 0) {
			//for the case firstNumber is negative
			return Math.abs(firstNumber); 
		} else {
			return gcdRecursive(secondNumber, firstNumber % secondNumber);
		}
		
	}
	

	

}
		 */
		
		/*
		 * zad 19 sum all digits in number
		 * import java.util.Scanner;

public class SumDigitsInNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer: ");
		int number = sc.nextInt();
		
		int sumOfDigits = sumDigitsInNumber(number);
		System.out.println(sumOfDigits);
	}

	public static int sumDigitsInNumber(int number) {
		int result = 0;
		while (number != 0) {
			result += number % 10;
			number /= 10;
		}
		return Math.abs(result);
	}

}
		 */
		
		/* zad 20 string processor
		 public class StringProcessor {
	
	// TODO: mention StringBuilder 
	
	public static final String INPUT_DATA = "Login;Name;Email" + System.lineSeparator() +
			"peterson;Chris Peterson;peterson@outlook.com" + System.lineSeparator() +
			"james;Derek James;james@gmail.com" + System.lineSeparator() +
			"jackson;Walter Jackson;jackson@gmail.com" + System.lineSeparator() +
			"gregory;Mike Gregory;gregory@yahoo.com";
	
	public static void main(String[] args) {
		System.out.println("===== Convert 1 demo =====");
		System.out.println(convert1(INPUT_DATA));
		
		System.out.println("===== Convert 2 demo =====");
		System.out.println(convert2(INPUT_DATA));
		
	}
	
	public static String convert1(String input) {
		String result = "";
		String[] lines = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result += wordsInLine[0] + " ==> " + wordsInLine[2] + System.lineSeparator();
		}
		return result;
	
	}
	
	
	public static String convert2(String input) {
		String result = new String();
		String[] lines = input.split(System.lineSeparator());
		for (int i = 1; i < lines.length; i++) {
			String[] wordsInLine = lines[i].split(";");
			result += wordsInLine[1] + " (email: " + wordsInLine[2] + ")" + System.lineSeparator();
		}
		return result;
	
	}

}
		 * 
		 */
		
		/*
		 * zad 21 turn first char to capital
		 * import java.util.Scanner;

public class FirstCharCapital {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
		String userInput = sc.nextLine();
		
		
		System.out.println(firstCharToTitleCase(userInput));
	}

	public static String firstCharToTitleCase(String string) {
		char[] chars = string.toLowerCase().toCharArray();
		boolean found = false;
		for (int i = 0; i < chars.length; i++) {
			if (!found && Character.isLetter(chars[i])) {
				chars[i] = Character.toUpperCase(chars[i]);
				found = true;
			} else if (Character.isWhitespace(chars[i])) {
				found = false;
			}
		}
		return String.valueOf(chars);
	}
}
		 */
		
		/*
		 * zad 22 convert decimal to roman numbers and vice versas
		 import java.util.Scanner;

public class ConvertDecimalToRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		mainLoop: while (true) {
			System.out.print("Please, select mode. If you want to convert Roman "
					+ "numbers to decimal - type 'R2D' and press enter."
					+ System.lineSeparator()
					+ "If you want to convert decimal numbers to Roman - type 'D2R' and press enter: ");

			String mode = sc.next();
			if (mode.equalsIgnoreCase("R2D")) {
				while (true) {
					System.out.print("Please, enter Roman number you want to convert: ");
					String romanNumber = sc.next();
					if (isRomanNumberValid(romanNumber)) {
						System.out.println(roman2Decimal(romanNumber));
						break mainLoop;
					} else {
						System.out.println("You entered invalid Roman number. "
								+ "Please, try one more time.");
						continue;
					}
				}
			} else if (mode.equalsIgnoreCase("D2R")) {
				while (true) {
					System.out.print("Please, enter decimal number "
							+ "you want to convert: ");
					int decimalNumber = sc.nextInt();
					if (isDecimalNumberValid(decimalNumber)) {
						System.out.println(decimal2Roman(decimalNumber));
						break mainLoop;
					} else {
						System.out.println("Please, enter positive integer from 1 to 100.");
						continue;
					}

				}

			}
			
			System.out.println("Please, enter 'R2D' or 'D2R.");
		}
	}

	

	 * Converts decimal numbers to Roman.
	 * 
	 * Takes int value as a parameter. Works only with numbers from 1 to 100.
	 * 
	 * @param number to convert to Roman.
	 * @return string of Roman number.
	 * 
	public static String decimal2Roman(int number) {
		String[] a = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C" };
		int[] b = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100 };
		StringBuilder s = new StringBuilder();
		for (int i = a.length - 1; i >= 0; i--) {
			while (number >= b[i]) {
				s.append(a[i]);
				number -= b[i];
			}
		}
		return s.toString();
	}


	 * Converts Roman numbers to decimal.
	 * 
	 * Takes string value with Roman number as a parameter.
	 * 
	 * At first method validates if input string could be Roman number. After method
	 * uses algorithm to convert Roman numeral to decimal.
	 * 
	 * @param romanNumber
	 * @return decimal representation of Roman number


	public static int roman2Decimal(String romanNumber) {
		String romanNumeral = romanNumber.toUpperCase();

		int decimal = 0;
		int lastNumber = 0;

		for (int x = romanNumeral.length() - 1; x >= 0; x--) {
			char convertToDecimal = romanNumeral.charAt(x);

			switch (convertToDecimal) {
			case 'C':
				decimal = processDecimal(100, lastNumber, decimal);
				lastNumber = 100;
				break;

			case 'L':
				decimal = processDecimal(50, lastNumber, decimal);
				lastNumber = 50;
				break;

			case 'X':
				decimal = processDecimal(10, lastNumber, decimal);
				lastNumber = 10;
				break;

			case 'V':
				decimal = processDecimal(5, lastNumber, decimal);
				lastNumber = 5;
				break;

			case 'I':
				decimal = processDecimal(1, lastNumber, decimal);
				lastNumber = 1;
				break;

			}

		}
		return decimal;

	}


	 * Utility method which is the part of algorithm that converts Roman numbers to
	 * decimal.
	 * 
	 * @param decimal
	 * @param lastNumber
	 * @param lastDecimal
	 * @return int value
	 * 
	private static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
		if (lastNumber > decimal) {
			return lastDecimal - decimal;
		} else {
			return lastDecimal + decimal;
		}
	}

	
	 * Validation for Roman numbers.
	 * 
	 * Use regular expression which is checking if string really could be Roman
	 * number.
	 * 
	 * @param romanNumber
	 * @return true if String is Roman number
	 
	public static boolean isRomanNumberValid(String romanNumber) {
		return romanNumber
				.matches("^(?i)M{0,3}(D?C{0,3}|C[DM])(L?X{0,3}|X[LC])(V?I{0,3}|I[VX])$");
	}
	
	public static boolean isDecimalNumberValid(int decimalNumber) {
		return decimalNumber > 0 && decimalNumber <= 100;
	}
}
		 */
	}
	
		
	}


