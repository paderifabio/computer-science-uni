/* 
Lazy operations:

Se è sufficiente un pezzo di una valutazione logica per stabilirne il risultato, 
Java non considera neanche la seconda parte.. ad esempio: voglio valutare questa:

X > 10 || Y < 2 || Z > 15

Se X è > 10, l'espressione sarà per forza true, indipendentemente da X e Y
perchè basta che uno sia true perchè l'intera espressione sia true.

*/

class LazyEv {
      public static void main(String[] args){
            
            int compitiEseguiti = 0;
            int punteggioTotale = 0;
            
            // && è Lazy, se ci fosse solo &, valuterebbe entrambi e incorrerebbe in un
            // errore a RunTime perchè si fa una divisione per 0!
            if ((compitiEseguiti > 0) && 
                        ((punteggioTotale / compitiEseguiti) > 60))
                  System.out.println("Ottimo lavoro.");
            else 
                  System.out.println("Impegnati di più.");
                  
                  
      }
}