import java.util.Scanner;

public class es_3_p25 {
  public static void main(String[] args) {
    System.out.println("Digita i due numeri da moltiplicare.");
    Scanner tastiera = new Scanner(System.in);
    int n1, n2;
    n1 = tastiera.nextInt();
    n2 = tastiera.nextInt();
    int prodotto = n1*n2;
    System.out.println("Il prodotto è: " + prodotto);
  }
}
