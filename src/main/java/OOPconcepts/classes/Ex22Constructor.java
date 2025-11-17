package main.java.OOPconcepts.classes;

public class Ex22Constructor {

    /*
    ## 22) Exercitiul22_Constructor

Obiectiv: adaugă constructor pentru inițializare rapidă.

Cerințe:
- În `CardHarry`, adaugă constructor: `CardHarry(String nume, String casa, int puncte)` care setează câmpurile.
- În `main`, creează `CardHarry c = new CardHarry("Ron", "Gryffindor", 90);`
- Afișează EXACT: `Ron | Gryffindor | 90p`

Explicații:
- Constructorul îți permite să creezi obiecte într-o singură linie, garantând că toate câmpurile sunt setate de la început.
- Dacă adaugi un constructor cu parametri, constructorul fără argumente implicit NU mai este generat.

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

    }

    public static void main(String[] args) {
        CardHarry c = new CardHarry("Ron", "Gryffindor", 90);

        System.out.println(c.nume + " | " + c.casa + " | " + c.puncte + "p");

    }

}
