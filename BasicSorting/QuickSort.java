/**
 * Created by avinashvundyala on 09/07/16.
 */
public class QuickSort {

  public void recursiveQuickSort(int[] arr, int start, int end) {
    if(start == end) { return arr; }
    else {
      
    }
  }

  public static void main(String[] arg) {
      QuickSort qs = new QuickSort();

      // int[] unsortedArray1 = {6,4,2,1,9,0};
      // System.out.print("Unsoreted Array Sorting: ");
      // ss.printArray(qs.iterativeSelectionSort(unsortedArray1));

      // int[] unsortedArray2 = {1,2,3,4,5,6};
      // System.out.print("\nAlready Soreted Array Sorting: ");
      // ss.printArray(qs.iterativeSelectionSort(unsortedArray2));

      // int[] unsortedArray3 = {6,5,4,3,2,1};
      // System.out.print("\nUnsoreted Array Sorting: ");
      // ss.printArray(qs.iterativeSelectionSort(unsortedArray3));

      int[] unsortedArray4 = {6,4,2,1,9,0};
      System.out.print("\nUnsoreted Array Sorting: ");
      ss.printArray(qs.recursiveQuickSort(unsortedArray4, 0));

      int[] unsortedArray5 = {1,2,3,4,5,6};
      System.out.print("\nAlready Soreted Array Sorting: ");
      ss.printArray(qs.recursiveQuickSort(unsortedArray5, 0));

      int[] unsortedArray6 = {6,5,4,3,2,1};
      System.out.print("\nUnsoreted Array Sorting: ");
      ss.printArray(qs.recursiveQuickSort(unsortedArray6, 0));
  }

}
