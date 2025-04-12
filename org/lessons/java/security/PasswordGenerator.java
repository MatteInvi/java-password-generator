
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) throws Exception {
       String nome;
       String cognome;
       String colorePreferito;
       int giornoNascita;
       int meseNascita;
       int annoNascita;
      
      
       Scanner inputNome = new Scanner(System.in);
       System.out.println("Inserisci il tuo nome");
       nome = inputNome.nextLine();

       Scanner inputCognome = new Scanner(System.in);
       System.out.println("Inserisci il tuo cognome");
       cognome = inputCognome.nextLine();

       Scanner inputColorePreferito = new Scanner(System.in);
       System.out.println("Inserisci il tuo colore preferito: ");
       colorePreferito = inputColorePreferito.nextLine();

       Scanner inputGiornoNascita = new Scanner(System.in);
       System.out.println("Inserisci il tuo giorno di nascita (GG):");
       String giornoNascitaInserito = inputGiornoNascita.nextLine();
       giornoNascita = Integer.parseInt(giornoNascitaInserito);

       Scanner inputMeseNascita = new Scanner(System.in);
       System.out.println("Inserisci il tuo mese di nascita (MM):");
       String meseNascitaInserito = inputMeseNascita.nextLine();
       meseNascita = Integer.parseInt(meseNascitaInserito);

       Scanner inputAnnoNascita = new Scanner(System.in);
       System.out.println("Inserisci il tuo anno di nascita (YYYY):");
       String annoNascitaInserito = inputAnnoNascita.nextLine();
       annoNascita = Integer.parseInt(annoNascitaInserito);
     
       int sommaDataNascita = giornoNascita + meseNascita + annoNascita;
       
       System.out.print("La tua password poco sicura è " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita );

       inputMeseNascita.close();
       inputGiornoNascita.close();
       inputAnnoNascita.close();
       inputCognome.close();
       inputNome.close();
       inputColorePreferito.close();

  
  }
}
