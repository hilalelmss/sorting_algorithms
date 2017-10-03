package sortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
	int a[] = { 8, 23, 10, 6, 7, 9, 3, 1 };

	void selection(int[] dizi) {
		int tmp;
		int min;
		for (int i = 0; i < dizi.length - 1; i++) {
			min = i;
			for (int j = i; j < dizi.length; j++) {
				if (dizi[j] < dizi[min]) {
					min = j;
				}
			}
			tmp = dizi[i];
			dizi[i] = dizi[min];
			dizi[min] = tmp;
		}
	}

	public static void main(String args[]) {
		SelectionSort sort = new SelectionSort();
		sort.selection(sort.a);
		System.out.println(Arrays.toString(sort.a));

	}

}
