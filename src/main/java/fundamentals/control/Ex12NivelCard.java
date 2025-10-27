package main.java.fundamentals.control;

/*

## 12) Exercitiul12_NivelCard

Obiectiv: `if / else if / else` pe praguri.

Variabile:
- `int puncte = 740;`

Reguli:
- `< 100` => "Bronze"
- `100..499` => "Silver"
- `500..999` => "Gold"
- `>= 1000` => "Platinum"

Output:

```
🎖️ NIVEL CARD
Puncte: 740
Nivel: Gold
```

Sfaturi:
- Fii atent la intervalele incluse/excluse; nu suprapune intervalele.

 */

public class Ex12NivelCard {

    public static void main(String[] args) {

        int puncte = 740;

        System.out.println("\uD83C\uDF96\uFE0F NIVEL CARD");
        System.out.println("Puncte: " + puncte);

        String nivel;
        if (puncte < 100) {
            nivel = "Bronze";
        } else if (puncte >= 100 && puncte < 499) {
            nivel ="Silver";
        } else if (puncte >= 500 && puncte < 999) {
            nivel = "Gold";
        } else {
            nivel = "Platinum";
        }

        System.out.println("Nivel: " + nivel);
    }


}
