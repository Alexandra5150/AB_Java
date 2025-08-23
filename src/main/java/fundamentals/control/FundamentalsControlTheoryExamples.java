package main.java.fundamentals.control;


public class FundamentalsControlTheoryExamples {

    // Exemplul 1: if/else — bonus după puncte
    public static void exampleIfElse() {
        int puncte = 120;
        if (puncte >= 100) {
            System.out.println("Bonus activat");
        } else {
            System.out.println("Fără bonus încă");
        }
    }

    // Exemplul 2: switch — beneficii după tip card
    public static void exampleSwitch() {
        String tip = "cinema";
        switch (tip) {
            case "cinema":
                System.out.println("Reducere popcorn");
                break;
            case "hotel":
                System.out.println("Late checkout");
                break;
            default:
                System.out.println("Bonus standard");
        }
    }

    // Exemplul 3: for — simulare acumulare pe zile
    public static void exampleForLoop() {
        int total = 0;
        for (int zi = 1; zi <= 7; zi++) {
            total += 10; // 10 puncte/zi
        }
        System.out.println("Total: " + total);
    }

    // Exemplul 4: while — caută primul card activ
    public static void exampleWhileLoop() {
        boolean[] active = {false, false, true, true};
        int i = 0;
        while (i < active.length && !active[i]) {
            i++;
        }
        System.out.println("Primul activ la index: " + i);
    }

    // Main method to run all examples
    public static void main(String[] args) {
        System.out.println("== Exemplul 1 ==");
        exampleIfElse();

        System.out.println("\n== Exemplul 2 ==");
        exampleSwitch();

        System.out.println("\n== Exemplul 3 ==");
        exampleForLoop();

        System.out.println("\n== Exemplul 4 ==");
        exampleWhileLoop();
    }
}

