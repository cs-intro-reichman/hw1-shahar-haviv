// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		String[] numbers = args[0].split("");
		Integer arrayLangth = numbers.length;
		switch (arrayLangth) {
			case 1:
				System.out.println("0 hundreds, 0 tens, and " + numbers[0] + " ones.");
				break;
			case 2:
				System.out.println("0 hundreds, " + numbers[0] + " tens, and " + numbers[1] + " ones.");
				break;
			case 3:
				System.out.println(numbers[0] + " hundreds, " + numbers[1] + " tens, and " + numbers[2] + " ones.");
				break;
			default:
				System.out.println(
						args[0].substring(0, arrayLangth - 2) + " hundreds, " + numbers[arrayLangth - 2] + " tens, and "
								+ numbers[arrayLangth - 1] + " ones.");
				break;

		}
	}
}
