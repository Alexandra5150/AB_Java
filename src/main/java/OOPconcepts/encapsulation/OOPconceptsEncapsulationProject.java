package main.java.OOPconcepts.encapsulation;

/*
# 🧱 Proiectel — Card fidelitate sigur pentru hotel (încapsulare)

Obiectiv: Implementează un card de fidelitate pentru hotel cu câmpuri private, validări în setteri și metode derivate de stare.

De ce acest proiect:
- Exersezi încapsularea corectă: câmpuri `private`, validări consistente, metode derivate (`isVip`).

Cerințe:
1. Clasă `CardHotelSecure` cu câmpuri `private`:
   - `String nume;`
   - `int noptiAcumulate;`
   - `boolean activ;`
2. Constructor: `CardHotelSecure(String nume, int noptiAcumulate, boolean activ)` aplică normalizări:
   - `nume`: `trim()`; dacă null/blank => `"Anonim"`
   - `noptiAcumulate`: clamp `[0, 1000]`
3. Setteri validați:
   - `setNume(String n)` — ca la constructor
   - `setNoptiAcumulate(int n)` — clamp `[0, 1000]`
   - `setActiv(boolean a)`
4. Getteri: pentru toate câmpurile + `boolean isVip()` returnează `noptiAcumulate >= 50`.
5. Metodă de afișare:

```
👤 Nume: <nume> | 🛏️ Nopți: <noptiAcumulate> | 🔓 Activ: <activ>
VIP? <true/false>
```

6. În `main` (clasa `Proiectel_Encapsulare_CardHotel`), demonstrează 3 seturi de modificări și afișări.

Pași recomandați (ff detaliat):
1. Creează fișierul `Proiectel_Encapsulare_CardHotel.java` și clasa publică omonimă cu `main`.
2. În același fișier, definește clasa `CardHotelSecure` cu câmpurile `private`.
3. Scrie constructorul și fă-l să apeleze setteri (pentru a nu duplica logica de validare).
4. Implementează setteri validați conform regulilor (trim/clamp).
5. Implementează getterii + `isVip()`.
6. Implementează `afisare()` cu formatul exact din cerință.
7. În `main`, creează obiectul cu valori „problemă” (nume blank, nopți negative), afișează; apoi setează valori noi (nume valid, nopți peste limită), afișează din nou; apoi setează `noptiAcumulate` peste 50 și verifică `isVip()`.

Acceptance criteria:
- Niciun acces direct la câmpuri în afara clasei (doar prin get/set/metode).
- `nume` nu rămâne niciodată `null` sau blank; `noptiAcumulate` e întotdeauna în [0,1000].
- `afisare()` și `isVip()` returnează rezultate corecte pentru cazuri-limită.

Greșeli frecvente:
- Validări diferite în constructor față de setteri — păstrează o singură sursă de adevăr apelând setteri din constructor.
- Lipsa `trim()` — numele cu spații duce la formate urâte; normalizează mereu.
 */

public class OOPconceptsEncapsulationProject {

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
            if (n > 1000) n = 1000;
            this.noptiAcumulate = n;
        }

        public void setActiv(boolean a) {
            this.activ = a;
        }

        public boolean isVip() {
            return this.noptiAcumulate >= 50;
        }

        public void afisare() {
            System.out.println("👤 Nume: " + nume + " | 🛏️ Nopți: " + noptiAcumulate + " | 🔓 Activ: " + activ);
            System.out.println("VIP? " + isVip());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CardHotelSecure c = new CardHotelSecure("  ", -10, true);
        c.afisare();
        c.setNume("  Maria ");
        c.setNoptiAcumulate(1200);
        c.afisare();
    }

}
