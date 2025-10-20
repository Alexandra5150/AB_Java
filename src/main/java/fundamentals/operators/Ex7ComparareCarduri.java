package main.java.fundamentals.operators;

/*
7) Exercitiul07_ComparareCarduri
Obiectiv: comparații > și ==.

Variabile:
String cardA = "Card Marvel";
String cardB = "Card Netflix";
int puncteA = 120;
int puncteB = 150;

Calcule:
boolean aAreMaiMult = puncteA > puncteB;
boolean egale = puncteA == puncteB;

Output exact:
🔸 Card A: Card Marvel (120p)
🔹 Card B: Card Netflix (150p)
A are mai mult? false
Au puncte egale? false
Card cu mai multe puncte: Card Netflix

Pitfall:
Nu compara String cu == pentru egalitate de conținut; aici comparăm doar int-urile. Pentru String, folosește equals.
 */

public class Ex7ComparareCarduri {

    public static void main (String[] args){
        String cardA = "Card Marvel";
        String cardB = "Card Netflix";
        int puncteA = 120;
        int puncteB = 150;

        boolean aAreMaiMult = puncteA > puncteB;
        boolean egale = puncteA == puncteB;

        System.out.println("\uD83D\uDD38 Card A: Card Marvel (" + puncteA + "p)");
        System.out.println("\uD83D\uDD39 Card B: Card Netflix (" + puncteB + "p)");
        System.out.println("A are mai mult? " + aAreMaiMult);
        System.out.println("Au puncte egale? " + egale);
        System.out.println("Card cu mai multe puncte: " + cardB );
    }

}
