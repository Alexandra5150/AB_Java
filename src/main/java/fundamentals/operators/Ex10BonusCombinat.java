package main.java.fundamentals.operators;

/*

## 10) Exercitiul10_BonusCombinat

Obiectiv: mix de operatori + ternar.

Variabile:

- `String tipCard = "cinema";`
- `int puncte = 320;`
- `boolean activ = true;`
- `int pragBonus = 300;`

Calcule:

- `int bonusBaza = (puncte >= pragBonus) ? 50 : 0;`
- `int bonusTip = ("cinema".equals(tipCard) ? 20 : ("hotel".equals(tipCard) ? 30 : 10));`
- `int bonusFinal = (activ && puncte >= pragBonus) ? (bonusBaza + bonusTip) : 0;`

Output:

```
Tip: cinema, Activ: true, Puncte: 320
Bonus baza: 50, Bonus tip: 20
🎁 Bonus final: 70
```

Commit: `feat: add exercitiul 10 - bonus combinat (mix + ternar)`

Clarificare:

- Folosește `"cinema".equals(tipCard)` pentru a evita `NullPointerException` dacă `tipCard` ar fi `null`.


*/


public class Ex10BonusCombinat {

    public static void main (String[] args){
        String tipCard = "cinema";
        int puncte = 320;
        boolean activ = true;
        int pragBonus = 300;

        //expresie ternara, if scris pe scurt
//        Dacă puncte >= pragBonus → bonusBaza = 50
//        Altfel → bonusBaza = 0
        int bonusBaza = (puncte >= pragBonus) ? 50 : 0;
        int bonusTip = ("cinema".equals(tipCard) ? 20 : ("hotel".equals(tipCard) ? 30 : 10));
        int bonusFinal = (activ && puncte >= pragBonus) ? (bonusBaza + bonusTip) : 0;


        System.out.println("```");
        System.out.println("Tip: " + tipCard + ", Activ: " + activ + ", Puncte: " + puncte);
        System.out.println("Bonus baza: " + bonusBaza + " Bonus tip: " + bonusTip);
        System.out.println("\uD83C\uDF81 Bonus final: " + bonusFinal);
        System.out.println("```");
    }


    /*
            //IF:

            // 1️⃣ Calculăm bonusul de bază
            if (puncte >= pragBonus) {
                bonusBaza = 50;
            } else {
                bonusBaza = 0;
            }

            // 2️⃣ Calculăm bonusul în funcție de tipul cardului
            if ("cinema".equals(tipCard)) {
                bonusTip = 20;
            } else if ("hotel".equals(tipCard)) {
                bonusTip = 30;
            } else {
                bonusTip = 10;
            }

            // 3️⃣ Calculăm bonusul final
            if (activ && puncte >= pragBonus) {
                bonusFinal = bonusBaza + bonusTip;
            } else {
                bonusFinal = 0;
            }



            //SWITCH:

            // 1️⃣ Bonusul de bază
            if (puncte >= pragBonus) {
                bonusBaza = 50;
            } else {
                bonusBaza = 0;
            }

            // 2️⃣ Bonusul în funcție de tipul cardului
            // Folosim switch pentru claritate
            switch (tipCard) {
                case "cinema":
                    bonusTip = 20;
                    break;
                case "hotel":
                    bonusTip = 30;
                    break;
                default:
                    bonusTip = 10;
                    break;
            }

            // 3️⃣ Bonusul final — doar dacă e activ și are suficiente puncte
            if (activ && puncte >= pragBonus) {
                bonusFinal = bonusBaza + bonusTip;
            } else {
                bonusFinal = 0;
            }

*/


}

