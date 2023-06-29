
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
                    
                    exibe_menu_Administrador();
                    opcao = ler.nextInt();
                    executa_menu_Administrador(opcao);
                } while (opcao != 13);
                break;
            }
            case Gerente: {
                do {
                    
                    exibe_menu_Gerente();
                    opcao = ler.nextInt();
                    executa_menu_Gerente(opcao);
                } while (opcao != 11);
                break;
            }
            case Vendedor: {
                do {
                    
                    exibe_menu_Vendedor();
                    opcao = ler.nextInt();
                    executa_menu_Vendedor(opcao);
                } while (opcao != 4);
                break;
            }
            case Atendente: {
                 do{
                     exibe_menu_Atendente();
                     opcao = ler.nextInt();
                    executa_menu_Atendente(opcao);
                 }while(opcao!=4);
                break;
            }
            default:
                System.out.println("Tipo de usuário inválido.");
                break;
        }
    }
}


