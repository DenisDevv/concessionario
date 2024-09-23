package catalogo;
import java.util.Arrays;

public class Funzioni {
    private static String[] marche = new String[0];
    private static String[] modelli = new String[0];
    private static double[] prezzi = new double[0];
    private static String[] carburanti = new String[0];
    public static void aggiungiAuto(String marca, String modello, double prezzo, String carburante) {
        marche = Arrays.copyOf(marche, marche.length + 1);
        modelli = Arrays.copyOf(modelli, modelli.length + 1);
        prezzi = Arrays.copyOf(prezzi, prezzi.length + 1);
        carburanti = Arrays.copyOf(carburanti, carburanti.length + 1);
        marche[marche.length - 1] = marca;
        modelli[modelli.length - 1] = modello;
        prezzi[prezzi.length - 1] = prezzo;
        carburanti[carburanti.length - 1] = carburante;
    }
    public static String visualizzaAuto() {
        String ris = "";
        for (int i = 0; i < marche.length; i++) {
             ris += marche[i] + " " + modelli[i] + " " + prezzi[i] + " " + carburanti[i] + "\n";
        }
        return ris;
    }
    public static String ricercaAuto(String marca, String modello) {
        int i = Funzioni.ricerca(marca, modello);
        if (i != -1) {
            return marche[i] + " " + modelli[i] + " " + prezzi[i] + " " + carburanti[i];
        } else {
            return "Auto non trovata.";
        }
    }
    public static void cancellaAuto(String marca, String modello) {
        int i = Funzioni.ricerca(marca, modello);
        Funzioni.rimuoviElemento(i);
    }
    public static void modificaAuto(String marcaVecchia, String modelloVecchio, String marcaNuova, String modelloNuovo, double prezzoNuovo, String carburanteNuovo) {
        for (int i = 0; i < marche.length; i++) {
            if (marche[i].equals(marcaVecchia) && modelli[i].equals(modelloVecchio)) {
                marche[i] = marcaNuova;
                modelli[i] = modelloNuovo;
                prezzi[i] = prezzoNuovo;
                carburanti[i] = carburanteNuovo;
                return;
            }
        }
    }
    public static void visualizzaAutoInOrdineCrescente() {
        int n = prezzi.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (prezzi[j] > prezzi[j + 1]) {
                    scambiaElementi(j, j + 1);
                }
            }
        }
    }
    public static String visualizzaModelliDiesel() {
        for (int i = 0; i < marche.length; i++) {
            if (carburanti[i].equalsIgnoreCase("Diesel")) {
                return marche[i] + " " + modelli[i] + " " + prezzi[i] + " " + carburanti[i];
            }
        }
        return "Nessun modello Diesel trovato.";
    }
    private static void rimuoviElemento(int index) {
        if (index < 0 || index >= marche.length) return;

        String[] nuoveMarche = new String[marche.length - 1];
        String[] nuoviModelli = new String[modelli.length - 1];
        double[] nuoviPrezzi = new double[prezzi.length - 1];
        String[] nuoviCarburanti = new String[carburanti.length - 1];

        for (int i = 0, j = 0; i < marche.length; i++) {
            if (i != index) {
                nuoveMarche[j] = marche[i];
                nuoviModelli[j] = modelli[i];
                nuoviPrezzi[j] = prezzi[i];
                nuoviCarburanti[j] = carburanti[i];
                j++;
            }
        }

        marche = nuoveMarche;
        modelli = nuoviModelli;
        prezzi = nuoviPrezzi;
        carburanti = nuoviCarburanti;
    }

    private static void scambiaElementi(int i, int j) {
        String tempMarca = marche[i];
        marche[i] = marche[j];
        marche[j] = tempMarca;

        String tempModello = modelli[i];
        modelli[i] = modelli[j];
        modelli[j] = tempModello;

        double tempPrezzo = prezzi[i];
        prezzi[i] = prezzi[j];
        prezzi[j] = tempPrezzo;

        String tempCarburante = carburanti[i];
        carburanti[i] = carburanti[j];
        carburanti[j] = tempCarburante;
    }
    private static int ricerca(String marca, String modello) {
        for (int i = 0; i < marche.length; i++) {
            if (marche[i].equals(marca) && modelli[i].equals(modello)) {
                return i;
            }
        }
        return -1;
    }
}
