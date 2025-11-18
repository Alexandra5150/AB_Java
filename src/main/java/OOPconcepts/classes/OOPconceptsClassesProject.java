package main.java.OOPconcepts.classes;


/*
# 🧱 Proiectel — Registru simplu de carduri (clase și obiecte)

Obiectiv: Creează o aplicație minimă care gestionează 3 carduri de fidelitate pentru o sală de cinema. Doar clase și obiecte (fără moștenire/encapsulare strictă încă).

De ce acest proiect:
- Consolidezi noțiunile introduse la „Clase și Obiecte”: modelare stare + comportament, constructor, metode, mai multe instanțe.

Rezultatul așteptat (comportamental):
- Programul creează 3 carduri, modifică punctele în mod diferit și afișează detaliile fiecăruia în format identic, lizibil.

Cerințe:
1. Clasă `CardCinema` cu câmpuri publice: `String numeClient`, `String filmPreferat`, `int puncte`.
2. Constructor: `CardCinema(String numeClient, String filmPreferat, int puncte)`.
3. Metode:
   - `void adauga(int p)` — crește `puncte` cu `p`
   - `void afisare()` — EXACT:
```
🎬 Client: <numeClient>
🎞️ Film: <filmPreferat>
⭐ Puncte: <puncte>
```

4. În `main`: creează 3 carduri, adaugă puncte diferit fiecăruia, apoi apelează `afisare()` pentru toate.

Pași recomandați (foarte detaliat):
2. În fișier, definește clasa publică cu `public static void main(String[] args)`.
3. În același fișier (deasupra sau sub `main`), definește clasa `CardCinema` conform cerințelor.
4. În `main`, creează 3 obiecte cu constructorul (ex.: Ana/Star Wars/100, Mircea/Inception/80, Mara/Titanic/120).
5. Apelează `adauga(...)` cu valori diferite (ex.: 20, 5, 15) pentru a simula utilizarea.
6. Apelează `afisare()` pentru fiecare obiect, pe linii separate, în ordinea creării.

Acceptance criteria (verificare):
- Câmpurile și semnăturile constructorului/metodelor corespund EXACT.
- Output-ul `afisare()` respectă formatul (emoji, spații, diacritice dacă sunt).
- Nu există cod duplicat pentru afișare (ai o singură metodă `afisare()` care se ocupă de format).

Greșeli frecvente și remedii:
- „Hardcodarea” punctelor noi direct în `afisare()` — mută logica în `adauga(int p)`.
- Instanțiere fără `new` (ex.: doar declarare) — rezultă `NullPointerException` la apelul metodei.
- Amestec de formate la afișare — păstrează un format unic, în metoda clasei.
 */

public class OOPconceptsClassesProject {

    public static class CardCinema {

        public String numeClient;
        public String filmPreferat;
        public int puncte;

        public CardCinema(String numeClient, String filmPreferat, int puncte) {
            this.numeClient = numeClient;
            this.filmPreferat = filmPreferat;
            this.puncte = puncte;
        }

        public void adauga(int p) {
            this.puncte += p;
        }

        public void afisare() {
            System.out.println("\uD83C\uDFAC Client: " + numeClient);
            System.out.println("\uD83C\uDF9E\uFE0F Film: " + filmPreferat);
            System.out.println("⭐ Puncte: " + puncte);
            System.out.println();
        }

    }


    public static void main (String[] args){

        CardCinema c1 = new CardCinema("Ana", "Star Wars", 100);
        CardCinema c2 = new CardCinema("Mircea", "Inception", 80);
        CardCinema c3 = new CardCinema("Mara", "Titanic", 120);

        c1.adauga(20);
        c2.adauga(5);
        c3.adauga(15);

        c1.afisare();
        c2.afisare();
        c3.afisare();

    }

    /*

    REZOLVARE CU ARRAY SI FOR:

        // array cu 3 carduri
        CardCinema[] arr = {
                new CardCinema("Ana", "Star Wars", 100),
                new CardCinema("Mircea", "Inception", 80),
                new CardCinema("Mara", "Titanic", 120)
        };

        // adăugăm puncte diferite fiecărui card
        int[] puncteDeAdaugat = {20, 5, 15};

        for (int i = 0; i < arr.length; i++) {
            arr[i].adauga(puncteDeAdaugat[i]);
        }

        // afișăm fiecare card prin metoda afisare()
        for (CardCinema card : arr) {
            card.afisare();
        }


    SAU VARIANTA CU UN SINGUR "FOR":

        for (int i = 0; i < arr.length; i++) {
        arr[i].adauga(puncteDeAdaugat[i]);
        arr[i].afisare();
        }

     */

}
