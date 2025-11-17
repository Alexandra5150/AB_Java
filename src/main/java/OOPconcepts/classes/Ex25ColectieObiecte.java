package main.java.OOPconcepts.classes;

public class Ex25ColectieObiecte {

    /*
    ## 25) Exercitiul25_ColecțieObiecte

Obiectiv: lucrează cu un array de obiecte și o buclă simplă de afișare.

Cerințe:
- Creează un array `CardHarry[] arr = new CardHarry[3];` cu 3 instanțe inițializate prin constructor.
- Parcurge cu `for` și printează pentru fiecare: `<nume> - <puncte>p` (o linie per obiect).

De ce e util:
- Vezi cum se folosesc colecțiile de obiecte și cum se accesează câmpurile fiecărei instanțe într-o buclă.
- Atenție la `NullPointerException`: asigură-te că fiecare element din array e instanțiat prin constructor înainte de a-l folosi.

     */


    public static class CardHarry {
        public String nume;
        public int puncte;

        public CardHarry(String nume, int puncte) {
            this.nume = nume;
            this.puncte = puncte;
        }
    }

    public static void main(String[] args) {
        CardHarry[] arr = new CardHarry[] {
                new CardHarry("Harry", 150),
                new CardHarry("Ron", 90),
                new CardHarry("Hermione", 120)
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].nume + " - " + arr[i].puncte + "p");
        }
    }

}
