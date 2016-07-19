/**
 * Created by avinashvundyala on 09/07/16.
 */
public class InsertionSort {

  public int[] iterativeInsertionSort(int[] arr) {
    for(int i = 0; i < arr.length; i++ ) {
      for(int j = i; j > 0; j-- ) {
        if(arr[j] < arr[j-1]) {
          arr[j] = arr[j] + arr[j-1];
          arr[j-1] = arr[j] - arr[j-1];
          arr[j] = arr[j] - arr[j-1];
        }
      }
    }
    return arr;
  }

  public int[] recursiveInsertionSort(int[] arr, int start) {
    if(start === arr.length) {
      return arr;
    }
    int temp;
    for(int j=start; j>0; j--) {
      if(arr[j] > arr[j-1]) {
        arr[j] = arr[j] + arr[j-1];
        arr[j-1] = arr[j] - arr[j-1];
        arr[j] = arr[j] - arr[j-1];
      }
    }
    return arr;
  }

  public void printArray(int[] array) {
      for(int number: array) {
          System.out.print(String.valueOf(number) + " ");
      }
  }

  public static void main(String args[]) {
      InsertionSort is = new InsertionSort();

      int[] unsortedArray1 = {6,4,2,1,9,0};
      System.out.print("Unsoreted Array Sorting: ");
      is.printArray(is.iterativeInsertionSort(unsortedArray1));

      int[] unsortedArray2 = {1,2,3,4,5,6};
      System.out.print("\nAlready Soreted Array Sorting: ");
      is.printArray(is.iterativeInsertionSort(unsortedArray2));

      int[] unsortedArray3 = {6,5,4,3,2,1};
      System.out.print("\nUnsoreted Array Sorting: ");
      is.printArray(is.iterativeInsertionSort(unsortedArray3));

      int[] unsortedArray4 = {6,4,2,1,9,0};
      System.out.print("\nUnsoreted Array Sorting: ");
      is.printArray(is.recursiveSelectionSort(unsortedArray4, 0));

      int[] unsortedArray5 = {1,2,3,4,5,6};
      System.out.print("\nAlready Soreted Array Sorting: ");
      is.printArray(is.recursiveSelectionSort(unsortedArray5, 0));

      int[] unsortedArray6 = {6,5,4,3,2,1};
      System.out.print("\nUnsoreted Array Sorting: ");
      is.printArray(is.recursiveSelectionSort(unsortedArray6, 0));
  }

}
