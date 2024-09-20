import java.util.Arrays;
import java.util.Scanner;
import catalogo.Funzioni;
public class Main {
    Funzioni funzioni = new Funzioni();
    static Boolean inEsecuzione = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (inEsecuzione) {
            System.out.println("1. Aggiungi auto");
            System.out.println("2. Visualizza auto");
            System.out.println("3. Ricerca auto");
            System.out.println("4. Cancella auto");
            System.out.println("5. Modifica auto");
            System.out.println("6. Visualizza auto in ordine crescente");
            System.out.println("7. Visualizza modelli diesel");
            System.out.println("8. Esci");
            System.out.print("Scegli un'opzione: ");
            int scelta = scanner.nextInt();
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la marca: ");
                    String marca = scanner.next();
                    System.out.print("Inserisci il modello: ");
                    String modello = scanner.next();
                    System.out.print("Inserisci il prezzo: ");
                    double prezzo = scanner.nextDouble();
                    System.out.print("Inserisci il carburante: ");
                    String carburante = scanner.next();
                    Funzioni.aggiungiAuto(marca, modello, prezzo, carburante);
                    break;
                case 2:
                    Funzioni.visualizzaAuto();
                    break;
                case 3:
                    System.out.print("Inserisci la marca: ");
                    String marcaRicerca = scanner.next();
                    System.out.print("Inserisci il modello: ");
                    String modelloRicerca = scanner.next();
                    Funzioni.ricercaAuto(marcaRicerca, modelloRicerca);
                    break;
                case 4:
                    System.out.print("Inserisci la marca: ");
                    String marcaCancella = scanner.next();
                    System.out.print("Inserisci il modello: ");
                    String modelloCancella = scanner.next();
                    Funzioni.cancellaAuto(marcaCancella, modelloCancella);
                    break;
                case 5:
                    System.out.print("Inserisci la marca e il modello dell'auto da modificare: ");
                    String marcaVecchia = scanner.next();
                    String modelloVecchio = scanner.next();
                    System.out.print("Inserisci la nuova marca: ");
                    String marcaNuova = scanner.next();
                    System.out.print("Inserisci il nuovo modello: ");
                    String modelloNuovo = scanner.next();
                    System.out.print("Inserisci il nuovo prezzo: ");
                    double prezzoNuovo = scanner.nextDouble();
                    System.out.print("Inserisci il nuovo carburante: ");
                    String carburanteNuovo = scanner.next();
                    Funzioni.modificaAuto(marcaVecchia, modelloVecchio, marcaNuova, modelloNuovo, prezzoNuovo, carburanteNuovo);
                    break;
                case 6:
                    Funzioni.visualizzaAutoInOrdineCrescente();
                    break;
                case 7:
                    Funzioni.visualizzaModelliDiesel();
                    break;
                case 8:
                    inEsecuzione = false;
                    break;
                default:
                    System.out.println("Opzione non valida.");
            }
        }
        scanner.close();
    }
}