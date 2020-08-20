import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermCheck {

  public static void main(String[] args) {
    int[] A = {4,3,1};
    System.out.println(permutationCheck(A));
    System.out.println(permutationCheck2(A));
  }

  private static int permutationCheck2(int[] A) {
    Set<Integer> tested = new HashSet<>();
    Set<Integer> realPermutation = new HashSet<>();

    for (int i = 0; i < A.length ; i++) {
      tested.add(A[i]);
      realPermutation.add(i+1);
    }

    if (tested.containsAll(realPermutation)) {
      return 1;
    } else {
      return 0;
    }
  }


  //  25%
  private static int permutationCheck(int[] A) {
    Arrays.sort(A);
    for (int i = 0; i < A.length -1; i++) {
      if ((A[i+1] - A[i]) > 1 ) {
        return 0;
      }
    }
    return 1;
  }
}
