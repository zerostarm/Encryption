
/**
 * Generator for 2 strings
 *
 * @author Zeros. Created Oct 11, 2017.
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Gen {

	Gen() {
		char[] a = new char[96];
		int d = 0;

		for (char c = ' '; c <= '`'; c++, d++) {
			a[d] = c;

		}
		for (int v = 0; v < 95; v++) {
			System.out.print(a[v]);

		}
		
		
		String str = new String();
		int[] ints = new int[95];

		for (int v = 0; v < 95; v++) {
			ints[v] = v;

		}
		
		shuffleArray(ints);

		for (d = 0; d < 95; d++) {
			str = str + a[ints[d]];

		}
		System.out.print(str);

	}

	static void shuffleArray(int[] ar) {
		// If running on Java 6 or older, use `new Random()` on RHS here
		Random rnd = ThreadLocalRandom.current();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rnd.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
	}
}
