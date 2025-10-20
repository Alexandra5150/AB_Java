package main.java.fundamentals.operators;

/*
## 9) Exercitiul09_UpgradeNivel

Obiectiv: `++`, `+=`, `-=`.

Variabile:

- `String nume = "GamerX";`
- `int nivel = 4;`
- `int xp = 890;`
- `int pragNivel = 900;`
- `int xpZilnic = 75;`

Reguli: dacă `xp >= pragNivel` => `nivel++` și `xp -= pragNivel`; apoi `xp += xpZilnic`.

Output (cu datele date):

```
🎮 Jucator: GamerX
Nivel initial: 4, XP initial: 890
Dupa procesare -> Nivel: 4, XP: 965
```

Commit: `feat: add exercitiul 09 - upgrade nivel (++/--, atribuire compusa)`

Verifică:

- Pentru datele din cerință NU se atinge pragul și `nivel` rămâne 4; ajustează datele și testează și cazul în care se face upgrade.

 */


public class Ex9UpgradeNivel {

    public static void main (String[] args){
        String nume = "GamerX";
        int nivel = 4;
        int xp = 890;
        int pragNivel = 900;
        int xpZilnic = 75;

        if (xp >= pragNivel) {
            nivel++;
            xp -= pragNivel;
        }

        xp += xpZilnic;



        System.out.println("```");
        System.out.println("\uD83C\uDFAE Jucator: " + nume + ", ");
        System.out.println("Nivel initial: " + nivel + ", " + "XP initial: " + xp);
        System.out.println("Dupa procesare -> Nivel: " + nivel + ", " + "XP: " + xp);
        System.out.println("```");
    }

}
