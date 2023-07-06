package SaudeMaisOuMenos;

import java.util.Scanner;
import javax.swing.SwingUtilities;


public class Operador extends Cadastro{
    
  
    static BancoDeDados bancoDeDados = new BancoDeDados();
    static Exibicao exibir = new Exibicao();
    static Usuario usuario = new Usuario ();
    static Adm adm = new Adm();
    static Funcionario funcionario = new Funcionario();
    static Gerente gerente = new Gerente();
    static Vendedor vendedor = new Vendedor(); 
    static Atendente atendente = new Atendente();
    static Cliente cliente = new Cliente();
    static PlanoSaude plano = new PlanoSaude();
    static Especialidade especialidades= new Especialidade();
    static CriadorDeUsuarios criar = new CriadorDeUsuarios();
    static Scanner ler = new Scanner(System.in);
    
    static void executaMenuCadastrarPrimeiro(int opcao){ 
        
       switch(opcao){
            case 1: {
                adm.cadastrarAdm(bancoDeDados); ;
                break;
            }
            case 0:
                    System.out.print("\nSaindo!\n\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
        }
    }
    static void executaMenuAdministrador(int opcao){
        
        switch(opcao){
            case 1: {
                exibir.imprimirListaDeAdministrador(bancoDeDados);
                break;
            }
            case 2: {
                adm.cadastrarGerente(bancoDeDados);
                break;
            }
            case 3: {
                adm.demitirFuncionario(bancoDeDados, exibir, Usuario.Status.Gerente);
                break;
            }
            case 4: {
                adm.editarDados(bancoDeDados);
                break;
            }
            case 5: {
                exibir.imprimirListaDeGerentes(bancoDeDados);
                break;
            }
            case 6: {
                adm.cadastrarPlanoDeSaude(bancoDeDados);
                break;
            }
            case 7: {
                adm.deletarPlano(bancoDeDados,exibir);
                break;
            }
            case 8: {
                adm.editarPlanoDeSaude(bancoDeDados, exibir);
                break;
            }
            case 9: {
                exibir.imprimirListaDePlanosDeSaude(bancoDeDados);
                break;
            }
            case 10: {
               adm.editarSalario(bancoDeDados,exibir);
                break;
            }
            case 11: {
               exibir.imprimirListaDeSalarios(bancoDeDados);
                break;
            }
            case 0: {
                    Menu.alteraPagina();
                break;
            }
            default:
                System.out.println("\nOpção Inválida");
        }
    }
    
    static void executaMenuGerente(int opcao){
        
        switch(opcao){
            case 1: {
                gerente.cadastrarFuncionario(bancoDeDados, exibir, Usuario.Status.Vendedor);
                break;
            }
            case 2: {
                gerente.demitirFuncionario(bancoDeDados, exibir, Usuario.Status.Vendedor);
                break;
            }
            case 3: {
                gerente.editarDados(bancoDeDados);
                break;
            }
            case 4: {
                exibir.imprimirListaDeVendedores(bancoDeDados);
                break;
            }
            case 5: {
                gerente.cadastrarFuncionario(bancoDeDados, exibir, Usuario.Status.Atendente);
                break;
            }
            case 6: {
                gerente.demitirFuncionario(bancoDeDados, exibir, Usuario.Status.Atendente);
                break;
            }
            case 7: {
                gerente.editarDados(bancoDeDados);
                break;
            }
            case 8: {
                exibir.imprimirListaDeAtendentes(bancoDeDados);
                break;
            }
            case 9: {
                System.out.println("\n--------------");
                break;
            }
            case 10: {
                System.out.println("\n--------------");
                break;
            }
            case 0: {
                Menu.alteraPagina();
                break;
            }
            default:
                System.out.println("\nOpção Inválida");
                break;
                
        }
        
    }
    
    static void executaMenuVendedor(int opcao){
        
        switch(opcao){
            case 1: {
                vendedor.verificarListaDePossiveisClientes(exibir, bancoDeDados);
                break;
            }
            
            case 0: {
               
                    Menu.alteraPagina();
                break;
            }
            
            default:
                System.out.println("\nOpção Inválida");
        }
    }
    
    static void executaMenuAtendente(int opcao){
       
        switch(opcao){
           
            case 1: {
                atendente.cadastrarPossivelCliente(bancoDeDados);
                break;
            }
            case 2: {
                atendente.cadastrarDependente(bancoDeDados);
                break;
            }
            case 0: {
                
                    Menu.alteraPagina();
                break;
            }
            default:
                System.out.println("\nOpção Inválida");
        }
    }
}


