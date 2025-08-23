package main.java.fundamentals.variables;

public class FundamentalsVariablesTheoryExamples {

        // Exemplul 1: Card cafenea
        public static void exampleCardCafea() {
            String numeClient = "Ana";
            int puncte = 12;
            double valoarePunct = 0.3;
            boolean activ = true;

            System.out.println("Client: " + numeClient);
            System.out.println("Puncte: " + puncte);
            System.out.println("Valoare: " + (puncte * valoarePunct) + " lei");
            System.out.println("Activ: " + activ);
        }

        // Exemplul 2: Card hotel
        public static void exampleCardHotel() {
            String hotel = "Sunrise";
            int nopti = 3;
            double punctePeNoapte = 25.5;
            double total = nopti * punctePeNoapte;

            System.out.println("Hotel: " + hotel + ", Total puncte: " + total);
        }

        // Exemplul 3: Casting explicit
        public static void exampleCasting() {
            double d = 7.8;
            int i = (int) d; // 7

            System.out.println("Valoare double: " + d);
            System.out.println("Valoare int (casting): " + i);
        }

        // Main method to run all examples
        public static void main(String[] args) {
            System.out.println("== Exemplul 1: Card cafenea ==");
            exampleCardCafea();

            System.out.println("\n== Exemplul 2: Card hotel ==");
            exampleCardHotel();

            System.out.println("\n== Exemplul 3: Casting explicit ==");
            exampleCasting();
        }


}
