
public class LinearSearch {

    public int linearSearch (int[] array, int value) {
        for(int i = 0; i < array.length; i++ ) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void printIndex(int n, int index) {
        if(index == -1) {
            System.out.println(n +" not found!");
        } else {
            System.out.println(n + " is found at index " + index);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = 3;
        LinearSearch ls = new LinearSearch();

        ls.printIndex(n, ls.linearSearch(arr, n));

        n = 11; 
        ls.printIndex(n, ls.linearSearch(arr, n));
    }
}