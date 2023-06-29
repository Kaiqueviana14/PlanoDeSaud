package SaudeMaisOuMenos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanoSaude {
    
    public static enum StatusDoPlano {Ativo, Inativo}; 
    
    
    private String nomePlano; 
    private String descricao;
    private int codigoDoPlano;
    private double valorMensal;
    
     
  
    static ferramentas ferramentas = new ferramentas();
    static Scanner ler =new Scanner(System.in);
    public PlanoSaude(){
        
    }
    public PlanoSaude(String nomePlano, String descricao, int codigoDoPlano, double valorMensal) {
        this.nomePlano = nomePlano;
        this.descricao = descricao;
        this.codigoDoPlano = codigoDoPlano;
        this.valorMensal = valorMensal;
    }
    
    
    public void pegarDadosDoPlano() {
        
        System.out.print("Informe o Nome do plano: ");
        this.nomePlano = ler.nextLine();
        System.out.print("-> Digite a Descrição do plano: ");
        this.descricao = ler.nextLine();
        System.out.print("-> Digite o Valor do Plano\n");
        this.valorMensal = ferramentas.Double();
        System.out.print("-> Digite o Código do Plano: ");
        this.codigoDoPlano = ler.nextInt();
    }
   
    public void mostrarDadosDoPlano () {
        System.out.println("\tNome do Plano: " + getNomePlano());
        System.out.println("\tDescrição do Plano: " + getDescricao());
        System.out.printf("\tValor Mensal: R$%.2f", getValorMensal());
        System.out.println("");
        System.out.print("\tCódigo do Plano: " + getCodigoDoPlano());
    }

    public String getNomePlano() {
        return nomePlano;
    }

    public void setNomePlano(String nomePlano) {
        this.nomePlano = nomePlano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodigoDoPlano() {
        return codigoDoPlano;
    }

    public void setCodigoDoPlano(int codigoDoPlano) {
        this.codigoDoPlano = codigoDoPlano;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(double valorMensal) {
        this.valorMensal = valorMensal;
    }

    public static ferramentas getFerramentas() {
        return ferramentas;
    }

    public static void setFerramentas(ferramentas ferramentas) {
        PlanoSaude.ferramentas = ferramentas;
    }
    
}
