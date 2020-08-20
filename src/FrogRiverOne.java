import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

  public static void main(String[] args) {
    int[] A = {1,3,1,4,2,3,5,4};
    int X = 5;
    System.out.println(earliestTime(X, A));
  }

  private static int earliestTime(int X, int[] A) {
    Set<Integer> leaves = new HashSet<>();
    for (int i = 1; i <= X ; i++) {
      leaves.add(i);
    }
    Set<Integer> fallen = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      fallen.add(A[i]);
      if (fallen.size() < leaves.size()) {
        continue;
      }
      if (fallen.containsAll(leaves)) {
        return i;
      }
    }
    return -1;

  }
}
