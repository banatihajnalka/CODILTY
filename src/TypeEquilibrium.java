public class TypeEquilibrium {

  public static void main(String[] args) {
    int[] A = {3,1,2,4,3};
    System.out.println(equilibrium(A));
  }

  private static int equilibrium(int[] A) {
    int sumAll = 0;
    for (int value : A) {
      sumAll += value;
    }

    int minimalDifference = Integer.MAX_VALUE;
    int currentDifference = Integer.MAX_VALUE;
    int firstPart = 0;
    int secondPart = 0;

    for (int i = 0; i < A.length - 1; i++) {
      firstPart += A[i];
      secondPart = sumAll - firstPart;
      currentDifference = Math.abs(firstPart - secondPart);
      minimalDifference = Math.min(currentDifference, minimalDifference);
    }
    return minimalDifference;
  }
}

