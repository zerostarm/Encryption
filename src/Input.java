
/**
 * input file of Encryption software
 *
 * @author Zeros.
 *         Created Oct 11, 2017.
 */
import java.util.*;
import java.io.*;

public class Input {

	public static void main(String[] args) throws java.io.FileNotFoundException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Input your password to be encrypted: ");
		String alpha = scan.next();

		String beta = Input.Find(alpha);
		System.out.println(beta);
	}

	private static final int size = 127;

	public static String Find(String alpha) throws java.io.FileNotFoundException {// needs to take the character at index x of alpha and replace it with the
												// character at index x of ceta.

		String ceta = Input.Gen();
		String newn = "";
		int a = 0;
		while(a<alpha.length()) {
		//for (int a = 0; a < alpha.length(); a++) {
			newn = newn + ceta.charAt(a);
			a+=1;
		}
		System.out.println(newn);
		try(  PrintWriter out = new PrintWriter( "filename.txt" )  ){
		    out.println( ceta );
		}
		return newn;
	}

	public static String Gen() {
		char[] a = new char[size];
		int d = 0;

		for (char c = ' '; c <= '~'; c++, d++) {// makes a character array with all of the characters in it
			a[d] = c;

		}
		int v = 0;
		// (; v < size; v++) { // prints that character array
		// System.out.print(a[v]);

		// }
		// System.out.println(v); prints the number of array positions it printed

		String str = new String();
		int[] array = new int[size];

		for (v = 0; v < size; v++) { // creates an integer array with all values from 0 to 127
			array[v] = v;

		}

		array = Input.RandomizeArray(array);

		for (d = 0; d < size; d++) {// turns the shuffled letters in to an array.
			char hi = a[array[d]];
			str = "" + str + "" + hi;
			str = str.trim();
		}
		return str;

	}

	public static int[] RandomizeArray(int[] array) {
		Random rgen = new Random(); // Random number generator

		for (int i = 0; i < array.length; i++) {
			int randomPosition = rgen.nextInt(array.length);
			int temp = array[i];
			array[i] = array[randomPosition];
			array[randomPosition] = temp;
		}

		return array;
	}
}
