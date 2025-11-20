package main.java.OOPconcepts.encapsulation;

/*
## 29) Exercitiul29_ClasaImutabila

Obiectiv: Modelează un card imutabil (fără setteri, câmpuri `final`).

Cerințe:
- Clasa `CardNetflixImmutable` cu `private final String profil; private final int minuteVizionate;`.
- Constructor validează/normalizează: `profil` ca în ex. 27; `minuteVizionate` >= 0.
- Fără setteri. Expune doar getteri.
- Pentru „modificări”, expune metode de tip `cuX`: `CardNetflixImmutable cuMinuteVizionate(int m)` care întoarce un nou obiect.

Pași:
1. Creează fișier `Exercitiul29_ClasaImutabila.java`.
2. Implementează clasa și un `main` care arată că obiectul original rămâne neschimbat după apelul `cuMinuteVizionate`.

De ce imutabilitate:
- Elimină clase de erori (stări intermediare invalide), ușurează reasoningul, e thread-safe by default.
 */

public class Ex29ClasaImutabila {

    public static class CardNetflixImmutable {
        private final String numeProfil;
        private final int minuteVizionate;

        public CardNetflixImmutable(String numeProfil, int minuteVizionate) {
            this.numeProfil = (numeProfil == null || numeProfil.trim().isEmpty()) ? "Profil" : numeProfil.trim();
            this.minuteVizionate = Math.max(0, minuteVizionate);
        }

        public String getNumeProfil() { return numeProfil; }
        public int getMinuteVizionate() { return minuteVizionate; }

        // "cuX" — creează un nou obiect cu modificarea dorită
        public CardNetflixImmutable cuMinuteVizionate(int minuteNoi) {
            return new CardNetflixImmutable(this.numeProfil, minuteNoi);
        }
    }

    public static void main(String[] args) {
        CardNetflixImmutable p1 = new CardNetflixImmutable("Kids", 90);
        CardNetflixImmutable p2 = p1.cuMinuteVizionate(120); // p1 rămâne neschimbat
        System.out.println(p1.getMinuteVizionate()); // 90
        System.out.println(p2.getMinuteVizionate()); // 120
    }

}
