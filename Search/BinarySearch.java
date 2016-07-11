public class BinarySearch {

    public int recursiveBinarySearch(int[] arr, int n, int start, int end) {
        int midInx = (int) Math.ceil((end + start) / 2.0f); // Remember type casting.
        if(arr[midInx] == n) {
            return midInx;
        } else if (start == end) {
            return -1;
        } else if (arr[midInx] > n) {
            return recursiveBinarySearch(arr, n, start, midInx);
        } else if (arr[midInx] < n) {
            return recursiveBinarySearch(arr, n, midInx, end);
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
        BinarySearch bs = new BinarySearch();

        bs.printIndex(n, bs.recursiveBinarySearch(arr, n, 0, arr.length-1));

        n = 11; 
        bs.printIndex(n, bs.recursiveBinarySearch(arr, n, 0, arr.length-1));
    }


}