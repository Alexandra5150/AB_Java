package main.java.fundamentals.operators;

/*
📘 Teorie
Aritmetici: + - * / %
Unari: + - ++ -- !
Comparație: == != > >= < <= (rezultatul e boolean)
Logici: && || ! (short-circuit)
Atribuire compusă: += -= *= /= %=
Ternar: cond ? a : b
Precedență: () > unari > * / % > + - > comparații > && > || > ?: > atribuiri
Pitfall: double are erori de reprezentare binară; pentru bani folosește BigDecimal.
 */

public class FundamentalsOperatorsTheoryExamples {

        // Exemplul 1: Total puncte cu +=
        private static void exampleTotalPuncte() {
            int puncte = 10;
            puncte += 5; // 15
            System.out.println(puncte);
        }

        // Exemplul 2: Comparare pentru bonus
        public static void exampleCompararePentruBonus() {
            int puncte = 120;
            boolean eligibil = puncte >= 100;
            System.out.println("Eligibil: " + eligibil);
        }

        // Exemplul 3: Ternar pentru mesaj
        public static void exampleTernar() {
            boolean activ = true;
            String mesaj = activ ? "Card activ" : "Card inactiv";
            System.out.println(mesaj);
        }

        // Main method to run all examples
        public static void main(String[] args) {

            System.out.println("\n== Exemplul 1: Total puncte cu +=");
            exampleTotalPuncte();

            System.out.println("== Exemplul 2: Comparare pentru bonus");
            exampleCompararePentruBonus();

            System.out.println("\n== Exemplul 3: Ternar pentru mesaj");
            exampleTernar();

        }




}
