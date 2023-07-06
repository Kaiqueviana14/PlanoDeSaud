package SaudeMaisOuMenos;

import java.time.LocalDate;

public class Dependente extends Pessoa{
    
        private String clienteResponsavel;
    
    public Dependente(){
    }

    public Dependente(String clienteResponsavel, String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento);
                this.clienteResponsavel = clienteResponsavel;
    }

    
      @Override
    public void mostrarDados () {
        super.mostrarDados();
        System.out.print("\tResponsável : " + getClienteResponsavel());
            }

    

    public String getClienteResponsavel() {
        return clienteResponsavel;
    }

    public void setClienteResponsavel(String clienteResponsavel) {
        this.clienteResponsavel = clienteResponsavel;
    }
    
}