import java.util.Scanner;

class ErroreSistematico {
  public static void main(String[] args) {
    int altezza = 0, larghezza = 0, profondita = 0;
    System.out.println("Digita altezza, larghezza e la profondita");
    System.out.println("di una scatola e io calcolerò il volume.");
    Scanner tastiera = new Scanner(System.in);
    altezza = tastiera.nextInt();
    larghezza = tastiera.nextInt();
    profondita = tastiera.nextInt();

    int volume = altezza*larghezza*profondita;
    System.out.println("Il volume è: " + volume);


  }
}
