import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws Exception {
    System.out.println("Hello world!");
    System.out.println("The World!");
    System.out.printf("name : %s\n", "Park");
    System.out.printf("age : %d\n", 34);
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("input : ");
    String keyCode = scanner.nextLine();
    System.out.println("Number : " + keyCode);
  }
}