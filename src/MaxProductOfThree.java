import java.util.Arrays;

public class MaxProductOfThree {

  public static void main(String[] args) {
    int[] A = {-3, 1, 2, -2, 5, 6};
    System.out.println(maxProduct(A));
  }

  private static int maxProduct(int[] A) {
    Arrays.sort(A);
    int firstMax = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
    int secondMax = A[0] * A[1] * A[A.length - 1];
    return Math.max(firstMax, secondMax);
  }
}
