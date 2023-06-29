package SaudeMaisOuMenos;

import java.time.LocalDate;

public class Dependente extends Pessoa{
    
    private PlanoSaude nomeDoPlano;
    private String clienteResponsavel;
    
    public Dependente(){
    }

    public Dependente(PlanoSaude nomeDoPlano, String clienteResponsavel, String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento);
        this.nomeDoPlano = nomeDoPlano;
        this.clienteResponsavel = clienteResponsavel;
    }

    
      @Override
    public void mostrarDados () {
        super.mostrarDados();
        System.out.print("\tResponsável : " + getClienteResponsavel());
        System.out.print("\tPlano: " + getNomeDoPlano());
    }

    public PlanoSaude getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(PlanoSaude nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public String getClienteResponsavel() {
        return clienteResponsavel;
    }

    public void setClienteResponsavel(String clienteResponsavel) {
        this.clienteResponsavel = clienteResponsavel;
    }
    
}