import java.util.Arrays;

public class Main {
    static String[] marche = new String[0];
    static String[] modelli = new String[0];
    static double[] prezzi = new double[0];
    static String[] carburanti = new String[0];

    public static void main(String[] args) {
        aggiungiAuto("Fiat", "Panda", 10000, "Benzina");
        aggiungiAuto("Volkswagen", "Golf", 20000, "Diesel");
        visualizzaAuto();
        ricercaAuto("Fiat", "Panda");
        cancellaAuto("Fiat", "Panda");
        modificaAuto("Volkswagen", "Golf", "Volkswagen", "Golf GTI", 25000, "Benzina");
        visualizzaAutoInOrdineCrescente();
        visualizzaModelliDiesel();
    }
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
    public static void visualizzaAuto() {
        for (int i = 0; i < marche.length; i++) {
            System.out.println(marche[i] + " " + modelli[i] + " " + prezzi[i] + " " + carburanti[i]);
        }
    }
