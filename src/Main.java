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