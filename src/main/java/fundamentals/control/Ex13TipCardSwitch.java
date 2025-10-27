package main.java.fundamentals.control;

/*

## 13) Exercitiul13_TipCardSwitch

Obiectiv: `switch` pe `String`.

Variabile:
- `String tip = "hotel";`

Reguli (mesaj):
- `cinema` => "Beneficiu: reducere popcorn"
- `hotel` => "Beneficiu: late checkout"
- `retail` => "Beneficiu: voucher magazin"
- altfel => "Beneficiu: standard"

Output:
```
🎫 TIP CARD
hotel
Beneficiu: late checkout
```

Pitfall:
- Uitarea `break` duce la „fall-through” și mesaje duble; adaugă `break` la fiecare `case`.

 */


public class Ex13TipCardSwitch {

    public static void main (String[] args) {

        String tip = "hotel";

        System.out.println("\uD83C\uDFAB TIP CARD");
        System.out.println(tip);

        String beneficiu;
        switch (tip) {
            case "cinema":
                beneficiu = "Beneficiu: reducere popcorn";
                break;
            case "hotel":
                beneficiu = "Beneficiu: late checkout";
                break;
            case "retail":
                beneficiu = "Beneficiu: voucher magazin";
                break;
            default:
                beneficiu = "Beneficiu: standard";
        }

        System.out.println(beneficiu);
    }

}
