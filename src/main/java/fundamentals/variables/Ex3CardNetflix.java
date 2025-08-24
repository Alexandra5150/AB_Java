package main.java.fundamentals.variables;

/*
 3) Exercitiul03_CardNetflix
Obiectiv: double pentru ore și cost.
Pași:
Fișier/clasă Exercitiul03_CardNetflix.
Declară:
String profil = "Family";
double oreVizionate = 36.5;
double costPeOra = 0.45;
Calculează: double costTotal = oreVizionate * costPeOra;
Afișează EXACT (poți folosi System.out.printf("%.2f", costTotal) pentru 2 zecimale):
📺 CARD NETFLIX
Profil: Family
Ore vizionate: 36.5
Cost total: 16.42 $/lună
Commit: feat: add exercitiul 03 - card Netflix (double)
Tips:
Pentru 2 zecimale, System.out.printf("%.2f", costTotal); este preferabil concatenării.
*/


public class Ex3CardNetflix {
    public static void main(String[] args) {
        // Variabile pentru cardul Netflix
        String profil = "Family";
        double oreVizionate = 36.5;
        double costPeOra = 0.45;
        double costTotal = oreVizionate * costPeOra;

        // Afișare informații card
        System.out.println("\uD83D\uDCFA CARD NETFLIX");
        System.out.println("Profil: " + profil);
        System.out.println("Ore vizionate: " + oreVizionate);
        System.out.println("Cost total: " + String.format("%.2f", costTotal) + " $/luna");
    }
}
