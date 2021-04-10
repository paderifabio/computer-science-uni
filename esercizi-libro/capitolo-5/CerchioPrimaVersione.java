import java.util.Scanner;

public class CerchioPrimaVersione { 
    
    public static double areaCerchioRaggio2(){ // metodo che restituisce un double
        return 3.14159 * 2 * 2;

    } 

    public static double areaCerchioRaggio2V2() { 
        /*
        La variabile risultata è dichiarata dentro il metodo ed è locale, 
        vale soltanto al suo interno, può essere utilizzata solo all'interno 
        del metodo. Potrei anche avere 2 metodi con la variabile risultato, questo è
        fattibile.
        */
        double risultato = 3.14159 * 2 * 2;
        return risultato;

    }// questa versione e la precedente non ammettono parametri formali detti anche solo parametri

    public static double areaCerchio(double raggio) { // raggio è un PARAMETRO FORMALE
        return 3.14159 * raggio * raggio;
    }    

    public static void main(String[] args) {

        // areaCerchioRaggio2
        //double area = areaCerchioRaggio2();
        //System.out.println("Area cerchio di raggio due: " + area);
        //System.out.println("Area cerchio di raggio due: " + areaCerchioRaggio2());

        // areaCerchioRaggio2V2
        // Variabili locali, la variabile risultato non viene sovrascritta da quella interna al metodo sopra.
        //double risultato = 30.8;
        //double area = areaCerchioRaggio2V2(); // si assegna 12.56 alla variabile risultato ma questo non ha 
        // effetto all'interno del metodo main
        //System.out.println("Area del cerchio di raggio 2: " + area);
        //System.out.println("Risultato vale ancore: " + risultato);

        System.out.println("Si inserisca il valore del raggio: ");
        Scanner tastiera = new Scanner(System.in);
        double raggio = tastiera.nextDouble();

        double area = areaCerchio(raggio); // il valore viene detto ARGOMENTO
        System.out.println("Area cerchio raggio " + raggio + " = " + area);

    }
}
// Alcuni linguaggi hanno le variabili globali. In Java non ci sono

