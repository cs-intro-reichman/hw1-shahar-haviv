// Generates three integer random numbers in a given range,
// and prints them in increasing order.

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ascend {
	public static void main(String[] args) {
		Double num1 = Math.random() * Integer.parseInt(args[0]);
		Double num2 = Math.random() * Integer.parseInt(args[0]);
		Double num3 = Math.random() * Integer.parseInt(args[0]);
		Integer int1 = num1.intValue();
		Integer int2 = num2.intValue();
		Integer int3 = num3.intValue();
		System.out.println(int1 + " " + int2 + " " + int3);
		Integer[] nums = { int1, int2, int3 };
		Arrays.sort(nums);
		System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
	}
}
