import javax.rmi.ssl.SslRMIClientSocketFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Inserisci un numero:");
        int z = SavitchIn.readLineInt();
        System.out.println("hai inserito il numero:" + z);


    }
}
