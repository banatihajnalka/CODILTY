import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElement {
  public static void main(String[] args) {
    int[] A = {3};
    System.out.println(findMissingElement(A));
    System.out.println(findMissingElement2(A));
  }

  private static int findMissingElement2(int[] A) {
    int max = A.length + 1;

    Set incompleteSet = new HashSet();
    for(int i=0; i<A.length; i++) {
      incompleteSet.add(A[i]);
    }
    for(int i=1; i<max+1; i++) {
      if(!incompleteSet.contains(i)) {
        return (i);
      }
    }
    throw new RuntimeException("shouldn't reach here");
  }

  //    50%
  private static int findMissingElement(int[] A) {
    Arrays.sort(A);
    int missing = 0;
    for (int i = 0; i < A.length - 1; i++) {
      if (A[i + 1] - A[i] > 1) {
        missing = A[i] + 1;
      }
    }
    return missing;
  }
}