package nauka;

import java.util.*;

public class choice {
	public static void wybierz() {
		double start = System.currentTimeMillis();
		int i = 0;
		int j = 0;
		int n = 1000;
		int x = 0;
		int min = 0;

		int counter = 0;
		int[] arr = new int[n];
		int[] arrsorted = new int[n];

		arr = tworzliste.lista();

		ArrayList<Integer> arrl = new ArrayList<Integer>();
		ArrayList<Integer> arrsort = new ArrayList<Integer>();
		for (int z : arr) {
			arrl.add(z);
		}
		while (j < n) {
			min = arrl.get(0);
			while (i < arrl.size()) {
				if (arrl.get(i) < min) {
					min = arrl.get(i);
					x = i;
					counter++;
				}

				i++;
			}
			arrsort.add(arrl.get(x));
			arrl.remove(x);
			j++;
			i = 0;
			x = 0;
		}
		j = 0;
		
		while (j < n) {
			arrsorted[j] = arrsort.get(j);
			j++;
		}
		System.out.println("Counter: " + counter + " " + Arrays.toString(arrsorted));
		double end = System.currentTimeMillis();
		System.out.println("Choice sort time execution time: " + (end - start) + "ms");
		System.out.println(" ");
	}
}
