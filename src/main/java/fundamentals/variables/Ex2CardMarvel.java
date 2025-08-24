package main.java.fundamentals.variables;

/*
2) Exercitiul02_CardMarvel
Obiectiv: Folosești int pentru valori întregi.
Pași:
Fișier/clasă Exercitiul02_CardMarvel.
Declară:
String erou = "Iron Man";
int nivelPutere = 85; // 0..100
int varsta = 48;
Afișează EXACT:
🎬 CARD MARVEL
Erou: Iron Man
Nivel putere: 85/100
Vârsta: 48
Commit: feat: add exercitiul 02 - card Marvel (int)
Greșeli frecvente:
Folosirea ghilimelelor la valori numerice ("85" în loc de 85). Nu o face; int nu folosește ghilimele.
*/

public class Ex2CardMarvel {
    public static void main(String[] args) {
        // Variabile pentru cardul Marvel
        String erou = "Iron Man";
        int nivelPutere = 85;
        int varsta = 48;

        // Afișare informații card
        System.out.println("\uD83C\uDFAC CARD MARVEL");
        System.out.println("Erou: " + erou);
        System.out.println("Nivel putere: " + nivelPutere + "/100");
        System.out.println("Varsta: " + varsta);
    }
}
