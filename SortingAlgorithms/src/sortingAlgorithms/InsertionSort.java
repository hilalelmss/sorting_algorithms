package sortingAlgorithms;

public class InsertionSort {
	public static void main(String[] args) {
		int[] myarray = { 14, 11, 32, 1, 65, 2, 8, 4, -9, 10, 89 };
		for (int i : myarray) {
			System.out.print(i+"   ");
		}
		insertion(myarray);
		System.out.println("   ");
		for (int i : myarray) {
			System.out.print(i + "   ");
		}
	}

	public static void insertion(int[] array) {
		int i, j, temp;
		for (i = 1; i < array.length; i++) {
			for (j = i; j > 0; j--) {
				if (array[j] < array[j - 1]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}

	}
}
