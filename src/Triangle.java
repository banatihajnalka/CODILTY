import java.util.Arrays;

public class Triangle {

  public static void main(String[] args) {
    int[] A = {10, 2, 5, 1, 8, 20};
    System.out.println(triangle(A));
  }

  private static int triangle(int[] A) {
    if (A.length < 3) {
      return 0;
    }
    Arrays.sort(A);
    for (int i = 0; i < A.length - 2; i++) {
      if (A[i] > A[i + 2] - A[i + 1]) {
//      if (A[i] + A[i+1] > A[i+2]) {  93%
        return 1;
      }
    }
    return 0;
  }
}
