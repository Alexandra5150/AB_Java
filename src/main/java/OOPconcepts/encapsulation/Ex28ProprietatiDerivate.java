package main.java.OOPconcepts.encapsulation;

/*
## 28) Exercitiul28_ProprietatiDerivate

Obiectiv: Expune comportamente derivate din stare fără a expune starea în sine.

Sarcină:
- Adaugă metoda `boolean isVip()` care revine `true` dacă `puncte >= 1000`.
- Adaugă metoda `String statut()` care revine EXACT: `"VIP"` dacă `isVip()`, altfel `"Standard"`.
- Adaugă metodă `void afisare()` cu 2 linii:
```
👤 Nume: <nume>
⭐ Puncte: <puncte> | Statut: <VIP/Standard>
```

Pași:
1. Continuă pe clasa `CardCinemaSecure` cu validările de la ex. 27.
2. Implementează `isVip()` și `statut()` folosind `getPuncte()` (nu citi câmpul direct din exterior).
3. În `main`, demonstrează cu două obiecte: ("Ana", 980) și ("Mihai", 1200).

Greșeli frecvente:
- Logică duplicată în `statut()` în loc să folosească `isVip()`. Păstrează un singur loc pentru condiție.
 */

public class Ex28ProprietatiDerivate {

    public static class CardHotelSecure {
        private String nume;         // niciodată null/blank
        private int noptiAcumulate;  // interval 0..1000
        private boolean activ;

        public CardHotelSecure(String nume, int noptiAcumulate, boolean activ) {
            setNume(nume);
            setNoptiAcumulate(noptiAcumulate);
            setActiv(activ);
        }

        public String getNume() {
            return nume;
        }

        public int getNoptiAcumulate() {
            return noptiAcumulate;
        }

        public boolean isActiv() {
            return activ;
        }

        public void setNume(String n) {
            if (n == null) { n = ""; }
            n = n.trim();
            this.nume = n.isEmpty() ? "Anonim" : n;
        }

        public void setNoptiAcumulate(int n) {
            if (n < 0) n = 0;
            if (n > 1000) n = 1000;
            this.noptiAcumulate = n;
        }

        public void setActiv(boolean a) {
            this.activ = a;
        }


        public boolean isVip() {
            return getNoptiAcumulate() >= 1000;
        }

        public String statut() {
            return isVip() ? "VIP" : "Standard";
        }

        public void afisare() {
            System.out.println("👤 Nume: " + nume);
            System.out.println("⭐ Puncte: " + getNoptiAcumulate() + " | Statut: " + statut());
            System.out.println();
        }
    }


    public static void main(String[] args) {
        CardHotelSecure c = new CardHotelSecure("Ana", 980, true);
        c.afisare();
        c.setNume("  Mihai ");
        c.setNoptiAcumulate(1200);
        c.afisare();
    }

}
