/**
Istruzioni di controllo, capitolo 3
*/

import java.util.Scanner;

class IstrControl {
      
      public static final double PENALITA = 8.00;
      public static final double TASSO_DI_INTERESSE = 0.02; // 2% annuo
      
      public static void main(String[] args) {
            
            double saldo;
            System.out.println("Inserisci il saldo del tuo conto: ");
            Scanner keyboard = new Scanner(System.in);
            saldo = keyboard.nextDouble();
            System.out.println("Saldo originale: " + saldo);
            
            if (saldo > 0)
                  saldo = saldo + (saldo*TASSO_DI_INTERESSE)/12;
            else 
                  saldo = saldo - PENALITA;
            
            System.out.println("Il tuo saldo aggiornato è: ");
            System.out.printf("%6.2f\n", saldo);
            
            
            
      }
}


class EqualStrings {
   
   public static void main(String[] args) {
      
      String str1 = "ABC";
      String str2 = "AAB";
      
      System.out.println("Stringa 1: " + str1);
      System.out.println("Stringa 2: " + str2);
      
      boolean result = str1.equals(str2);
      boolean result2 = str1.equalsIgnoreCase(str2); // ignora maiuscole e minuscole
      System.out.println("Risultato: " + result);
      System.out.println("Risultato: " + result2);
      
      System.out.println("Metodo compareTo:" + str1.compareTo(str2)); 
      System.out.println("Se numero negativo la prima precede, altrimenti segue.");
   }
}
