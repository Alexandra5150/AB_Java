package main.java.OOPconcepts.inheritance;

/*
## 31) Exercitiul31_BazaCard

Obiectiv: creează clasa de bază pentru ierarhie.

Cerințe:
- Clasă `CardFidelitate` cu câmp `protected int puncte;`
- Metode: `public void adauga(int p)`, `public void scade(int p)`.
- În `main`, demonstrează: pornește de la 0, adaugă 50, scade 20; afișează EXACT:
```
Puncte: 30
```
De ce:
- Creezi un punct comun pentru comportamente partajate (adauga/scade); subclasele moștenesc această logică.
 */

public class Ex31BazaCard {

    protected int puncte;

    public String descriere() {
        return "card generic";
    }

//    public Ex31BazaCard(int puncte) {
//        this.puncte = puncte;
//    }
//
//    public int getPuncte() {
//        return puncte;
//    }

    public void adauga(int p) {
            puncte += p;
        }

    public void scade(int p) {
            puncte -= p;
        }


    public static void main (String[] args){

        Ex31BazaCard card = new Ex31BazaCard();
        card.puncte = 0;
        card.adauga(50);
        card.scade(20);

        System.out.println("Puncte: " + card.puncte);
    }

}
