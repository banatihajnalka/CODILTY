import java.util.HashSet;
import java.util.Set;

public class Distinct {

  public static void main(String[] args) {
    int[] A = {2,1,1,2,3,1};
    System.out.println(findDistinct(A));
  }

  private static int findDistinct(int[] A) {
    Set<Integer> unique = new HashSet<>();
    for (Integer value : A) {
      unique.add(value);
    }
    return unique.size();
  }
}
