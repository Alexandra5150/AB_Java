package main.java.fundamentals.methods;

import java.util.ArrayList;

public class Ex16PrintCardExtinsFor {

    static class Jucator {
        String nume;
        int puncte;

        Jucator(String nume, int puncte) {
            this.nume = nume;
            this.puncte = puncte;
        }

        void printCard() {
            System.out.println("👤 Nume: " + nume);
            System.out.println("⭐ Puncte: " + puncte);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        // 1️⃣ Creăm lista de jucători
        ArrayList<Jucator> jucatori = new ArrayList<>();
        jucatori.add(new Jucator("Ana", 120));
        jucatori.add(new Jucator("Mihai", 250));
        jucatori.add(new Jucator("Elena", 90));  // sub 100
        jucatori.add(new Jucator("Radu", 180));
        jucatori.add(new Jucator("Ioana", 70));  // sub 100

        // 2️⃣ Filtrăm jucătorii cu mai puțin de 100 de puncte
        for (int i = 0; i < jucatori.size(); i++) {
            if (jucatori.get(i).puncte < 100) {
                System.out.println("❌ " + jucatori.get(i).nume + " a fost eliminat (prea puține puncte)");
                jucatori.remove(i);
                i--; // ⚠️ scădem indexul, pentru că lista s-a micșorat
            }
        }

        System.out.println("\n✅ Jucători rămași în listă:\n");

        // 3️⃣ Afișăm doar jucătorii rămași
        for (Jucator j : jucatori) {
            j.printCard();
        }
    }


    //EXPLICATII:

    /*

🔹 De ce folosim for clasic

Când ștergi un element dintr-o listă (jucatori.remove(i)), lista se rearanjează automat:
elementele din dreapta se mută o poziție spre stânga;
lungimea listei (size) scade cu 1.

Dacă am folosi for-each, am primi o eroare: ConcurrentModificationException
pentru că modificăm lista în timp ce e iterată intern.


🔹 De ce facem i--

Să presupunem că avem:
[ Ana, Mihai, Elena, Radu, Ioana ]

Când ajungem la Elena (i = 2):
Elena are < 100 → o ștergem.
Lista devine [ Ana, Mihai, Radu, Ioana ].

Dar acum, după ștergere:
Radu a trecut pe poziția 2.

Următoarea iterație ar fi i = 3 → adică am sărit peste Radu.
De aceea facem i--, ca să ne întoarcem o poziție și să verificăm și elementul care a venit „în locul” celui șters.



🧩 Varianta 1 — cu for-each

for (Jucator j : jucatori) {
    j.printCard();
}

🔹 Ce face
Parcurge automat fiecare element din listă (jucatori).
La fiecare pas, variabila j devine referința către obiectul curent.
Nu ai nevoie de index (i), deci codul e mai curat.


🧩 Varianta 2 — cu for clasic (cu index i)

Aceeași logică, scrisă „manual”:

for (int i = 0; i < jucatori.size(); i++) {
    Jucator j = jucatori.get(i); // obținem elementul de pe poziția i
    j.printCard();
}

🔹 Ce se întâmplă
jucatori.size() → returnează câte elemente are lista.
jucatori.get(i) → returnează elementul de pe poziția i.
Apoi apelăm printCard() pe acel element.



💬 Concluzie:

🔹 Folosește for-each când doar citești/afișezi date (cea mai clară variantă).
🔹 Folosește for clasic când ai nevoie de control asupra indexului sau vrei să modifici lista.


     */


}
