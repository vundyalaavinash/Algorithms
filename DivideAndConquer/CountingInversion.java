import java.util.List;
import java.util.Arrays;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;


public class CountingInversion {

  public int count = 0;

  public void mergeAndCountSplit(List<Integer> array, int start, int end) {
    return;
  }

  public void sortAndCount(List<Integer> array, int start, int end) {
    System.out.println(start + " - " + end);
    if(end <= start) { 
      return;
    } else {
      sortAndCount(array, start, end/2);
      sortAndCount(array, end/2 + 1, end);
      mergeAndCountSplit(array, start, end);
    }
  }

  public static void main(String args[]) {
    try {
      List<Integer> numbers = new ArrayList<Integer>();
      FileReader f = new FileReader("IntegerArray.txt");
      BufferedReader br = new BufferedReader(f);
      String line;
      while((line = br.readLine()) != null) {
        System.out.println(line);
        numbers.add(Integer.parseInt(line));
      } 
      CountingInversion ci = new CountingInversion();
      ci.sortAndCount(numbers, 0, numbers.size() - 1);
      System.out.println(ci.count);
    } catch(IOException ex) {
      ex.printStackTrace();
    }
  }
} 