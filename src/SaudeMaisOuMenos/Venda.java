package SaudeMaisOuMenos;

public class Venda {
    private Cliente cliente;
    private PlanoSaude planoSaude;

    public Venda(Cliente cliente, PlanoSaude planoSaude) {
        this.cliente = cliente;
        this.planoSaude = planoSaude;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }
}
