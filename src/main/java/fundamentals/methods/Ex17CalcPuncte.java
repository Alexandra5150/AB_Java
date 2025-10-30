package main.java.fundamentals.methods;

/*

## 17) Exercitiul17_CalcPuncte

Obiectiv: metodă cu return `int`.

Cerințe:
- Scrie `static int calculeazaBonus(int puncte)` astfel:
  - dacă `puncte >= 100` => returnează `20`, altfel `0`.
- În `main`, tipărește: `"Bonus: " + calculeazaBonus(120)` => `Bonus: 20`.

Observație:
- În `if/else`, întoarce direct valori (`return 20;` / `return 0;`) pentru simplitate.

 */

public class Ex17CalcPuncte {

    static int calculeazaBonus(int puncte) {

        if (puncte >= 100){
            return 20;
        } else {
            return 0;
        }

    }

    public static void main (String[] args){

        System.out.println("Bonus: " + calculeazaBonus(120));

    }

}
