package sortingAlgorithms;

public class MergeSort {
	private int[] list;

	public MergeSort(int[] listToSort) {
		list = listToSort;
	}

	public int[] getList() {
		return list;
	}

	public void sort() {
		list = sort(list);
	}

	private int[] sort(int[] array) {
		if (array.length == 1) {
			return array;
		} else {
			// diziyi ikiye bölüyoruz ve solu oluþturuyoruz
			int[] left = new int[array.length / 2];
			System.arraycopy(array, 0, left, 0, left.length);

			// dizinin saðýný oluþturuyoruz ancak tek sayý ihtimali var
			int[] right = new int[array.length - left.length];
			System.arraycopy(array, left.length, right, 0, right.length);

			// her iki tarafý ayrý ayrý sýralýyoruz
			left = sort(left);
			right = sort(right);

			// Sýralanmýþ dizileri birleþtiriyoruz
			merge(left, right, array);

			return array;
		}
	}


	private void merge(int[] left, int[] right, int[] result) {
		int x = 0;
		int y = 0;
		int k = 0;

		
		while (x < left.length && y < right.length) {
			if (left[x] < right[y]) {
				result[k] = left[x];
				x++;
			} else {
				result[k] = right[y];
				y++;
			}
			k++;
		}

		int[] rest;
		int restIndex;
		if (x >= left.length) {

			rest = right;
			restIndex = y;
		} else {

			rest = left;
			restIndex = x;
		}

		for (int i = restIndex; i < rest.length; i++) {
			result[k] = rest[i];
			k++;
		}
	}

	public static void main(String[] args) {

		int[] arrayToSort = { 16, 54, 5, 3, 94, 11, 13, 14, 19, 21, 26, 27 };

		MergeSort mergeSort = new MergeSort(arrayToSort);
		mergeSort.sort();

		int[] sirali = mergeSort.getList();

		for (int i = 0; i < sirali.length; i++) {
			System.out.print(sirali[i] + " | ");
		}

	}
}
