import java.util.Arrays;

public class BinaryGap {

  public static void main(String[] args) {
    System.out.println(solution(157));
  }

  private static int solution(int N) {
    String binaryString = Integer.toBinaryString(N);

    StringBuilder sb = new StringBuilder(binaryString);
    while (sb.length() > 1 && sb.charAt(sb.length() - 1) == '0') {
      sb.setLength(sb.length() - 1);
    }

    String[] sbArray = sb.toString().split("1");
    System.out.println(Arrays.toString(sbArray));

    int max = 0;

    for (String gap : sbArray) {
      if (gap.length() > max) {
        max = gap.length();
      }
    }
    return max;
  }
}
