package net.severo.entdes;
/**
 * 
 * @author Luis Manuel Gomez Gonzalez
 *
 */
public class Factorial {

	private static final String VALUE_OF_N = "N arvo:: ";
	private static final String VALUE_OF_NF = "N! arvo: ";

	public static void main(String[] args) {

		int n = (int) (Math.random() * 10);
		int result = n;
		System.out.println(VALUE_OF_N + n);
		while (n > 1) {
			result = result * (n - 1);
			n--;
		}
		System.out.println(VALUE_OF_NF + result);

	}

}
