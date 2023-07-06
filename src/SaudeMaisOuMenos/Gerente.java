package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gerente extends Funcionario{
    
    static int qtdVendedores = 0;
    static int qtdAtendentes = 0;
    
    public Gerente (){
        
    } 

    public Gerente(String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento, String nomeDeUsuario, String senha, Status qualprof, String nCtps, double salario, LocalDate dataDeContratacao, LocalTime horaDeInicioDoExpediente, LocalTime horaDeTerminoDoExpediente) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, qualprof, nCtps, salario, dataDeContratacao, horaDeInicioDoExpediente, horaDeTerminoDoExpediente);
    }
    public void aplicarBonificacaoDosFuncionarios (BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status){
        
    }
    public void cadastrarFuncionario (BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status) {
        
        if(status == Usuario.Status.Vendedor) {
            
            Vendedor novoVendedor = new Vendedor();    
      
            System.out.println("\n-------Cadastro de Vendedor-------\n");   
            System.out.println("Total de Vendedores cadastrados até o momento: "
                + qtdVendedores);
            System.out.println("");
      
            novoVendedor.pegarDados(bancoDeDados, Usuario.Status.Vendedor);
            ;
            bancoDeDados.getUsuario().add(novoVendedor);
            qtdVendedores++;
      
            System.out.println("\n\nTotal de Vendedores após esse cadastro: "
                + qtdVendedores);
            System.out.print("\n-----Vendedor cadastrado com sucesso!-----");
            
            } else if (status == Usuario.Status.Atendente) {
                
            Atendente novoAtendente = new Atendente();
       
            System.out.println("\n********Cadastro de Atendente********\n"); 
            System.out.println("Total de Atendentes cadastrados até o momento: "
                + qtdAtendentes);
            System.out.println("");
        
            novoAtendente.pegarDados(bancoDeDados, Usuario.Status.Atendente);
            bancoDeDados.getUsuario().add(novoAtendente);
            qtdAtendentes++;
        
            System.out.println("\nTotal de Atendentes após esse cadastro: "
                + qtdAtendentes);
            System.out.print("\n-----Atendente cadastrado com sucesso!-----");
        }
    }
    
    @Override
    public void demitirFuncionario (BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status){
        
        super.demitirFuncionario(bancoDeDados, exibir, status);
        
        if((qtdVendedores!=0) || (qtdAtendentes!=0)) {
            
            if(status == Usuario.Status.Vendedor){
                qtdVendedores--;
            } else if (status == Usuario.Status.Atendente){
                qtdAtendentes--;
            }
            
            ferramentas.verificaLista(bancoDeDados, exibir, status);
        
            System.out.print("\n-----Operação Finalizada com Sucesso!-----");
        }
    }
    
    public PlanoSaude escolherPlanoDoVendedor (BancoDeDados bancoDeDados, Exibicao exibir ) {
        
        int codigo = 0;
        boolean procurando = false;
        PlanoSaude planoDoVendedor = null;
        exibir.imprimirListaDePlanosDeSaude(bancoDeDados);
        
        do {
            System.out.print("Digite um dos códigos acima para ser o plano que vai ser vendido pelo vendedor: ");
            codigo = ler.nextInt();
            
            for(PlanoSaude plano: bancoDeDados.getListaplanosSaudes()) {
                if (plano.getCodigoDoPlano() == codigo) {
                    procurando = true;
                    planoDoVendedor = bancoDeDados.getListaplanosSaudes().get(codigo);
                    System.out.println(planoDoVendedor);
                    break;
                }else { 
                    System.out.println("\nO código digitado não corresponde a "
                            + "nenhum Plano de Saúde existeste em nosso banco "
                            + "de dados. Por favor, tente novamente!\n");
                    break;
                }
            }   
        } while (procurando==false);
        System.out.println("\nO vendedor vai ficar responsável pelo plano: " + planoDoVendedor.getNomePlano());
        return planoDoVendedor;            
    }
    
    @Override
    public void pegarDados(BancoDeDados bancoDeDados, Usuario.Status status) {
        super.pegarDados(bancoDeDados, status);

    }
    
    @Override
    public void mostrarDados () {
        super.mostrarDados();
        
    }
    
}
