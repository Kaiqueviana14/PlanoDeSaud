package SaudeMaisOuMenos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Especialidade{
    
    private String nomeDoProfissional;
    private String nomeDaEspecialidade;
    private double valorNormalDaConsulta;
    ferramentas ferramentas = new ferramentas();
    static Scanner ler = new Scanner(System.in);
    public Especialidade (){
        
    }

    public Especialidade(String nomeDoProfissional, String nomeDaEspecialidade, double valorNormalDaConsulta) {
        this.nomeDoProfissional = nomeDoProfissional;
        this.nomeDaEspecialidade = nomeDaEspecialidade;
        this.valorNormalDaConsulta = valorNormalDaConsulta;
    }

   

    
      public void cadastrarEspecialidade (BancoDeDados bancoDeDados) {
        
        Especialidade novoEspecialista = new Especialidade();
        
        System.out.println("\n********Cadastro de Especialidade********\n"); 
        System.out.println("Total de Especialidades cadastrados até o momento: "
                + bancoDeDados.getEspecialidades().size());
        System.out.println("");
        
        novoEspecialista.pegarDadosDaEspecialidade();
        bancoDeDados.getEspecialidades().add(novoEspecialista);
        
        System.out.println("\nTotal de Especialidades após esse cadastro: "
                + bancoDeDados.getEspecialidades().size());
        System.out.print("\n-----Especialidade cadastrado com sucesso!-----");
    }
      public void pegarDadosDaEspecialidade () {
        System.out.print("-> Digite o Nome do Profissional: ");
        this.nomeDoProfissional = ler.nextLine();
        System.out.print("-> Digite a Especialidade Médica: ");
        this.nomeDaEspecialidade = ler.nextLine();
        System.out.print("-> Digite o Valor normal da consulta\n");
        this.valorNormalDaConsulta = ferramentas.Double();
    }
      public void mostrarDadosDaEspecialidade () {
        System.out.println("\tNome do Profissional: " + getNomeDoProfissional());
        System.out.println("\tNome da Especialidade: " + getNomeDaEspecialidade());
        System.out.printf("\tValor da Consulta: R$%.2f", getValorNormalDaConsulta());
        System.out.println("");
      }

    public String getNomeDoProfissional() {
        return nomeDoProfissional;
    }

    public void setNomeDoProfissional(String nomeDoProfissional) {
        this.nomeDoProfissional = nomeDoProfissional;
    }

    public String getNomeDaEspecialidade() {
        return nomeDaEspecialidade;
    }

    public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
        this.nomeDaEspecialidade = nomeDaEspecialidade;
    }

    public double getValorNormalDaConsulta() {
        return valorNormalDaConsulta;
    }

    public void setValorNormalDaConsulta(double valorNormalDaConsulta) {
        this.valorNormalDaConsulta = valorNormalDaConsulta;
    }

    public static void setFerramentas(SaudeMaisOuMenos.ferramentas ferramentas) {
        PlanoSaude.ferramentas = ferramentas;
    }

    public static Scanner getLer() {
        return ler;
    }

    public static void setLer(Scanner ler) {
        PlanoSaude.ler = ler;
    }
      
}

    
