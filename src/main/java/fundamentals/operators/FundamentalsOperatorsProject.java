package main.java.fundamentals.operators;

/*

Obiectiv: Construiește un mini-program care calculează prețul final al biletelor la un festival în funcție de puncte, tipul biletului și starea cardului.

Cerințe:

2. Variabile:
   - `String numeClient` (ex. "Radu Ionescu")
   - `String tipBilet` (valori: "standard", "vip", "student")
   - `double pretBaza` (ex. 200.0)
   - `int puncte` (ex. 180)
   - `boolean activ` (ex. true)

3. Reguli de discount (folosește operatori, fără `switch` sau colecții):
   - Dacă `!activ` => discount final = 0.
   - Altfel, `discountPuncte` = `puncte >= 200 ? 0.15 : (puncte >= 100 ? 0.1 : 0.0)`
   - `discountTip`:
     - `vip` => 0.2
     - `student` => 0.1
     - altfel => 0.0
   - `discountFinal` = `discountPuncte + discountTip`, plafonat la maxim 0.4.
   - `pretFinal = pretBaza * (1 - discountFinal)`.

4. Output exact (exemplu):

```
🎟️ FESTIVAL — CALCUL BILET
Client: Radu Ionescu | Tip: vip | Activ: true
Puncte: 180 | Discount puncte: 0.10 | Discount tip: 0.20
Discount final: 0.30
Preț final: 140.00 lei
```

Pași recomandați:

1. Declară variabilele cu valori de test (inclusiv pentru fiecare tip de bilet).
2. Calculează `discountPuncte` cu operatorul ternar imbricat exact ca în cerință.
3. Calculează `discountTip` folosind expresii condiționale pe `tipBilet` (cu `"vip".equals(tipBilet)` etc.).
4. Adună și plafonează: dacă `discountFinal > 0.4`, setează-l la `0.4`.
5. Calculează `pretFinal` și formatează cu 2 zecimale.
6. Afișează blocul de rezultate EXACT ca în exemplu (poți schimba numele clientului/valorile).

Teste recomandate (boundary):

- `activ=false` => discount 0 indiferent de restul variabilelor.
- `puncte=99, 100, 200` pentru a verifica tranzițiile de prag.
- `tipBilet=standard/vip/student` pentru a verifica `discountTip`.

 */


public class FundamentalsOperatorsProject {

    public static void main (String[] args) {

        String numeClient = "Radu Ionescu";
        String tipBilet = "vip"; //(valori: "standard", "vip", "student")
        double pretBaza = 200.0;
        int puncte = 180;
        boolean activ = true;

        double discountPuncte = (!activ) ? 0 : (puncte >= 200 ? 0.15 : (puncte >= 100 ? 0.1 : 0.0));
        double discountTip = ("vip".equals(tipBilet)) ? 0.2 : (("student".equals(tipBilet)) ? 0.1 : 0.0);
        double discountFinal = (discountPuncte + discountTip) > 0.4 ? 0.4 : (discountPuncte + discountTip);
        double pretFinal = pretBaza * (1 - discountFinal);

        // Rotunjire efectivă la 2 zecimale
        discountPuncte = Math.round(discountPuncte * 100.0) / 100.0;
        discountTip = Math.round(discountTip * 100.0) / 100.0;
        discountFinal = Math.round(discountFinal * 100.0) / 100.0;
        pretFinal = Math.round(pretFinal * 100.0) / 100.0;

        System.out.println("```");
        System.out.println("\uD83C\uDF9F\uFE0F FESTIVAL — CALCUL BILET");
        System.out.println("Client: " + numeClient + " | Tip: " + tipBilet + " | Activ: " + activ);
        System.out.println("Puncte: " + puncte + " | Discount puncte: " + discountPuncte + " | Discount tip: " + discountTip);
        System.out.println("Discount final: " + discountFinal);
        System.out.println("Preț final: " + pretFinal + " lei");
        System.out.println("```");

    }

}
