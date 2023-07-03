package SaudeMaisOuMenos;

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
    
    static void executaMenuAdministrador(int opcao){
        
        switch(opcao){
            case 1: {
                adm.editarDados(bancoDeDados);
                break;
            }
            case 2: {
                exibir.imprimirListaDeAdministrador(bancoDeDados);
                break;
            }
            case 3: {
                adm.cadastrarGerente(bancoDeDados);
                break;
            }
            case 4: {
                adm.demitirFuncionario(bancoDeDados, exibir, Usuario.Status.Gerente);
                break;
            }
            case 5: {
                adm.editarDados(bancoDeDados);
                break;
            }
            case 6: {
                exibir.imprimirListaDeGerentes(bancoDeDados);
                break;
            }
            case 7: {
                adm.cadastrarPlanoDeSaude(bancoDeDados);
                break;
            }
            case 8: {
                adm.deletarPlano(bancoDeDados,exibir);
                break;
            }
            case 9: {
                adm.editarPlanoDeSaude(bancoDeDados, exibir);
                break;
            }
            case 10: {
                exibir.imprimirListaDePlanosDeSaude(bancoDeDados);
                break;
            }
            case 11: {
               adm.editarSalario(bancoDeDados,exibir);
                break;
            }
            case 12: {
               exibir.imprimirListaDeSalarios(bancoDeDados);
                break;
            }
            case 0: {
               usuario.deslogar();
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
                exibir.imprimirListaDeVededores(bancoDeDados);
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
                usuario.deslogar();
                break;
            }
            default:
                System.out.println("\nOpção Inválida");
        }
    }
    
    static void executaMenuVendedor(int opcao){
        
        switch(opcao){
            case 1: {
                vendedor.verificarListaDePossiveisClientes(exibir, bancoDeDados);
                break;
            }
            
            case 0: {
                usuario.deslogar();
                break;
            }
            
            default:
                System.out.println("\nOpção Inválida");
        }
    }
    
    static void executaMenuAtendente(int opcao){
        SwingUtilities.invokeLater(AtendenteJframe::new);
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
                usuario.deslogar();
                break;
            }
            default:
                System.out.println("\nOpção Inválida");
        }
    }
}


