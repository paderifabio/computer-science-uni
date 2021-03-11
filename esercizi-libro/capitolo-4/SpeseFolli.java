class SpeseFolli {
  // inizializzazione delle due costanti
  public static final int AMMONTARE_BUONO = 100;
  public static final int PRODOTTI_MAX = 3;

  public static void main(String[] args) {

    boolean possiediSoldi = true; // inizializzazione di avere soldi
    int rimastiDaSpendere = AMMONTARE_BUONO;
    int totaleSpeso = 0; // inizializzazione della spesa al tempo 0
    int numeroProdotti = 1;

    while(possiediSoldi && (numeroProdotti<= PRODOTTI_MAX)) {
      System.out.println("Puoi comprare fino a "+ (PRODOTTI_MAX-numeroProdotti+1) + " prodotti");
      System.out.println("che costano meno di "+ rimastiDaSpendere + " Euro.");
      System.out.println("Inserisci il prezzo del prodotto # " + numeroProdotti + ": ");
      int costoProdotto = SavitchIn.readLineInt();
      if (costoProdotto <= rimastiDaSpendere) {
        System.out.println("Puoi comprare questo prodotto.");
        totaleSpeso = totaleSpeso + costoProdotto;
        System.out.println("Hai speso in totale " + totaleSpeso+ " Euro.");
        rimastiDaSpendere = AMMONTARE_BUONO - totaleSpeso;
        if (rimastiDaSpendere > 0) {
          numeroProdotti++;
        } else {
          System.out.println("Hai finito i soldi.");
          possiediSoldi = false;
        }
      } else {
        System.out.println("Prodotto troppo costoso.");
      }


    }
    System.out.println("Hai speso " + totaleSpeso + " e hai finito le spese folli.");
  }
}
