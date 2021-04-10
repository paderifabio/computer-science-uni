// esercizio 1 pagina 169

class Es1 {
    public static void main(String[] args) {
        
        String word;
        String fine_programma = "fine";
        do {
            System.out.println("Digita delle parole, per terminare inserisci la parola 'fine'");
            word = SavitchIn.readLineWord();
            System.out.println("La parola scelta è: " + word);
        } while (!word.equals(fine_programma)); 
        
    


    }

}

class EsX {
        // Iterate over characters of a String
        public static void main (String[] args)
        {
            String s = "Techie Delight";
     
            // using simple for loop
            for (int i = 0; i < s.length(); i++) {
                System.out.print(s.charAt(i));
            }
        }
    }

    class Ex5
{
    // Iterate over characters of a String
    public static void main (String[] args)
    {
        String s = "Techie Delight";
 
        String[] arr = s.split("");
 
        for (String ch : arr) {
            System.out.print(ch);
        }
    }
}