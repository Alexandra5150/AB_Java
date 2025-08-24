package main.java.fundamentals.variables;

/*
4) Exercitiul04_CardHotel
Obiectiv: boolean pentru status.
Pași:
Fișier/clasă Exercitiul04_CardHotel.
Declară:
String nume = "Maria";
boolean activ = false;
int noptiRamase = 0;
Afișează EXACT:
🏨 CARD HOTEL
Nume: Maria
Status: Inactiv
Nopți rămase: 0
Commit: feat: add exercitiul 04 - card hotel (boolean)
Explicație:
boolean poate fi doar true sau false. Nu există „yes/no”. Transformă manual în textul dorit la afișare.
 */

public class Ex4CardHotel {
    public static void main (String[] args){
        String nume = "Maria";
        boolean activ = false;
        int noptiRamase = 0;
        String status;
        if (activ == true){
            status = "Activ";
        } else {
            status = "Inactiv";
        }

        System.out.println("\uD83C\uDFE8 CARD HOTEL");
        System.out.println("Nume: " + nume);
        System.out.println("Status: " + status);
        System.out.println("Nopti ramase: " + noptiRamase);
    }
}
