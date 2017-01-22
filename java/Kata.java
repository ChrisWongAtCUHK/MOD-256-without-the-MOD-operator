public class Kata {
	public static int mod256WithoutMod(int number) {
		if (Integer.signum(number) >= 0) { // positive number
			number &= 0xff; // mod 256
		} else {
			number = ~(number - 1); // to positive
			number &= 0xff; // mod 256
			number = ~number + 1; // back to negative
		}
		return number;
	}
}