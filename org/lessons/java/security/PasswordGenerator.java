
import java.util.Scanner;

public class PasswordGenerator {

  public static void main(String[] args) throws Exception {


    // Input
    Scanner input = new Scanner(System.in);
    
    System.out.println("Inserisci il tuo nome:");
    String nome = input.nextLine();

    System.out.println("Inserisci il tuo cognome:");
    String cognome = input.nextLine();
   
    System.out.println("Inserisci il tuo colore preferito:");
    String colorePreferito = input.nextLine();

    System.out.println("Inserisci il tuo giorno di nascita (GG):");
    String giornoNascitaInserito = input.nextLine();
    int giornoNascita = Integer.parseInt(giornoNascitaInserito);

    System.out.println("Inserisci il tuo mese di nascita (MM):");
    String meseNascitaInserito = input.nextLine();
    int meseNascita = Integer.parseInt(meseNascitaInserito);

    System.out.println("Inserisci il tuo anno di nascita (YYYY):");
    String annoNascitaInserito = input.nextLine();
    int annoNascita = Integer.parseInt(annoNascitaInserito);

    // Calcolo somma data di nascita
    int sommaDataNascita = giornoNascita + meseNascita + annoNascita;

    // Output
    System.out.print(
        "La tua password poco sicura è " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataNascita);

    // Chiusure input
    input.close();


  }
}
