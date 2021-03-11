class Methods1  {
    public static void main(String[] args) {

        sayHello();

    }
    
    static void sayHello() {

        int numeroSaluti;
        System.out.println("Inserisci il numero di saluti:");
        numeroSaluti = SavitchIn.readLineInt();

        for (int n = 0; n < numeroSaluti; n++) {
            System.out.println("Hello!" + n);
            
        }


    }
}
