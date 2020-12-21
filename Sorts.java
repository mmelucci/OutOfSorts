import java.util.Arrays;
public class Sorts{
  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int temp = 0;
    boolean swap;
    for (int j = data.length-1; j >= 0; j --) {
      swap = false;
      // System.out.println(Arrays.toString(data));
      for (int i = 0; i < j; i ++) {
        if (data[i] > data[i+1]) {
          temp = data[i];
          data[i] = data[i+1];
          data[i+1] = temp;
          swap = true;
        }
      }
      if (!swap) {
        break;
      }
    }
  }

  public static void selectionSort(int[] data) {
    for (int j = 0; j < data.length-1; j++){
      int minimum = data[j];
      int temp = 0;
      for (int i = j; i < data.length; i ++) {
        if (data[i] < minimum) {
          minimum = data[i];
          temp = data[j];
          data[j] = minimum;
          data[i] = temp;
        }
      }
        // System.out.println(Arrays.toString(data));
    }
  }

  public static void insertionSort(int[] data){
    for (int j = 0; j < data.length; j++) {
      for (int i = 0; i < j; i ++) {
        if (data[i] > data[j]) {
          int temp = data[j];
          for (int k = j-1; k >= i; k --) {
            data[k+1] = data[k];
          }
          data[i] = temp;
          System.out.println(Arrays.toString(data));
        }
      }
    }
}
}
