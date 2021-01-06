class Ordinamento {

	public static void main (String args[]) {
		int[] dati = new int[10];
		System.out.println("Scrivi 10 numeri interi su righe diverse");
		leggi(dati);
		ordina(dati);
		//insertionSort(dati);
		scrivi(dati);
	} //fine main

	public static void scambia(int[] a, int i, int j) {
		int x;
		x = a[i];
		a[i] = a[j];
		a[j] = x;
	}
	
	public static void insertionSort(int[] a) {
		int j,v;
		for (int i = 1; i < a.length; i++) {
			v = a[i];
			j = i;
			while (j > 0 && a[j-1] > v) {
/* Se viene usato & invece di &&, oppure se viene invertito 
l'ordine dei congiunti (anche con &&)  si ha un errore in esecuzione
array out of bound */
				a[j] = a[j-1];
				j--;
			}
			a[j] = v;
		}
	}

	public static void bolli(int [] a, int i) {
/** 
Precondizione: 0 ≤ i < dati.length
Postcondizione: la posizione i del vettore dati contiene l’elemento massimo del 
sottovettore di dati compreso tra le posizioni 0 ed i 
*/
	
	for (int j = 0; j < i; j++) 		
		if (a[j] > a[j+1]) 
			scambia(a,j,j+1);
	}  //fine bolli

	public static void ordina(int[] a){
/** 
Precondizione: true
Postcondizione: il vettore dati è ordinato in ordine crescente 
*/
	for (int i = a.length - 1; i > 0; i--) 
/**
Invariante: gli elementi di dati nelle posizioni  ≥ i e  < dati.length 
sono ordinati in ordine crescente e sono ≥ di tutti gli elementi nelle posizioni ≥ 0 e < i
*/
			bolli(a,i);	
	}

	public static void leggi(int[] a) {	
		for (int i = 0;i < a.length; i++) {
			a[i] = SavitchIn.readLineInt();
		}  //fine for
	}  //fine leggi

	public static void scrivi(int[] a) {	
		for (int i = 0; i < a.length; i++) {
			System.out.print (a[i] + "   ");	
		}  //fine for
		System.out.println();
	}  //fine scrivi

}  //fine classe



