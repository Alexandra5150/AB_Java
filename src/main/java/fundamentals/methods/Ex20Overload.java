package main.java.fundamentals.methods;

/*
## 20) Exercitiul20_Overload

Obiectiv: overloading pe `printCard`.

Cerințe:
- Variante:
  - `static void printCard(String nume, int puncte)`
  - `static void printCard(String nume, int puncte, double valPunct)` care afișează și valoarea în lei (2 zecimale)

- Output pentru apelurile din `main`:
```
Ana: 120p
Ana: 120p (6.00 lei)
```
Explicație:
- Overloading permite același nume de metodă cu semnături diferite; alege varianta în funcție de parametri.
 */

public class Ex20Overload {

    static void printCard(String nume, int puncte){
        System.out.println(nume + ": " + puncte + "p");
    }

    static void printCard(String nume, int puncte, double valPunct){
        System.out.println(nume + ": " + puncte + "p (" + puncte * valPunct + " lei)");
    }

    public static void main (String[] args){

        printCard("Ana", 120);
        printCard("Ana", 120, 0.05);

    }

}
