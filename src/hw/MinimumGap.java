package hw;

import java.util.HashMap;

public class MinimumGap {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 3, 4, 1, 7 };
		int minGap = minimumGap(arr);
		System.out.println("Minimum gap in this array is: " + minGap);
	}

	public static int minimumGap(int[] a) {
		HashMap<Integer, Integer> lastVisitedNumber = new HashMap<>();
		int minGap = -1; // We haven't found any valid gaps yet
		boolean isGap = false;

		for (int i = 0; i < a.length; i++) {
			if (lastVisitedNumber.containsKey(a[i])) {
				int gap = i - lastVisitedNumber.get(a[i]);
				if (!isGap || gap < minGap) {
					minGap = gap;
				}
				isGap = true;
			}
			lastVisitedNumber.put(a[i], i);
		}
		if (isGap) {
			return minGap;
		} else {
			return -1;
		}
	}
}
// Time complexity = O(n)
