import java.util.Arrays;

public class CyclicRotation {

  public static void main(String[] args) {
    int[] array = {3, 8, 9, 7, 6};
    int rotation = 3;
    System.out.println(Arrays.toString(rightRotation(array, rotation)));
  }

  private static int[] rightRotation(int[] array, int rotation) {

    int rotationTime = rotation % array.length;

    for (int i = 0; i < rotationTime; i++) {
      int last = array[array.length -1];
      for (int j = array.length -1 ; j > 0; j--) {
        array[j] = array[j -1];
      }
      array[0] = last;
    }
    return array;

  }
}
