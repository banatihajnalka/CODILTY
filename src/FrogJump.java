public class FrogJump {

  public static void main(String[] args) {
    int X = 10;
    int Y = 85;
    int D = 30;
    System.out.println(jumping(X, Y, D));
  }

  private static int jumping(int X, int Y, int D) {

    int difference = Y - X;
    int jumps = difference / D;

    if (difference % D != 0) {
      jumps++;
    }
    return jumps;
  }

}
