package main.java.OOPconcepts.encapsulation;

/*
## 26) Exercitiul26_GetSet_Baza

Obiectiv: Încapsulează starea unui card de cinema cu câmpuri `private` și oferă un API minim prin getteri/setteri.

Ce înveți și de ce:
- De ce `private`: împiedică accesul direct la câmpuri și permite controlul asupra modificărilor.
- De ce get/set: creezi un punct unic unde poți valida/normaliza date acum sau în viitor.

Pași detaliați:
1. Creează fișierul `Exercitiul26_GetSet_Baza.java`.
2. Scrie clasa `CardCinemaSecure` cu câmpuri `private String numeClient; private int puncte;`.
3. Adaugă getteri/setteri simpli (fără validări încă): `getNumeClient()`, `setNumeClient(String)`, `getPuncte()`, `setPuncte(int)`.
4. În `main`, creează un obiect, setează valori și afișează: `<nume> | <puncte>p`.

Validare (checklist):
- Câmpurile sunt `private`.
- Nu există acces direct tip `obj.puncte = 10` în afara clasei; doar prin setteri.
- Output-ul este exact, fără spații/litere lipsă.

Greșeli frecvente și cum le eviți:
- Uitarea `private` pe câmpuri —> IDE-ul nu previne; verifică manual.
- Nume de metode incorecte (ex.: `getpuncte`) —> respectă camelCase: `getPuncte`.
 */


public class Ex26GetSetBaza {

    public static class CardCinemaSecure {
        private String numeClient;
        private int puncte;

        public String getNumeClient() {
            return numeClient;
        }

        public int getPuncte() {
            return puncte;
        }

        public void setNumeClient(String numeClient) {
            this.numeClient = numeClient;
        }

        public void setPuncte(int puncte) {
            this.puncte = puncte;
        }
    }

    public static void main(String[] args) {
        CardCinemaSecure c = new CardCinemaSecure();
        c.setNumeClient("Ana");
        c.setPuncte(120);
        System.out.println(c.getNumeClient() + " | " + c.getPuncte() + "p");
    }

}
