package main.java.fundamentals.methods;

public class Ex16PrintCardExtins {


    //VARIANTA 1: mai mulți jucători și aceeași metodă printCard pentru fiecare

        // Metoda care afișează cardul unui jucător
    static void printCard(String nume, int puncte) {
        System.out.println("👤 Nume: " + nume);
        System.out.println("⭐ Puncte: " + puncte);
        System.out.println("--------------------"); // separator opțional
    }

    public static void main(String[] args) {
        // Apeluri multiple – reutilizarea metodei pentru mai mulți jucători
        printCard("Ana", 120);
        printCard("Mihai", 250);
        printCard("Elena", 90);
        printCard("Radu", 180);
    }


    //VARIANTA 2: listă (array) de jucători, ca să nu apelăm manual printCard() de 10 ori

    /*
    static void printCard(String nume, int puncte) {
        System.out.println("👤 Nume: " + nume);
        System.out.println("⭐ Puncte: " + puncte);
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        // Două array-uri paralele: unul pentru nume, unul pentru puncte
        String[] numeJucatori = {"Ana", "Mihai", "Elena", "Radu", "Ioana"};
        int[] puncteJucatori = {120, 250, 90, 180, 300};

        // Parcurge lista și afișeaza cardul pentru fiecare
        for (int i = 0; i < numeJucatori.length; i++) {
            printCard(numeJucatori[i], puncteJucatori[i]);
        }
    }

     */


    //VARIANTA 3: orientată pe obiecte (OOP)

    /*
        // Clasa Jucator
    static class Jucator {
        String nume;
        int puncte;

        // Constructor
        Jucator(String nume, int puncte) {
            this.nume = nume;
            this.puncte = puncte;
        }

        // Metoda proprie care afișează cardul
        void printCard() {
            System.out.println("👤 Nume: " + nume);
            System.out.println("⭐ Puncte: " + puncte);
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        // Lista de jucători
        ArrayList<Jucator> jucatori = new ArrayList<>();
        jucatori.add(new Jucator("Ana", 120));
        jucatori.add(new Jucator("Mihai", 250));
        jucatori.add(new Jucator("Elena", 90));
        jucatori.add(new Jucator("Radu", 180));
        jucatori.add(new Jucator("Ioana", 300));

        // Fiecare jucător își afișează singur cardul
        for (Jucator j : jucatori) {
            j.printCard();
        }
    }

     */


}
