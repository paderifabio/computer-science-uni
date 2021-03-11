/* Esercizi fine capitolo */

class Esercizio1 {
      
      public static void main(String[] args) {
            
            int x, y, r;
            double q;
            
            System.out.println("Questo programma indica se un numero è divisibile per un altro");
            System.out.println("...");
            System.out.println("Per cominciare, digita un numero: ");
            x = SavitchIn.readLineInt();
            System.out.println("Ora digita un secondo numero:");
            y = SavitchIn.readLineInt();
            System.out.println("...");
            System.out.println("Hai scelto i numeri "+ x + " e " + y);
            
            if (y == 0) {
                  System.out.println("...");
                  System.out.println("Il valore 0 non è valido come Denominatore");
            } else {
                  
                  r = x % y;
                  q = x/y;
                  if (r == 0) {
                        System.out.println("...");
                        System.out.println("Il resto della divisione è = 0");
                        System.out.println("...");
                        System.out.println(x+ " diviso "+ y + " fa "+ (int)(q));
                        System.out.println("...");
                        System.out.println(x + " è divisibile per "+ y); 
                  } else {
                        System.out.println("...");
                        System.out.println(x+ " diviso "+ y + " fa "+ (int)(q));
                        System.out.println("con resto di "+r);
                        System.out.println("...");
                        System.out.println(x + " non è divisibile per "+ y);
                        
                  }
                  
            }
            
      }
      
}


class Esercizio2 {
      
      public static void main(String[] args) {
            
            double x, y, z;
            double n1, n2, n3;
            
            System.out.println("Questo programma mostra tre numeri in ordine crescente");
            System.out.println("...");
            System.out.println("Per cominciare, digita un numero: ");
            x = SavitchIn.readLineDouble();
            System.out.println("Ora digita un secondo numero:");
            y = SavitchIn.readLineDouble();
            System.out.println("Ora digita un terzo numero:");
            z = SavitchIn.readLineDouble();
            System.out.println("...");
            System.out.println("Hai scelto i numeri "+ x + ", " + y + " e " + z);
            System.out.println("...");
            
            n1 = 0;
            n2 = 0;
            n3 = 0;
            if (x>y & x>z) {
                  
                  n1 = x;
                  if (y>z) {
                        
                        n2 = y;
                        n3 = z;
                        
                  } else {
                        
                        n3 = y;
                        n2 = z;
                        
                  }
                  
            } else if (y>x & y>z) {
                  
                  n1 = y;
                  if (x>z) {
                        
                        n2 = x;
                        n3 = z;
                        
                  } else {
                        
                        n3 = x;
                        n2 = z;
                  }
                  
                  
            } else if (z>y & z>x) {
                  
                  n1 = z;
                  if(x>y) {
                        
                        n2 = x;
                        n3 = y;
                        
                  } else {
                        
                        n3 = x;
                        n2 = y;
                        
                  }
                  
            }
            
            System.out.println("L'ordinamento corretto è:");
            System.out.println(n1);
            System.out.println(n2);
            System.out.println(n3);
      }
}

