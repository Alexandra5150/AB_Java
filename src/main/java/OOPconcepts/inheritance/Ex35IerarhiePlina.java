package main.java.OOPconcepts.inheritance;

/*
## 35) Exercitiul35_IerarhiePlina

Obiectiv: adaugă încă 2 subtipuri și afișează-le.

Cerințe:
- Creează `CardHotel extends CardFidelitate` (câmp `String hotel`), `CardRetail extends CardFidelitate` (câmp `String magazin`).
- Fiecare cu `afisare()` în format:
```
🏨 Hotel: <hotel> | Puncte: <puncte>
🛍️ Magazin: <magazin> | Puncte: <puncte>
```
- În `main`, creează câte un obiect din fiecare, setează puncte și afișează toate.

Tips:
- Ține metodele comune în bază. Specificul (hotel/cinema/retail) doar în subclase.
 */

public class Ex35IerarhiePlina extends Ex31BazaCard{

    String hotel;

    Ex35IerarhiePlina(String hotel) {
        this.hotel = hotel;
    }

    public void afisare(){
        System.out.println("\uD83C\uDFE8 Hotel: " + hotel + " | Puncte: " + puncte);
    }


    public static void main (String[] args){
        Ex35IerarhiePlina cardHotel = new Ex35IerarhiePlina("Hilton");
        cardHotel.adauga(100);
        cardHotel.afisare();
    }

}
