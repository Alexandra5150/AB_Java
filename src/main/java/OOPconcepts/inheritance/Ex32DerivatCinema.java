package main.java.OOPconcepts.inheritance;


/*
## 32) Exercitiul32_DerivatCinema

Obiectiv: subclasă cu câmp specific.

Cerințe:
- `class CardCinema extends CardFidelitate` cu câmp `String cinema;`
- Constructor: `CardCinema(String cinema)`; metodă `void afisare()` care printează EXACT:
```
🎬 Cinema: <cinema> | Puncte: <puncte>
```
- În `main`, `adauga(120)` și `afisare()`.

Observație:
- Câmpul `puncte` este accesibil direct în subclasă fiind `protected`; alternativ poți oferi getter/setter în bază.

 */


public class Ex32DerivatCinema extends Ex31BazaCard {

    String cinema;
    Ex32DerivatCinema(String cinema) {
        this.cinema = cinema;
    }

    public void afisare(){
        System.out.println("\uD83C\uDFAC Cinema: " + cinema + " | Puncte: " + puncte);
    }


    public static void main (String[] args){
        Ex32DerivatCinema cardDerivat = new Ex32DerivatCinema("Movieplex");
        cardDerivat.adauga(120);
        cardDerivat.afisare();
    }


}
