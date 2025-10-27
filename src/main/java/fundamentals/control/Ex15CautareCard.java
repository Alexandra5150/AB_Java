package main.java.fundamentals.control;


/*

## 15) Exercitiul15_CautareCard

Obiectiv: `while` + `break`.

Date:
- `boolean[] active = {false, false, true, false};`

Sarcină:
- Găsește indexul primului `true` și oprește imediat căutarea.

Output:
```
🔍 CAUTARE CARD
Primul activ la index: 2
```

 */

public class Ex15CautareCard {

    public static void main (String[] args) {

        boolean[] active = {false, false, true, false};
        int i = 0;

        System.out.println("\uD83D\uDD0D CAUTARE CARD");

        while (i < active.length && !active[i]) {
            i++;
        }

        System.out.println("Primul activ la index: " + i);

    }


}
