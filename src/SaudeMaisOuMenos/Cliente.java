package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {
    static enum StatusDoCliente {Ativo, Inativo,Possivel};   
    private String numSUS;
    private String nomeDoPlano;
    private StatusDoCliente tipoDeCliente;
    private LocalDate dataDeAquisicaoDoPlano;
    private String dataDeAquisicaoDoPlanoString;
    
    public Cliente(){
    }

    public Cliente(String numSUS, String nomeDoPlano, StatusDoCliente tipoDeCliente, LocalDate dataDeAquisicaoDoPlano, String dataDeAquisicaoDoPlanoString, String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento);
        this.numSUS = numSUS;
        this.nomeDoPlano = nomeDoPlano;
        this.tipoDeCliente = tipoDeCliente;
        this.dataDeAquisicaoDoPlano = dataDeAquisicaoDoPlano;
        this.dataDeAquisicaoDoPlanoString = dataDeAquisicaoDoPlanoString;
    }

    
   @Override
    public void pegarDados (BancoDeDados bancoDeDados, Usuario.Status status){    
        super.pegarDados(bancoDeDados, status);
        this.tipoDeCliente = Cliente.StatusDoCliente.Possivel;
        System.out.print("Informe o número do Cartão do SUS: ");
        this.numSUS = ler.nextLine();
    }
    public void mostrarTipoDoCliente () {    
        System.out.print("\tTipoDoCliente: " + getTipoDeCliente());
    }
    
    @Override
    public void mostrarDados () {
        super.mostrarDados();
        System.out.print("\tNúmeroDoCartãoDoSUS: " + getNumSUS());
    }

    public String getNumSUS() {
        return numSUS;
    }

    public void setNumSUS(String numSUS) {
        this.numSUS = numSUS;
    }

    public StatusDoCliente getTipoDeCliente() {
        return tipoDeCliente;
    }

    public void setTipoDeCliente(StatusDoCliente tipoDeCliente) {
        this.tipoDeCliente = tipoDeCliente;
    }

    public String getNomeDoPlano() {
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano) {
        this.nomeDoPlano = nomeDoPlano;
    }

    public LocalDate getDataDeAquisicaoDoPlano() {
        return dataDeAquisicaoDoPlano;
    }

    public void setDataDeAquisicaoDoPlano(LocalDate dataDeAquisicaoDoPlano) {
        this.dataDeAquisicaoDoPlano = dataDeAquisicaoDoPlano;
    }

    public String getDataDeAquisicaoDoPlanoString() {
        return dataDeAquisicaoDoPlanoString;
    }

    public void setDataDeAquisicaoDoPlanoString(String dataDeAquisicaoDoPlanoString) {
        this.dataDeAquisicaoDoPlanoString = dataDeAquisicaoDoPlanoString;
    }
}
