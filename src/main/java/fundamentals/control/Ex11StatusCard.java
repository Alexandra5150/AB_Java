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

Commit: `feat: add exercitiul 11 - status card (if/else)`

Observații:
- Verifică mai întâi condiția de „activ și zile>0”. Dacă alternezi ordinea, păstrează logica echivalentă.
*/


public class Ex11StatusCard {
    public static void main(String[] args) {
        boolean activ = false;
        int zileRamase = 15;
        if (activ == true && zileRamase > 0) {
            System.out.println("Activ");
        } else {
            System.out.println("Expirat");
        }
    }
}
