package SaudeMaisOuMenos;

public class Dependente extends Pessoa {
   String nomeDependente;
   int idadeDependente;

    public Dependente(String nomeDependente, int idadeDependente) {
        this.nomeDependente = nomeDependente;
        this.idadeDependente = idadeDependente;
    }

    public String getNomeDependente() {
        return nomeDependente;
    }

    public void setNomeDependente(String nomeDependente) {
        this.nomeDependente = nomeDependente;
    }

    public int getIdadeDependente() {
        return idadeDependente;
    }

    public void setIdadeDependente(int idadeDependente) {
        this.idadeDependente = idadeDependente;
    }
}