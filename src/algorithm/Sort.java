package algorithm;

public class Sort {

	long executionTime = 0;
	/*
	 * Please implement all the sorting algorithm. Feel free to add helper
	 * methods. Store all the sorted data into one of the databases.
	 */

	public int[] selectionSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[i]) {
					int temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}

		}

		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] insertionSort(int[] array) {
		final long startTime = System.currentTimeMillis();
		int[] list = array;
		for (int j = 1; j < list.length; j++) {
			int key = list[j];
			int i = j - 1;
			while ((i > -1) && (list[i] > key)) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = key;
		}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;
		return list;
	}

	public int[] bubbleSort(int[] array) {
		int[] list = array;
		int temp = 0;
		final long startTime = System.currentTimeMillis();
		for (int i = 0; i < list.length; i++) {
			for (int j = 1; j < (list.length - i); j++) {
				if (list[j - 1] > list[j]) {
					temp = list[j - 1];
					list[j - 1] = list[j];
					list[j] = temp;
				}
			}
		}
		final long endTime = System.currentTimeMillis();
		final long executionTime = endTime - startTime;
		this.executionTime = executionTime;

		return list;
	}

	public int[] mergeSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] quickSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] heapSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] bucketSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public int[] shellSort(int[] array) {
		int[] list = array;
		// implement here

		return list;
	}

	public static void printSortedArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
