package nauka;

import java.util.Arrays;

public class bubble {
	public static void bombel() {
		double start = System.currentTimeMillis();
		int i = 0;
		int j = 1;
		int n = 1000;
		int x = 0;
		int counter = 0;
		int[] arr = new int[n];
		arr = tworzliste.lista();
		while (j == 1) {
			j = 0;
			while (i < n - 1) {
				if (arr[i] > arr[i+1]) {
					x = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = x;
					counter++;
					j = 1;
				}
				i++;
			}
			i = 0;
		}
		System.out.println("Counter: " + counter + " " + Arrays.toString(arr));
		double end = System.currentTimeMillis();
		System.out.println("Bubble sort time execution time: " + (end - start) + "ms");
		System.out.println(" ");
	}
}
