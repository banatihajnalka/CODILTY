public class PassingCars {

  public static void main(String[] args) {
    int[] A = {0, 1, 0, 1, 1};
    System.out.println(findPairs(A));
    System.out.println(findPairs2(A));
  }

  private static int findPairs2(int[] A) {
    int countOne = 0;
    int countZero = 0;
    int pair = 0;
    int counter = 0;
    for (int i = A.length - 1; i >= 0; i--) {
      counter++;
      if (A[i] == 1) {
        countOne++;
      } else if (A[i] == 0) {
        countZero++;
        pair += counter - countZero;
        if (pair > 1000000000) {
          return -1;
        }
      }
    }

    return pair;
  }

  //  50%
  private static int findPairs(int[] A) {
    int counter = 0;
    for (int i = 0; i < A.length; i++) {
      if (A[i] == 0) {
        for (int j = i; j < A.length; j++) {
          if (A[j] == 1) {
            counter++;
          }
        }
      }
    }
    return counter;
  }
}
