package main.java.fundamentals.methods;

/*

## 16) Exercitiul16_PrintCard

Obiectiv: metodă `void` pentru afișare formatată.

Cerințe:
- Scrie metoda `static void printCard(String nume, int puncte)`.
- Afișează EXACT:

```
👤 Nume: <nume>
⭐ Puncte: <puncte>
```

- În `main`, apelează `printCard("Ana", 120)`.

De ce:
- Separi logica de afișare într-o funcție reutilizabilă; eviți duplicarea în `main`.

 */

public class Ex16PrintCard {

    // Metoda care afișează cardul
    static void printCard(String nume, int puncte) {
        System.out.println("👤 Nume: " + nume);
        System.out.println("⭐ Puncte: " + puncte);
    }

    public static void main(String[] args) {
        // Apelul metodei
        printCard("Ana", 120);
    }


//    VARIANTA MEA LUNGA...
//
//    public static String nume;
//    public static int puncte;
//
//
//    static String printCard(String nume) {
//        return nume;
//    };
//
//    static int printCard(int puncte) {
//        return puncte;
//    };
//
//
//    public static void main (String[] args) {
//
//        System.out.print("\uD83D\uDC64 Nume: ");
//        System.out.println(printCard("Ana"));
//
//        System.out.print("⭐ Puncte: ");
//        System.out.println(printCard(120));
//
//    }


}
