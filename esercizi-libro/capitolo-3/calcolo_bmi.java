/** 
Questo programma consente di calcolare il BMI, indice di massa corporea
Autore: Fabio Paderi
Creato il: 2020-01-03
*/

import java.util.Scanner;

class CalcoloBmi {
      
      public static void main(String[] args) {
            
            // inizializzare prima tutte le variabili
            Scanner oggettoScanner = new Scanner(System.in);

            int altezza, kilogrammi,metri, centimetri;
            double BMI, altezzaInM, massa;
      
            System.out.println("Per il calcolo del BMI dovrai inserire alcune informazioni.");
            System.out.println("Inserisci la tua altezza in centimetri seguita da INVIO:");
            altezza = oggettoScanner.nextInt();
            System.out.println("Ora inserisci la tua massa corporea in chilogrammi seguita da INVIO:");
            kilogrammi = oggettoScanner.nextInt();
            
            System.out.printf("Bene, la tua altezza è %3d cm, e la tua massa è %3d kg:\n", altezza, kilogrammi);
            
            metri =  (int)(altezza / 100);
            centimetri = (int)(altezza % 100);
            
            altezzaInM = metri + centimetri*0.01;
            massa = kilogrammi;
            
            BMI = massa / (altezzaInM*altezzaInM);
            
            System.out.printf("Il tuo BMI è:%4.4f\n",  BMI);
            
            if (BMI < 18.5)
                  System.out.println("Sei SOTTOPESO.");
            else if (BMI < 25)
                  System.out.println("Sei NORMOPESO.");
            else if (BMI < 30)
                  System.out.println("Sei SOVRAPPESO.");
            else
                  System.out.println("Sei OBESO.");
            
            
      }
      
}