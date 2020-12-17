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
      System.out.println(Arrays.toString(data));
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
}
