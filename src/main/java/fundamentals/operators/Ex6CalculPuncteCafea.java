package main.java.fundamentals.operators;

/*
6) Exercitiul06_CalculPuncteCafea
Obiectiv: aritmetică și +=.

Variabile:
String numeClient = "Ana";
int puncteInitiale = 12;
int puncteAdaugateAstazi = 5;
double valoarePunct = 0.3;

Calcule:
int puncteTotale = puncteInitiale;
puncteTotale += puncteAdaugateAstazi;
double valoare = puncteTotale * valoarePunct;
Output exact:

👤 Client: Ana
⭐ Puncte inițiale: 12
➕ Puncte adăugate azi: 5
✅ Puncte totale: 17
💰 Valoare totală: 5.1 lei

Explicația operațiilor:
+= actualizează variabila la fața locului; evită duplicarea variabilelor temporare.
 */

public class Ex6CalculPuncteCafea {

    public static void main (String[] args) {
        String numeClient = "Ana";
        int puncteInitiale = 12;
        int puncteAdaugateAstazi = 5;
        double valoarePunct = 0.3;

        int puncteTotale = puncteInitiale;
        puncteTotale += puncteAdaugateAstazi;
        double valoare = puncteTotale * valoarePunct;

        System.out.println("\uD83D\uDC64 Client: " + numeClient);
        System.out.println("⭐ Puncte inițiale: " + puncteInitiale);
        System.out.println("➕ Puncte adăugate azi: " + puncteAdaugateAstazi);
        System.out.println("✅ Puncte totale: " + puncteTotale);
        System.out.println("\uD83D\uDCB0 Valoare totală: " + valoare + " lei");
    }
}
