package main.java.OOPconcepts.classes;

    /*
    ## 24) Exercitiul24_Afisare

Obiectiv: metodă de afișare formatată.

Cerințe:

- În `CardHarry`, adaugă `void afisare()` care printează EXACT:
```
👤 Nume: <nume>
🏰 Casa: <casa>
⭐ Puncte: <puncte>
```

- În `main`, apelează `afisare()` pe un obiect.

Tips & Tricks:
- Poți folosi `System.out.println("👤 Nume: " + nume);` etc. pentru lizibilitate.
- Dacă vrei reutilizare, extrage formatarea într-o metodă `toString()` și apelează `System.out.println(toString());` în `afisare()`.

     */


public class Ex24Afisare {

    public static class CardHarry {
        public String nume;
        public String casa;
        public int puncte;

        public CardHarry(String nume, String casa, int puncte) {
            this.nume = nume;
            this.casa = casa;
            this.puncte = puncte;
        }

        public void adaugaPuncte(int p) {
            this.puncte += p;
        }

        public void scadePuncte(int p) {
            this.puncte -= p;
        }

        public void afisare() {
            System.out.println("👤 Nume: " + nume);
            System.out.println("🏰 Casa: " + casa);
            System.out.println("⭐ Puncte: " + puncte);
        }
    }

    public static void main(String[] args) {

        CardHarry h = new CardHarry("Hermione", "Gryffindor", 100);
        h.adaugaPuncte(30);
        h.scadePuncte(10);
        h.afisare();
    }

}
