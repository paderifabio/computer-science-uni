/*
Istruzione switch:

serve quando si hanno tanti if-else nestati, e può aiutare a 
rendere più comprensibile il codice

*/

import java.util.Scanner;

class ProvaSwitch {
      
      public static void main(String[] args) {
            
            int numeroNeonati;
            System.out.println("Inserisci il numero di nascite:");
            Scanner keyboard = new Scanner(System.in);
            numeroNeonati = keyboard.nextInt();
        
        switch(numeroNeonati) {
              
              case 1:
                    System.out.println("Un figlio!");
                    break;
              
              case 2:
                    System.out.println("Due figli!");
                    break;
              
              case 3:
              
              default:
                    System.out.println("Il numero di figli è:"+numeroNeonati);
                    break;
      
        }    
      }
}
