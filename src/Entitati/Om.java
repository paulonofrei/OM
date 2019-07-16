package Entitati;

public class Om {
    int varsta;
    String nume,prenume;
    double inaltime;
    public void setVarsta (int v){
        this.varsta=  v;
    }
    public void setNume(String nume){
        this.nume=nume;
    }
    public void setPrenume(String prenume){
        this.prenume=prenume;
    }
    public void setInaltime(double Inaltime){
        this.inaltime=Inaltime;
    }
    public void afisareInfoOm (Om Alin)
    {
    System.out.println("omul noustru are numele de " +this.nume);
    System.out.println("Omul nostru are prenumele " + this.prenume);
    }
}


