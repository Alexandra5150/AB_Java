package main.java.OOPconcepts.encapsulation;

/*
## 30) Exercitiul30_DefensiveCopy

Obiectiv: Protejează câmpurile mutabile (liste) prin copii defensive la intrare și ieșire.

Cerințe:
- Clasa `CardCafeneaPerks` cu câmpuri `private final String nume; private final java.util.List<String> beneficii;`.
- Constructorul face copie la intrare: dacă lista e `null` -> listă goală; altfel `new ArrayList<>(lista)`.
- Getterul `getBeneficii()` întoarce o copie imuabilă: `Collections.unmodifiableList(new ArrayList<>(beneficii))`.
- Demonstrează în `main` că modificările asupra listei originale sau asupra celei returnate nu afectează starea internă.

Pitfall de evitat:
- A returna lista internă direct -> permite modificări externe și rupe încapsularea.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex30DefensiveCopy {

    public static class CardCafeneaPerks {
        private final String nume;
        private final List<String> beneficii; // listă internă protejată

        public CardCafeneaPerks(String nume, List<String> beneficii) {
            this.nume = (nume == null || nume.trim().isEmpty()) ? "Anonim" : nume.trim();
            // Copie la intrare
            this.beneficii = new ArrayList<>(beneficii == null ? List.of() : beneficii);
        }

        public String getNume() { return nume; }

        public List<String> getBeneficii() {
            // Copie imuabilă la ieșire
            return Collections.unmodifiableList(new ArrayList<>(beneficii));
        }
    }

    public static void main(String[] args) {
        List<String> initial = new ArrayList<>();
        initial.add("1x cafea gratis");
        CardCafeneaPerks c = new CardCafeneaPerks("Ana", initial);

        // Modific lista originală — obiectul rămâne protejat
        initial.add("10% reducere");

        // Încerc să modific lista returnată — aruncă excepție dacă încercăm să facem add
        List<String> laExterior = c.getBeneficii();
        System.out.println(laExterior); // [1x cafea gratis]
    }

}
