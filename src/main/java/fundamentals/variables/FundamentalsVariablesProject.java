package main.java.fundamentals.variables;

/*
Cerințe:
Fișier/clasă Proiectel_Variabile_Smoothie cu main.
Declară variabilele exact:
String numeClient (ex.: "Alex Pop")
String cardId (ex.: "SM-2024-001")
String produs1, double pret1, int cant1
String produs2, double pret2, int cant2
double valoarePunct = 0.5; // lei/punct

Calcule:
double subtotal = pret1 * cant1 + pret2 * cant2;
int puncteCastigate = (int) (subtotal / 10); // 1p la 10 lei
double valoarePuncte = puncteCastigate * valoarePunct;

Afișează EXACT (exemplu de format; valorile pot varia):
🥤 SMOOTHIE BAR — CHITANȚĂ
Client: Alex Pop | Card: SM-2024-001
-----------------------------------
1) Mango Boost x2 @ 14.50 = 29.00
2) Berry Mix  x1 @ 16.00 = 16.00
-----------------------------------
Subtotal: 45.00 lei
Puncte: 4 (valoare: 2.00 lei)
Mulțumim și poftă bună!

Pași recomandați:
Creează fișierul/clasa cu main.
Declară variabilele în ordinea din cerință, cu valori de test.
Calculează subtotalul, punctele și valoarea punctelor exact în variabile separate (nu face calcule direct în println).
Folosește System.out.printf pentru sume la 2 zecimale (mai lizibil și precis pentru chitanțe).
Afișează liniile EXACT ca în exemplu; verifică alinierea vizuală.

Verificări:
Subtotalul să reflecte cantitate x preț pentru fiecare produs.
Punctele sunt întregi (casting explicit la int).
Formatul liniilor respectă spațiile dintre elemente.
 */

public class FundamentalsVariablesProject {
    public static void main (String[] args){
        String numeClient = "Alex Pop";
        String cardId = "SM-2024-001";
        String produs1 = "Mango Boost";
        double pret1 = 14.50;
        int cant1 = 2;
        String produs2 = "Berry Mix";
        double pret2 = 16.00;
        int cant2 = 1;
        double valoarePunct = 0.5; // lei/punct

        double subtotalProdus1 = (pret1 * cant1);
        double subtotalProdus2 = (pret2 * cant2);
        double subtotal = (pret1 * cant1) + (pret2 * cant2);
        int puncteCastigate = (int) (subtotal / 10); // 1p la 10 lei
        double valoarePuncte = puncteCastigate * valoarePunct;

        /*
        Format placeholders:
        %s – string
        %d – integer
        %.2f – floating point number with 2 decimals
        %n – newline (platform-independent)
         */

        System.out.println("\uD83E\uDD64 SMOOTHIE BAR — CHITANȚĂ");
        System.out.println("Client: " + numeClient + " | " + "Card: " + cardId);
        System.out.println("-----------------------------------");
//        System.out.println("1) " + produs1 + " x" + cant1 + " @ " + pret1 + " = " + subtotalProdus1);
        System.out.printf("1) %s x%d @ %.2f = %.2f%n", produs1, cant1, pret1, subtotalProdus1);
//        System.out.println("1) " + produs2 + " x" + cant2 + " @ " + pret2 + " = " + subtotalProdus2);
        System.out.printf("2) %s x%d @ %.2f = %.2f%n", produs2, cant2, pret2, subtotalProdus2);
        System.out.println("-----------------------------------");
//        System.out.println("Subtotal: " + subtotal);
        System.out.printf("Subtotal: %.2f lei%n", subtotal);
//        System.out.println("Puncte: " + puncteCastigate + " (valoare: " + valoarePuncte +" lei)");
        System.out.printf("Puncte: %d (valoare: %.2f lei)%n", puncteCastigate, valoarePuncte);
        System.out.println("Mulțumim și poftă bună!");
    }
}
