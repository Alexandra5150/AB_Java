package main.java.fundamentals.control;

/*

## 14) Exercitiul14_AcumularePuncte

Obiectiv: `for` și sumă incrementală.

Variabile:
- `int puncteZilnice = 12;`
- `int zile = 7;`

Calcule:
- Suma totală pe `zile` zile.

Output:
```
📈 ACUMULARE PUNCTE
Zile: 7, Puncte/zi: 12
Total: 84
```

Clarificare:
- Inițializează suma la 0 înainte de buclă și adaugă în fiecare iterație `puncteZilnice`.

 */


public class Ex14AcumularePuncte {

    public static void main (String[] args) {
        int puncteZilnice = 12;
        int zile = 7;

        System.out.println("\uD83D\uDCC8 ACUMULARE PUNCTE");
        System.out.println("Zile: " + zile + ", Puncte/zi: " + puncteZilnice);

        int total = 0;
        for (int zi = 1; zi <= 7; zi++) {
            total += 12; // 12 puncte/zi
        }

        System.out.println("Total: " + total);

    }


}
