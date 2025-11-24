package main.java.OOPconcepts.inheritance;

/*
## 33) Exercitiul33_OverrideAfisare

Obiectiv: `@Override` pentru comportament specific copilului.

Cerințe:
- În `CardFidelitate`, adaugă `public String descriere()` => `"card generic"`.
- În `CardCinema`, suprascrie `public String descriere()` => `"card cinema: " + cinema`.
- În `main`, afișează EXACT:
```
card generic
card cinema: <cinema>
```
Explicație:
- Suprascrierea permite fiecărei subclase să aibă comportament specific păstrând aceeași interfață publică.

 */

public class Ex33OverrideAfisare extends Ex31BazaCard{

    String cinema;

    Ex33OverrideAfisare(String cinema) {
        this.cinema = cinema;
    }

    @Override
    public String descriere() {
        return "card cinema: " + cinema;
    }


    public static void main (String[] args){

        Ex31BazaCard cardBaza = new Ex31BazaCard();
        System.out.println(cardBaza.descriere());

        Ex33OverrideAfisare cardDerivat = new Ex33OverrideAfisare("Movieplex");
        System.out.println(cardDerivat.descriere());
    }


}
