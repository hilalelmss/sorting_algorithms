package sortingAlgorithms;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 1, 5, 9, 3, 4, 12,-6, 7, 2 };
		bubble(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"  ");
		}
	}

	public static void bubble(int[] list) {
		int i, j, temp = 0;
		for (i = 0; i < list.length; i++) {
			for (j = 1; j < (list.length - i); j++) {
				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}

	}
}
