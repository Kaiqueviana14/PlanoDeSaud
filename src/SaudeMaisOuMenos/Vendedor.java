package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Funcionario {

    private double bonificacao;
    private PlanoSaude planoResponsavel;
    private int qtdPlanosVendidos;

    public Vendedor() {
        
    }

    public Vendedor(double bonificacao, PlanoSaude planoResponsavel, int qtdPlanosVendidos, String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento, String nomeDeUsuario, String senha, Status qualprof, String nCtps, double salario, LocalDate dataDeContratacao, LocalTime horaDeInicioDoExpediente, LocalTime horaDeTerminoDoExpediente) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, qualprof, nCtps, salario, dataDeContratacao, horaDeInicioDoExpediente, horaDeTerminoDoExpediente);
        this.bonificacao = bonificacao;
        this.planoResponsavel = planoResponsavel;
        this.qtdPlanosVendidos = qtdPlanosVendidos;
    }
    public void verificarListaDePossiveisClientes (Exibicao exibir, BancoDeDados bancoDeDados){
        exibir.imprimirListaDePossiveisClientes(bancoDeDados);
    }
    @Override
    public void pegarDados(BancoDeDados bancoDeDados, Usuario.Status status) {
        super.pegarDados(bancoDeDados, status);
        
    }
    @Override
    public void mostrarDados () {
        super.mostrarDados();
        System.out.printf("\tBonificação: R$%.2f", getBonificacao());
        System.out.print("\tPlanoDeSaúdeResponsável: " + getPlanoResponsavel());
        System.out.print("\tQuantidade de Planos Vendidos: " + getQtdPlanosVendidos());
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public PlanoSaude getPlanoResponsavel() {
        return planoResponsavel;
    }

    public void setPlanoResponsavel(PlanoSaude planoResponsavel) {
        this.planoResponsavel = planoResponsavel;
    }

    public int getQtdPlanosVendidos() {
        return qtdPlanosVendidos;
    }

    public void setQtdPlanosVendidos(int qtdPlanosVendidos) {
        this.qtdPlanosVendidos = qtdPlanosVendidos;
    }
    
}
