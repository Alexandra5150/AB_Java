package main.java.fundamentals.methods;

/*
## 18) Exercitiul18_ValidareCard

Obiectiv: metodă booleană.

Cerințe:
- Scrie `static boolean esteValid(boolean activ, int zile)` => `true` dacă `activ` și `zile > 0`.
- În `main`, afișează EXACT: `"Valid: " + esteValid(true, 5)` => `Valid: true`.

Clarificare:
- Tipul returnat este `boolean`, deci metoda nu printează; doar decide `true/false`.
 */

public class Ex18ValidareCard {

    static boolean esteValid(boolean activ, int zile) {
        if (activ = true && zile > 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main (String[] args){

        System.out.println("Valid: " + esteValid(true, 5));

    }

}
