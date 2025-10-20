package main.java.fundamentals.operators;

/*
8) Exercitiul08_ValidariCard

Obiectiv: logici `&&`, `>=`, short-circuit.

Variabile:
- `boolean cardActiv = true;`
- `int puncte = 95;`
- `int pragBonus = 100;`
- `boolean areEmailConfirmat = false;`

Calcule: `boolean eligibil = cardActiv && areEmailConfirmat && (puncte >= pragBonus);`

Output exact:

```
Activ: true, Email confirmat: false, Puncte: 95/100
🎁 Bonus eligibil? false
```

De ce short-circuit:
- Dacă `cardActiv` este `false`, expresia se oprește și nu evaluează `puncte >= pragBonus`, ceea ce poate evita calcule inutile.

 */


public class Ex8ValidariCard {

    public static void main (String[] args){
        boolean cardActiv = true;
        int puncte = 95;
        int pragBonus = 100;
        boolean areEmailConfirmat = false;

        boolean eligibil = cardActiv && areEmailConfirmat && (puncte >= pragBonus);

        System.out.println("```");
        System.out.print("Activ: " + cardActiv + ", ");
        System.out.print("Email confirmat: " + areEmailConfirmat + ", ");
        System.out.println("Puncte: " + puncte + "/" + pragBonus);
        System.out.println("🎁 Bonus eligibil? " + eligibil);
        System.out.println("```");
    }

}

