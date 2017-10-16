
/**
 * Generator for 2 strings
 *
 * @author Zeros. Created Oct 11, 2017.
 */
import java.util.*;

public class Gen {
	
	private final int size = 127;
	
	Gen() {
		char[] a = new char[size];
		int d = 0;

		for (char c = ' '; c <= '~'; c++, d++) {//makes a character array with all of the characters in it
			a[d] = c;

		}
		int v = 0;
		for (; v < size; v++) { //prints that character array
			System.out.print(a[v]);

		}
		//System.out.println(v); prints the number of array positions it printed 
		
		String str = new String();
		int[] array = new int[size];

		for (v = 0; v < size; v++) { //creates an integer array with all values from 0 to 127
			array[v] = v;

		}
		
		array = Gen.RandomizeArray(array);

		for (d = 0; d < 95; d++) {// turns the shuffled letters in to an array. 
			char hi = a[array[d]];
			str = str + "" +  hi;
			str = str.trim();
		}
		System.out.print(str);

	}

	public static int[] RandomizeArray(int[] array){
		Random rgen = new Random();  // Random number generator			
 
		for (int i=0; i<array.length; i++) {
		    int randomPosition = rgen.nextInt(array.length);
		    int temp = array[i];
		    array[i] = array[randomPosition];
		    array[randomPosition] = temp;
		}
 
		return array;
	}
}
