import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Reverse character");
    System.out.println("input > ");
    String name = sc.nextLine();
    StringBuffer str = new StringBuffer(name);
    System.out.println(str.reverse().toString());
  }
}
