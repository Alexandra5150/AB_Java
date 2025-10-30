package main.java.fundamentals.methods;

/*
## 19) Exercitiul19_Conversie

Obiectiv: metodă cu parametri multipli și calcule `double`.

Cerințe:
- `static double convertToMoney(int puncte, double valPunct)` => `puncte * valPunct`.
- În `main`, formatează cu 2 zecimale: `System.out.printf("%.2f", convertToMoney(125, 0.05));` => `6.25`.

Pitfall:
- Evită împărțirea întreg la întreg; aici multiplicăm `int` cu `double` și rezultatul e `double` (corect pentru bani).
 */

public class Ex19Conversie {

    static double convertToMoney(int puncte, double valPunct){
        return puncte * valPunct;
    }

    public static void main (String[] args){

        System.out.printf("%.2f", convertToMoney(125, 0.05));

    }

}
