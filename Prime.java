// Is the number prime????
public class Prime {

  public static void main(String[] args) {
    long N = Long.parseLong(args[0]);
    boolean isPrime = true;
    if (N < 2) isPrime = false;

    // Trying all factors of i of N
     // if if N has a factor, then it has one less than or equal to sqrt(N),
        // so for efficiency we only need to check i <= sqrt(N) or equivalently i*i <= N
    for (long i = 2; i*i <= N; i++) {

      // If divides, shut it down
      if (N % i == 0) {
        isPrime = false;
        break;
      }
    }

    if (isPrime) System.out.println(N + " is prime!");
    else System.out.println(N + " is not prime :(");
  }
}