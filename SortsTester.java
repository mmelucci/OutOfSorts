public class SortsTester {

	public static void main(String[] args) {
    int[] test1 = {16,10,9,17,8,5,7,3,1,19};
    int[] test2 = {};
    int[] test3 = {1, 1, 1, 2, 1502, 2, 4, 2,1231, 1};
    int[] test4 = {10, 9, 8, 7, 6, 5, 4, 1};
    // Sorts.bubbleSort(test1);
    // Sorts.bubbleSort(test2);
    // Sorts.bubbleSort(test3);
    // Sorts.bubbleSort(test4);
		// Sorts.selectionSort(test1);
		// Sorts.selectionSort(test2);
		// Sorts.selectionSort(test3);
		Sorts.insertionSort(test1);
		Sorts.insertionSort(test2);
		Sorts.insertionSort(test3);
  }
}
