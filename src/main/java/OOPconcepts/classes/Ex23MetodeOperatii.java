package main.java.OOPconcepts.classes;

public class Ex23MetodeOperatii {

    /*
    ## 23) Exercitiul23_MetodeOperatii

Obiectiv: adaugă metode care modifică starea.

Cerințe:
- În `CardHarry`, adaugă:
  - `void adaugaPuncte(int p)` => crește `puncte` cu `p`
  - `void scadePuncte(int p)` => scade `puncte` cu `p`
- În `main`, pornește de la `CardHarry("Hermione","Gryffindor",100)` și aplică: `adaugaPuncte(30)`, `scadePuncte(10)`.
- Afișează: `Hermione | Gryffindor | 120p`

Capcane:
- Nu seta `puncte` direct în `main` pentru a simula operațiile; logica de modificare trebuie să fie în metodele clasei.
- Evită valori magice: transmite parametrul `p` din `main`, nu scrie `puncte += 20;` direct în metodă.
     */

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

    }

    public static void main(String[] args) {

        CardHarry h = new CardHarry("Hermione", "Gryffindor", 100);
        h.adaugaPuncte(30);
        h.scadePuncte(10);
        System.out.println(h.nume + " | " + h.casa + " | " + h.puncte + "p");
    }

}
