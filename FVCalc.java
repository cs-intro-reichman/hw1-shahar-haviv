// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		Integer currentValue = Integer.parseInt(args[0]);
		Double intrestRate = Double.parseDouble(args[1]);
		Integer numberOfYears = Integer.parseInt(args[2]);
		Double intrestPrecenage = (intrestRate / 100);
		Integer appresheatedValue = (int) (currentValue * (Math.pow(1 + intrestPrecenage, numberOfYears)));
		System.out.println(
				"After " + numberOfYears
						+ " years, " + currentValue +
						"saved at " + intrestPrecenage + " will yield $" + appresheatedValue);
	}
}