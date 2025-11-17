package main.java.OOPconcepts.classes;

public class Ex21ClasaCardHarry {

    /*
    ## 21) Exercitiul21_ClasaCardHarry

Obiectiv: definește o clasă cu 3 câmpuri și creează 2 obiecte.

Cerințe:
- Clasă `CardHarry` cu câmpurile `String nume`, `String casa`, `int puncte` (toate `public` la acest exercițiu pentru simplitate).
- În `main`, creează:
  - `CardHarry c1 = new CardHarry();` apoi setează: `c1.nume = "Harry"; c1.casa = "Gryffindor"; c1.puncte = 150;`
  - `CardHarry c2 = new CardHarry();` cu valori proprii.

- Afișează EXACT:
```
Card1 -> Harry | Gryffindor | 150p
Card2 -> <nume> | <casa> | <puncte>p
```

De ce acest exercițiu:
- Înțelegi diferența dintre tipuri primitive și tipuri de referință (obiecte) și vezi cum se instanțiază cu `new`.

Greșeli frecvente:
- A uita să folosești `new` la creare -> variabila rămâne `null` și apare `NullPointerException` la acces.
- A confunda numele câmpurilor (ex.: `house` în loc de `casa`). Respectă exact cerința.

     */


    public static class CardHarry {
        public String nume;
        public String casa;
        public int puncte;
    }

    public static void main(String[] args) {
        CardHarry c1 = new CardHarry();
        c1.nume = "Harry";
        c1.casa = "Gryffindor";
        c1.puncte = 150;

        CardHarry c2 = new CardHarry();
        c2.nume = "Ana";
        c2.casa = "Ionescu";
        c2.puncte = 100;

        System.out.println("Card1 -> " + c1.nume + " | " + c1.casa + " | " + c1.puncte + "p");
        System.out.println("Card2 -> " + c2.nume + " | " + c2.casa + " | " + c2.puncte + "p");

    }


}
