package sortingAlgorithms;

import java.util.Arrays;

public class QuickSort {
	int[] array = { 5, 6, -9, -26, 65, 1, 87, 12, 5, 4, 6 };

	void quickSort(int[] a, int minindis, int maxiindis) {

		int i = minindis, j = maxiindis, h;
		int x = a[(minindis + maxiindis) / 2];
		do {
			while (a[i] < x)
				i++;
			while (a[j] > x)
				j--;
			if (i <= j) {
				h = a[i];
				a[i] = a[j];
				a[j] = h;
				i++;
				j--;
			}
		} while (i <= j);
		if (minindis < j)
			quickSort(a, minindis, j);
		if (i < maxiindis)
			quickSort(a, i, maxiindis);
	}

	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(quickSort.array, 0, 10);
		System.out.println(Arrays.toString(quickSort.array));
	}

}
