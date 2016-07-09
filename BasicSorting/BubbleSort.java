/**
 * Created by avinashvundyala on 09/07/16.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        int temp;
        boolean swapped = false;
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    swapped = true;
                }
            }
            if(!swapped) {
                return array;
            }
        }
        return array;
    }

    public void printArray(int[] array) {
        for(int number: array) {
            System.out.print(String.valueOf(number) + " ");
        }
    }


    public static void main(String args[]) {
        BubbleSort bs = new BubbleSort();

        int[] unsortedArray1 = {6,4,2,1,9,0};
        System.out.print("Unsoreted Array Sorting: ");
        bs.printArray(bs.bubbleSort(unsortedArray1));

        int[] unsortedArray2 = {1,2,3,4,5,6};
        System.out.print("\nAlready Soreted Array Sorting: ");
        bs.printArray(bs.bubbleSort(unsortedArray2));
    }
}
