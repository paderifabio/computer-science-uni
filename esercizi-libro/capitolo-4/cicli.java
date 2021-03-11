/*
--- Capitolo 4 --- Cicli

Un ciclo while può anche essere NON ESSERE MAI ESEGUITO
la prima cosa che succede è la valutazione dell'espressione booleana
che se è falsa non fa neanche partire il ciclo

*/
class CicloWhile1 {

      public static void main(String[] args) {

            int numero, conteggio;
            int somma;

            System.out.println("Inserisci un numero: ");
            numero = SavitchIn.readLineInt();

            conteggio = 0;
            somma = 0;

            while (conteggio <= numero) { // potenzialmente qua potrebbe già non partire mai
                  System.out.println(conteggio + ", ");

                  conteggio++;
                  somma = somma+conteggio;

            }
            System.out.println();
            System.out.println("Sorpresa!");


      }

}

/*
Nel ciclo do-while invece la prima cosa che viene eseguita è il corpo del
ciclo, che quindi almeno una volta viene sempre eseguito.
*/

class CicloDoWhile1 {

      public static void main(String[] args) {

            int numero, conteggio;

            System.out.println("Inserisci un numero: ");
            numero = SavitchIn.readLineInt();

            conteggio = 1;
            do {
                  System.out.println(conteggio + ", ");
                  conteggio++;
            } while (conteggio <= numero);

            System.out.println();
            System.out.println("Sorpresa!");


      }

}



class CicloWhile2 {

      public static void main(String[] args) {

            int numero, conteggio;

            System.out.println("Inserisci un numero maggiore di 10: ");
            numero = SavitchIn.readLineInt();

            while (numero <= 10) {
                  System.out.println("Il numero inserito è minore di 10!");
                  System.out.println("Inserisci un numero maggiore di 10: ");
                  numero = SavitchIn.readLineInt();

            }

            System.out.println();
            System.out.println("Ottimo, il numero è maggiore di 10!");


      }

}


// Cicli annidati


class CicliAnnidati {

      public static void main(String[] args) {


        System.out.println("Questo programma calcola la media");
        System.out.println("di un elenco di voti non negativi");

        double somma;
        int numeroStudenti;
        double successivo;
        String risposta;
        int numeroEsami = 0;

        do {
             System.out.println();
             System.out.println("Inserisci tutti i voti di cui");
             System.out.println("vuoi calcolare la media.");
             System.out.println("Quando hai terminato, digita un numero negativo.");

             somma = 0;
             
             successivo = SavitchIn.readLineDouble();

             while (successivo >= 0) {

                   somma = somma + successivo;
                   numeroEsami++;
                   successivo = SavitchIn.readLineDouble();

             }
             if (numeroStudenti > 0 ) {
                   System.out.println("La media è " + somma/numeroEsami);

             } else {
                   System.out.println("La media non è calcolabile");

             }
             System.out.println("Vuoi calcolare la media di un altro esame?");
             System.out.println("Scrivi si o no");
             risposta = SavitchIn.readLineString();

        }   while (risposta.equalsIgnoreCase("si"));


      }

}
