package main.java.OOPconcepts.inheritance;

/*
## 34) Exercitiul34_SuperConstructor

Obiectiv: constructor copil care apelează `super`.

Cerințe:
- În `CardFidelitate`, adaugă constructor `CardFidelitate(int puncte)`.
- În `CardCinema`, adaugă constructor `CardCinema(String cinema, int puncte)` care apelează `super(puncte)`.
- În `main`, creează `new CardCinema("IMAX", 200)` și printează `Puncte: 200`.

Pitfall:
- Dacă baza nu are constructor fără argumente, e obligatoriu să chemi `super(puncte)` în primul rând din constructorul copilului.
 */

public class Ex34SuperConstructor {

//    private String cinema;
//
//    public Ex34SuperConstructor(String cinema, int puncte) {
//        super(puncte);
//        this.cinema = cinema;
//    }
//
//    public static void main(String[] args) {
//
//        Ex34SuperConstructor c = new Ex34SuperConstructor("Movieplex", 200);
//
//        System.out.println("Puncte: " + c.getPuncte());
//    }

}
