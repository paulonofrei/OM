package Copil;

import Entitati.Om;

public class COPIL extends Om {

//    Overload
    public void afisareInfoCopil (String nume, String prenume){
        System.out.println("Omul are numele si prenumele " + nume + prenume);

    }
    public void afisareInfoCopil (String nume, String prenume, int varsta){
        System.out.println("omul are numele ,prenumele si varsta :" + nume + prenume + varsta);
    }

}
