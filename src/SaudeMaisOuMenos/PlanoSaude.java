package SaudeMaisOuMenos;

public class PlanoSaude {
    String nomePlano;
    double desconto;
    String PlanoSaude;

    public PlanoSaude(String nomePlano, double desconto) {
        this.nomePlano = nomePlano;
        this.desconto = desconto;
    }
    public String getNomePlano() {
        return nomePlano;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public String getPlanoSaude() {
        return PlanoSaude;
    }

    public void setPlanoSaude(String PlanoSaude) {
        this.PlanoSaude = PlanoSaude;
    }
}
