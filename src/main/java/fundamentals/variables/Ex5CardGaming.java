package main.java.fundamentals.variables;

/*
5) Exercitiul05_CardGaming
Obiectiv: combină tipuri (String, int, double, boolean).
Pași:
Fișier/clasă Exercitiul05_CardGaming.
Declară:
String gamer = "ShadowFox";
int nivel = 27;
double xp = 812.75;
boolean premium = true;
Afișează EXACT:
🕹️ CARD GAMING
Gamer: ShadowFox
Nivel: 27
XP: 812.75
Premium: true
Commit: feat: add exercitiul 05 - card gaming (mix tipuri)
Pitfall:
Amestecarea tipurilor în calcule poate duce la conversii implicite. Când ai nevoie de fracții, asigură-te că folosești double (nu doar int).
 */

public class Ex5CardGaming {
    public static void main (String[] args){
        String gamer = "ShadowFox";
        int nivel = 27;
        double xp = 812.75;
        boolean premium = true;

        System.out.println("\uD83D\uDD79\uFE0F CARD GAMING");
        System.out.println("Gamer: " + gamer);
        System.out.println("Nivel: " + nivel);
        System.out.println("XP: " + xp);
        System.out.println("Premium: " + premium);
    }
}
