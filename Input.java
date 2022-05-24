import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    //    this scanner take literally anything
    // Scanner sc = new Scanner(System.in);
    // String scanned = sc.next();
    // System.out.println(scanned);

    // for only integer
    // Scanner sc = new Scanner(System.in);
    // int scanned = sc.nextInt();
    // System.out.println(scanned);

    // another way to maneuver this is using parseInt
    Scanner sc = new Scanner(System.in);
    String scanned = sc.next();

    int x = Integer.parseInt(scanned);
    System.out.println(x);
  }
  //   this logic can be used fo all other java data types except for parseInt
}
