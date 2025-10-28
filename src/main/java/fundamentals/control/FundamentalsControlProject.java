package main.java.fundamentals.control;

/*

Cerințe:

1. Fișier/clasă `Proiectel_Control_MeniuCafea` cu `main`.
2. Fără biblioteci externe; input-ul poate fi simulat prin variabile (nu e obligatoriu să citești din consolă).
3. Variabile inițiale:
   - `int puncte = 0;`
   - `String tipCard = "standard"; // standard/vip`
4. Meniu (simulat prin `int optiune = 1;` apoi schimbă la 2, 3 etc. pentru a testa ramurile):
   - 1: "Setează tip card" (`switch` pe `tipCard` pentru mesaj dedicat)
   - 2: "Simulează acumulare 7 zile" (`for` adaugă 10 puncte/zi)
   - 3: "Verifică bonus" (`if` => dacă `puncte >= 50`, afișează "Bonus activat")
   - 4: "Ieșire" (afișează un mesaj și finalizează)

5. Output exemplu (doar idee, nu fix):
```
☕ MENIU CAFENEA
1) Setează tip card
2) Simulează 7 zile
3) Verifică bonus
4) Ieșire
Tip card: vip
-> Tip setat: vip (beneficii extinse)
-> Simulare: +70 puncte (total: 70)
-> Bonus: activat
La revedere!
```

Pași recomandați:
1. Creează fișierul/clasa cu `main` și definește variabilele inițiale.
2. Simulează input-ul prin schimbarea manuală a variabilei `optiune` și rulează programul de mai multe ori, acoperind toate opțiunile.
3. Pentru opțiunea 2, implementează o buclă `for` cu 7 iterații și adună `10` puncte/zi.
4. Pentru opțiunea 3, verifică pragul cu un `if` și afișează mesajul corespunzător.
5. Asigură-te că fiecare ramură afișează mesaje clare, pe linii separate.

Teste recomandate:
- `tipCard=standard` și `vip` pentru a verifica mesajele `switch`.
- `puncte=0` și `puncte>=50` pentru bonus.

 */

public class FundamentalsControlProject {

    public static void main (String[] args) {

        int puncte = 55;
        String tipCard = "standard"; // standard/vip

        System.out.println("☕ MENIU CAFENEA");
        System.out.println("1) Setează tip card");
        System.out.println("2) Simulează 7 zile");
        System.out.println("3) Verifică bonus");
        System.out.println("4) Ieșire");
        System.out.println();

        int optiune = 1; // schimb valoarea manual pentru test (1,2,3,4)

        switch (optiune) {

            case 1:
                // Setez tipul cardului
                tipCard = "vip";
                switch (tipCard) {
                    case "standard":
                        System.out.println("-> Tip setat: standard (fără beneficii suplimentare)");
                        break;
                    case "vip":
                        System.out.println("-> Tip setat: vip (beneficii extinse)");
                        break;
                    default:
                        System.out.println("-> Tip necunoscut!");
                }
                break;

            case 2:
                // Simulez acumularea de puncte timp de 7 zile
                for (int zi = 1; zi <= 7; zi++) {
                    puncte += 10;
                }
                System.out.println("-> Simulare: +70 puncte (total: " + puncte + ")");
                break;

            case 3:
                // Verific dacă bonusul este activ
                if (puncte >= 50) {
                    System.out.println("-> Bonus activat 🎉");
                } else {
                    System.out.println("-> Nu ai suficiente puncte pentru bonus (ai " + puncte + ")");
                }
                break;

            case 4:
                // Iesire din program
                System.out.println("La revedere!");
                break;

            default:
                System.out.println("Opțiune invalidă!");
        }


    }

}
