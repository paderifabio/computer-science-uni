/*

Nomi delle variabili e delle classi importanti:
Il nome della classe inizia per Maiuscola mentre il nome delle
variabili comincia con la minuscola.
Le costanti come PI, vanno dichiarate con le lettere
Maiuscole tipo GIORNI_DELLA_SETTIMANA = 7

Le costanti vanno dentro la Classe ma fuori dai Metodi, main incluso

compatibilità caratteri: byte -> short -> int -> long -> float -> double
si può andare da sinistra a destra, ma non da destra a sinistra

*/

class NomiVariabili {

  public static final double PI = 3.14159; // dichiarazione di una costante
  public static final int GIORNI_DELLA_SETTIMANA = 7;

  public static void main(String[] args) {

    int partiteVinte = 4;
    int partitePerse = 3;
    int punteggio = partitePerse*0 + partiteVinte*3;
    int nuovoSaldo;

    System.out.println("Punteggio = " + punteggio );
    System.out.println("PI vale: " + PI);
    System.out.println("Giorni della settimana: " + GIORNI_DELLA_SETTIMANA);
    // System.out.println(nuovoSaldo); errore perchè non inizializzata


  }

}


/* 
operatori di assegnamento ausiliari: += ad esempio

se scrivo quantita += 5 vuol dire quantita = quantita+5
oppure quantita *= 5 vuol dire quantita = quantita*5

I programmi scritti in Java funzionano generalmente così:
Preparare: dichiarare le variabili e spiegare il programma all'utente
Input: chiedere e leggere un input da parte dell'utente
Processare: eseguire le attività
Output: mostrare il risultato

Questa struttura viene abbreviata con il termine PIPO  
*/

class OperatoriIncrementali {
  
  public static void main(String[] args) {
    
    int n = 3;
    int n2 = 4;
    int tmp = n2;
    
    int moltiplicazione = n * (++n2);
    int moltiplicazione2 = n * (tmp++);
    System.out.println("n = " + n);
    System.out.println("n2 = " + n2);
    System.out.println("prodotto di n * (++n2) " + moltiplicazione );
    System.out.println("prodotto di n * (n2++) " + moltiplicazione2 );
  }
  
}

/*
attenzione alle variabili di tipo String. Si tratta di oggetti
appartenenti alla classe String che hanno dei metodi specifici utilizzabili 
per alcune operazioni

Per richiamare i metodi bisogna mettere un punto seguito dal metodo con parentesi

Ogni elemento di una stringa ha un index che parte da 0, come in python e non come in R

Quando un oggetto viene invocato da un metodo si dice che esso si chiama oggetto
ricevente (receiving object) o semplicemente receiver.

*/

class MetodiString {
  
  public static void main(String[] args) {
    
    String saluto;
    saluto = "Ciao!";
    System.out.println(saluto);
    int lunghezza = saluto.length(); // length non richiede alcun argomento come metodo
    System.out.println("La lunghezza della stringa è: "+lunghezza);
    
    String prova = "Questa è una stringa di prova!";
    System.out.println(prova); 
    
    // charAt(indice)
    System.out.println("L'outoput di charAt(5) è: " + prova.charAt(5) );
    System.out.println("L'outoput di toLowerCase() è: " + prova.toLowerCase() );
    System.out.println("L'outoput di toUpperCase() è: " + prova.toUpperCase() );
    
    // come gsub
    System.out.println("L'output di replace() è: " + prova.replace("Questa", "Quella")); 
    
     // come str_trim
    System.out.println("L'output di trim() è: " + prova.trim());
    
    // attenzione ai simboli come le virgolette, per farli si usa il backslash
    // caratteri come il backslash sono chiamati caratteri di Escape o 'escape characters'
    System.out.println("Il termine \"Java\" indica il nome di un \"Linguaggio\" di programmazione");
    
    // usando printf si può printare definendo il formato
    double n = 19.4;
    System.out.println("questo carattere: "+n );
    System.out.printf("posso scriverlo anche così:%4.2f\n", n);
    System.out.printf("uno si può scrivere così:%02d\n", 1);
    
    double prezzo = 19.5;
    int quantita = 2;
    String elemento = "Oggetti";
    System.out.printf("%10s venduti:%4d a €%5.2f. Totale = €%1.2f\n", elemento, quantita, prezzo, quantita*prezzo);
  }
}




