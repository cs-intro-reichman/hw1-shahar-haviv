// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		String[] numbers = args[0].split("");
		switch (numbers.length) {
			case 1:
				System.out.println("0 hundreds, 0 tens, and " + numbers[0] + " ones.");
				break;
			case 2:
				System.out.println("0 hundreds, " + numbers[0] + " tens, and " + numbers[1] + " ones.");
				break;
			case 3:
				System.out.println(numbers[0] + " hundreds, " + numbers[1] + " tens, and " + numbers[2] + " ones.");
				break;
		}
	}
}
