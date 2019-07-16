package Entitati;

import Copil.COPIL;

public class Executie {
    public static void main (String[]args){
        Om x= new Om();
        x.setNume("Valeriu");
        x.setPrenume("Ionica");
        x.afisareInfoOm(x);
        COPIL y= new COPIL();
        y.afisareInfoCopil("Onofrei ", "Paul ", 27);
        y.afisareInfoCopil("Ciurariu" , "Andrei");
    }
}
