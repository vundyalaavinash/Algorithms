/**
 * Created by avinashvundyala on 09/07/16.
 */
public class BubbleSort {

    public int[] bubbleSort(int[] array) {
        int temp;
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    public static void main(String args[]) {
        BubbleSort bs = new BubbleSort();
        int[] unsortedArray = {6,4,2,1,9,0};
        int[] sortedArray =  bs.bubbleSort(unsortedArray);
        for(int number: sortedArray) {
            System.out.println(String.valueOf(number));
        }
    }
}
