package main.java.fundamentals.variables;

/*
1) Exercitiul01_CardHarryPotter
Obiectiv: Lucrezi cu String și afișare.

Pași:
Creează fișierul Exercitiul01_CardHarryPotter.java cu clasa Exercitiul01_CardHarryPotter și metoda public static void main(String[] args).
Declară exact variabilele:
String numeStudent = "Harry Potter";
String casaHogwarts = "Gryffindor";
String anScolar = "Anul 7";

Afișează EXACT (liniile și spațiile):
🏰 CARD STUDENT HOGWARTS 🏰
===========================
Student: Harry Potter
Casa: Gryffindor
An școlar: Anul 7
Status: Activ

Commit:
git add Exercitiul01_CardHarryPotter.java
git commit -m "feat: add exercitiul 01 - card Hogwarts (String + print)"

Explicație și scop:
Exersezi declararea de variabile String și concatenarea în System.out.println.
Vezi diferența dintre text literal și valori din variabile.
*/


public class Ex1CardHarryPotter {

    public static void main(String[] args) {
        // Variabile pentru cardul Harry Potter
        String numeStudent = "Harry Potter";
        String casaHogwarts = "Gryffindor";
        String anScolar = "Anul 7";

        // Afișare informații card student
        System.out.println("🏰 CARD STUDENT HOGWARTS 🏰");
        System.out.println("===========================");
        System.out.println("Student: " + numeStudent);
        System.out.println("Casa: " + casaHogwarts);
        System.out.println("An școlar: " + anScolar);
        System.out.println("Status: Activ");
    }

}
