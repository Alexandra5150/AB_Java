package main.java.OOPconcepts.encapsulation;

/*
## 27) Exercitiul27_Validari_Normalizari

Obiectiv: Adaugă validări/normalizări în constructor și setteri pentru a menține invarianta.

Reguli de business (invariantă):
- `numeClient` nu trebuie să fie `null` sau gol: se normalizează la `trim()`; dacă e gol => `"Anonim"`.
- `puncte` trebuie să fie în intervalul `[0, 100000]` (plafonare).

Pași:
1. Pornește de la clasa din ex. 26; redenumește fișierul `Exercitiul27_Validari_Normalizari.java` sau copiază clasa.
2. Adaugă constructor `CardCinemaSecure(String numeClient, int puncte)` care apelează setteri (nu seta direct câmpurile) pentru a reutiliza regulile.
3. În `setNumeClient`, aplică: `null` -> `""`, apoi `trim()`, apoi `empty ? "Anonim" : valoarea`.
4. În `setPuncte`, aplică clamp: `<0` -> `0`, `>100000` -> `100000`.
5. În `main`, testează 2 cazuri: (" ", -50) și ("Ana ", 120000). Afișează rezultatele.

De ce așa:
- Constructorul folosește setteri pentru a nu duplica logica de validare — un singur loc de adevăr.

Validare:
- Pentru (" ", -50) -> nume devine `Anonim`, puncte `0`.
- Pentru ("Ana ", 120000) -> nume `Ana`, puncte `100000`.
 */

public class Ex27ValidariNormalizari {

    public static class CardHotelSecure {
        private String nume;         // niciodată null/blank
        private int noptiAcumulate;  // interval 0..1000
        private boolean activ;

        public CardHotelSecure(String nume, int noptiAcumulate, boolean activ) {
            setNume(nume);
            setNoptiAcumulate(noptiAcumulate);
            setActiv(activ);
        }

        public String getNume() { return nume; }
        public int getNoptiAcumulate() { return noptiAcumulate; }
        public boolean isActiv() { return activ; }

        public void setNume(String n) {
            if (n == null) { n = ""; }
            n = n.trim();
            this.nume = n.isEmpty() ? "Anonim" : n;
        }

        public void setNoptiAcumulate(int n) {
            if (n < 0) n = 0;
            if (n > 100000) n = 100000;
            this.noptiAcumulate = n;
        }

        public void setActiv(boolean a) {
            this.activ = a;
        }


        public void afisare() {
            System.out.println("👤 Nume: " + nume + " | 🛏️ Nopți: " + noptiAcumulate + " | 🔓 Activ: " + activ);
        }
    }

    public static void main(String[] args) {
        CardHotelSecure c = new CardHotelSecure("  ", -50, true);
        c.afisare();
        c.setNume("  Ana ");
        c.setNoptiAcumulate(120000);
        c.afisare();
    }

}
