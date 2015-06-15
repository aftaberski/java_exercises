public class ReverseArray {

  public static void main(String[] args) {
    int N = args.length;
    // System.out.println(args[0]);
    for (int i = 0; i < N/2; i++) {
        String temp = args[N-i-1];
        args[N-i-1] = args[i];
        args[i] = temp;
    }
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
  }
}