package SaudeMaisOuMenos;

public class Especialidade {
    String nomeEspecialidade;
    double desconto;

    public Especialidade(String nomeEspecialidade, double desconto) {
        this.nomeEspecialidade = nomeEspecialidade;
        this.desconto = desconto;
    }

    public String getNomeEspecialidade() {
        return nomeEspecialidade;
    }

    public void setNomeEspecialidade(String nomeEspecialidade) {
        this.nomeEspecialidade = nomeEspecialidade;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
}
