/**
 * Created by avinashvundyala on 09/07/16.
 */

import java.util.Arrays;

public class MergeSort {
 
  public static Comparable[] merge(Comparable[] first, Comparable[] last, Comparable[] list) {
    int i = 0, j = 0, k = 0;;
    while(i < first.length && j < last.length) {
      if(first[i].compareTo(last[j]) < 0) {
        list[k] = first[i];
        i++;
      } else {
        list[k] = last[j];
        j++;
      }
      k++;
    }
    System.arraycopy(first, i, list, k, first.length - i);
    System.arraycopy(last, j, list, k, last.length - j);
    return list;
  }

  public static Comparable[] mergeSort(Comparable[] array) {
    if(array.length <= 1) {
      return array;
    }
    Comparable[] first = new Comparable[array.length/2];
    Comparable[] last = new Comparable[array.length - first.length];
    System.arraycopy(array, 0, first, 0, first.length);
    System.arraycopy(array, first.length, last, 0, last.length);

    mergeSort(first);
    mergeSort(last);

    merge(first, last, array);

    return array;
  }

  public static void main(String[] args) {
    Integer[] a = { 2, 6, 3, 5, 1 };
    mergeSort(a);
    System.out.println(Arrays.toString(a));
  }
}
