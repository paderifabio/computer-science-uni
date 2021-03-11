class ForDemo {
  public static void main(String[] args) {
    int contoAllaRovescia;
    // for (inizializzazione; expr booleana; aggiornamento)
    for (contoAllaRovescia = 3; contoAllaRovescia >= 0; contoAllaRovescia--) {
      System.out.println(contoAllaRovescia);
      System.out.println("attendere..");
    }

    System.out.println("Partito!");

  }
}

// le variabili dichiarate all'interno del ciclo for sono locali al
// ciclo e non possono essere utilizzate al di fuori
// se non servono fuori ha senso dichiararle dentro

class ForDemo2 {
  public static void main(String[] args){
    for (int i = 0; i <= 10; i++){

      System.out.println("I vale " + i);
    }

    }

}

// usando la virgola si possono inizializzare piu variabili

// class ForDemo3 {
//   public static void main(String[] args){
//     for (int numero = 1, int prodotto = 1; numero <= 10; numero ++) {
//       prodotto = prodotto*numero;
//       System.out.println("numero = " + numero + "prodotto = " + prodotto);
//     }
//   }
// }


// class MediaStudenti {
//   public static void main(String[] args) {
//     double prossimo, media, somma = 0;
//     int numeroStudenti = 5;
//     for(int contatore = 1; contatore <= numeroStudenti; contatore ++){
//       prossimo = SavitchIn.readLineDouble();
//       somma = somma + prossimo;
//     }
//     if (numeroStudenti > 0 )
//       media = somma/numeroStudenti;
//     else
//       System.out.println("Non ci sono sufficienti studenti");
//   }
// }
