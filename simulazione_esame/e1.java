/* Esercizio 1
Scrivere un metodo iterativo e1 con le seguenti caratteristiche:
 - e1 ha un parametro formale di tipo matrice bidimensionale di interi che può essere solo quadrata o nulla.
 - e1 restituisce true quando:
    . la matrice non è nulla
    . la somma degli elementi di ciascuna riga coincide con la somma degli elementi della colonna corrispondente

*/

// tip, minimizzare l'uso dei return

class Esercizio1 {

/** 
 * Suggerimento, ragionare su questi elementi
 * Dati ingresso: M matrice di interi (quello che prende in input la funzione) Parametro formale -> matrice bidimensionale di interi
 * Dati in uscita: risultato booleano
 * Condizione di ingresso: M quadrata o nulla
 * Condizione di uscita: risultato  = true quando vedi sopra
 * La matrice può essere solo quadrata o nulla quindi non devo gestire matrici non di queste caratteristiche
 */

 public static boolean e1(int [][] m) { // dato in uscita e parametro formale

    // gestione matrice nulla
    // boolean risultato;
    // if (m==null){
    //     risultato = false; // meglio evitare questo punto di uscita
    // } risultato = true; piu elegante come segue sotto:

    // appena troviamo un falso conviene fermarsi, così non si itera inutilmente su tutte le colonne

    // boolean risultato = (m!=null); // se m è null allora risultato = false

    // if (risultato){ // qua entriamo solo se m non è nulla
    //     for (int i=0; i<m.length; i++){ // attenzione a non mettere length() in vettori si mette
    //         for ( j=0; j<m[i].length; j++){
    //             int sommaR = 0, int sommaC = 0;
    //             sommaR += m[i][j]; // sommaR ci sono gli elementi della riga i
    //         }
    //         for ( j=0; j<m[i].length; j++){
    //             int sommaR = 0, int sommaC = 0;
    //             sommaC += m[j][i]; // sommaC ci sono gli elementi della colonna i (invertendo gli indici)
    //         }
    //         risultato = risultato&&sommaR == sommaC; 
    //         // devo metterlo in and perchè se ho trovato falso in una riga l'output deve essere false
    //         // se non mettessi && avrei solo l'output dell'ultima iterazione sommaR==sommaC

            

    //     } 


    // }
    boolean risultato = (m!=null); // se m è null allora risultato = false

    if (risultato){ // qua entriamo solo se m non è nulla
        for (int i=0; risultato && i<m.length; i++){ // RISULTATO QUI MI FA USCIRE APPENA RISULTATO è FALSE
            int sommaR = 0;
            int sommaC = 0;
            for (int j=0; j<m[i].length; j++){            
                sommaR += m[i][j]; // sommaR ci sono gli elementi della riga i
                sommaC += m[j][i];
            }
            risultato = sommaR == sommaC; 

            // devo metterlo in and perchè se ho trovato falso in una riga l'output deve essere false
            // se non mettessi && avrei solo l'output dell'ultima iterazione sommaR==sommaC
      
        } 
    }
    return risultato;

 }

 public static void stampa(int [][] m ) { // metodo void perchè non restituisce niente ma deve solo stampare
    // questo metodo serve per stamparsi le matrici che se no non vengono 
    if (m == null){
        System.out.println("Matrice nulla");
    }
    // per printare una matrice bisogna annidare due cicli
    for (int i = 0; i<m.length; i++ ){
        for (int j=0; j<m[i].length; j++) { 
            System.out.println("\t" + m[i][j]);
        }
    }

 }

 public static void main(String[] args) {

     int [][] M = {{1,2}, {2,1}};  // questa è una matrice quadrata e somma di riga 1+2 = somma di colonna 1+2
     // int [][] M = {{1,2,3}, {2,3,1}, {3,1,2}};   // esempi di matrici su cui testare il metodo e1
     // int [][] M = {{1,2,3}, {2,3,1}, {3,4,1}};
     // int [][] M = null; // richiesto dall'esercizio

      //vedi l'output che produce

    //stampa(M);
    System.out.println("Risultato:" + e1(M));

 }

}






