import java.util.Arrays;
public class SortsTester {

	public static void main(String[] args) {
    int[] test1 = {16,10,9,17,8,5,7,3,1,19};
    int[] test2 = {};
    int[] test3 = {1, 1, 1, 2, 1502, 2, 4, 2,1231, 1};
    int[] test4 = {10, 9, 8, 7, 6, 5, 4, 1};
		System.out.println("BUBBLE SORT TESTS:");
    Sorts.bubbleSort(test1);
    Sorts.bubbleSort(test2);
    Sorts.bubbleSort(test3);
    Sorts.bubbleSort(test4);
		System.out.println(Arrays.toString(test1));
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.toString(test3));
		System.out.println(Arrays.toString(test4));
		int[] test5 = {16,10,9,17,8,5,7,3,1,19};
  	int[] test6 = {};
    int[] test7 = {1, 1, 1, 2, 1502, 2, 4, 2,1231, 1};
		int[] test8 = {10, 9, 8, 7, 6, 5, 4, 1};
		System.out.println("SELECTION SORT TESTS:");
		Sorts.selectionSort(test5);
		Sorts.selectionSort(test6);
		Sorts.selectionSort(test7);
		Sorts.selectionSort(test8);
		System.out.println(Arrays.toString(test5));
		System.out.println(Arrays.toString(test6));
		System.out.println(Arrays.toString(test7));
		System.out.println(Arrays.toString(test8));
		int[] test9 = {16,10,9,17,8,5,7,3,1,19};
  	int[] test10 = {};
    int[] test11 = {1, 1, 1, 2, 1502, 2, 4, 2,1231, 1};
    int[] test12 = {10, 9, 8, 7, 6, 5, 4, 1};
		System.out.println("INSERTION SORT TESTS:");
		Sorts.insertionSort(test9);
		Sorts.insertionSort(test10);
		Sorts.insertionSort(test11);
		Sorts.insertionSort(test12);
		System.out.println(Arrays.toString(test9));
		System.out.println(Arrays.toString(test10));
		System.out.println(Arrays.toString(test11));
		System.out.println(Arrays.toString(test12));
  }
}
