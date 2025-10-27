package main.java.fundamentals.control;

/*

## 11) Exercitiul11_StatusCard

Obiectiv: `if/else` simplu.

Variabile:
- `boolean activ = true;`
- `int zileRamase = 12;`

Reguli:
- Dacă `activ == true` și `zileRamase > 0` => "Activ".
- Altfel, "Expirat".

Output exact (cu valorile de mai sus):

📇 STATUS CARD
Activ: true, Zile ramase: 12
Rezultat: Activ

Observații:
- Verifică mai întâi condiția de „activ și zile>0”. Dacă alternezi ordinea, păstrează logica echivalentă.
*/


public class Ex11StatusCard {
    public static void main(String[] args) {
        boolean activ = true;
        int zileRamase = 12;

        System.out.println("📇 STATUS CARD");
        System.out.println("Activ: " + activ + ", Zile ramase: " + zileRamase);

        String rezultat;
        if (activ == true && zileRamase > 0) {
            rezultat = "Activ";
        } else {
            rezultat = "Expirat";
        }

        System.out.println("Rezultat: " + rezultat);
    }
}
