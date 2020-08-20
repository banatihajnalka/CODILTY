import java.util.HashMap;
import java.util.Map;

public class OddOccurrencesInArray {

  public static void main(String[] args) {
    int[] A = {9, 7, 4, 9, 7};
    System.out.println(oddOccurrence(A));
  }

  private static int oddOccurrence(int[] A) {

    HashMap<Integer, Integer> occurrences = new HashMap<>();
    for (Integer number : A) {
      if (occurrences.containsKey(number)) {
        occurrences.put(number, occurrences.get(number) + 1);
      } else {
        occurrences.put(number, 1);
      }
    }

    int number = 0;

    for (Map.Entry entry : occurrences.entrySet()) {
      if (((Integer) entry.getValue() % 2 == 1)) {
        number = (Integer) entry.getKey();
      }
    }
    return number;
  }
}
