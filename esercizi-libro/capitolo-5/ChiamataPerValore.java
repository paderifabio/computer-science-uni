public class ChiamataPerValore {
    public static void incrementa(int valore) {
        valore = valore + 1;
    }
    public static int incrementaRitorna(int valore) {
        return valore + 1;
    }

    public static double moltiplica(int valore1, int valore2){
        return valore1 * valore2; // quando viene invocato, i due parametri vengono inizializzati al valore indicato
        // quando si invoca il metodo --> chiamata per valore
    }
    // ogni parametro formale va indicato quando si invoca il metodo
    public static void faiQualcosa(int x, int y, double costo, String codice, char z){
        System.out.println(x + y + costo + codice + z);

    }

    // due modi per scrivere lo stesso metodo:
    public static int maggiore(int x, int y){
        int risultato;
        if (x>=y){
            risultato = x;
        } else {
            risultato = y;
        }
        return risultato;
    } 
    // oppure
    public static int maggiore2(int x, int y){
        if(x>=y){
            return x;
        } else {
            return y;
        }
    }
    // entrambi funzionano, ma se l'istruzione fosse molto lunga, non sarebbe molto leggibile inserire
    // molteplici istruzioni return.
    // Sebbene si possa usare più volte,
    // è buona norma utilizzare una sola volta l'istruzione return vicino alla fine del body

    public static void main(String[] args) {
        int dato = 3;
        incrementa(dato); // non succede nulla
        // dato = incrementa(dato;) errore perchè il metodo ritorna void non int
        System.out.println("dato vale " + dato);

        dato = incrementaRitorna(dato);
        System.out.println("dato vale " + dato); // in questo caso posso incrementare perchè ritorno int

        int x = 5;
        int y = 7;
        double prodotto = moltiplica(x, y);
        System.out.println(x + " X "+ y + " = " + (int)(prodotto));

        faiQualcosa(5, 7, 9.15, "codice", 'Z'); // con gli apici chiamo un char, se metto " " non lo legge come char!!!!
    }
}
