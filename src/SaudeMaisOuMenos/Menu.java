
package SaudeMaisOuMenos;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Menu extends Operador{
 
    static Scanner ler = new Scanner(System.in);

    
    static void atalhoParaExibirTodosOsFuncionarios() {
        exibir.imprimirListaGeral(bancoDeDados);
    }

    static void direcionaUsuarioComBaseNoLogin(int opcao) {

        Usuario.Status retorno = usuario.Login(bancoDeDados);

        switch (retorno) {
            case Administrador: {
                do {
                    
                    exibeMenuAdministrador();
                    opcao = ler.nextInt();
                    executaMenuAdministrador(opcao);
                } while (opcao != 13);
                break;
            }
            case Gerente: {
                do {
                    
                    exibeMenuGerente();
                    opcao = ler.nextInt();
                    executaMenuGerente(opcao);
                } while (opcao != 11);
                break;
            }
            case Vendedor: {
                do {
                    
                    exibeMenuVendedor();
                    opcao = ler.nextInt();
                    executaMenuVendedor(opcao);
                } while (opcao != 4);
                break;
            }
            case Atendente: {
                 do{
                     exibeMenuAtendente();
                     opcao = ler.nextInt();
                    executaMenuAtendente(opcao);
                 }while(opcao!=4);
                break;
            }
            default:
                System.out.println("Tipo de usuário inválido.");
                break;
        }
    }
}


