package SaudeMaisOuMenos;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class Menu extends Operador {

    static Scanner ler = new Scanner(System.in);

    static void atalhoParaExibirTodosOsFuncionarios() {
        exibir.imprimirListaGeral(bancoDeDados);
    }

    static void criador() {
        criar.criandoAdm(bancoDeDados);
        criar.criandoAtendente(bancoDeDados);
        criar.criandoGerente(bancoDeDados);
        criar.criandoPlano(bancoDeDados);
        criar.criandoVendedor(bancoDeDados);
        criar.criandoCliente(bancoDeDados);
        criar.criandoEspecialidade(bancoDeDados);

    }

    static void alteraPagina() {
        System.out.println("---------------------------");
        System.out.println("Informe qual página seguir!");
        System.out.println("1.Administrador!");
        System.out.println("2.Gerente!");
        System.out.println("3.Vendedor!");
        System.out.println("4.Atendente!");
        System.out.println("0.Sair!");
        int opcao = ler.nextInt();
        
        switch (opcao) {
            case 0:
                break;
            case 1:
                do {
                    exibeMenuAdministrador();
                    opcao = ler.nextInt();
                    executaMenuAdministrador(opcao);
                } while (opcao != 13);
                break;
            case 2:
                do {

                    exibeMenuGerente();
                    opcao = ler.nextInt();
                    executaMenuGerente(opcao);
                } while (opcao != 11);
                break;
            case 3:
                do {

                    exibeMenuVendedor();
                    opcao = ler.nextInt();
                    executaMenuVendedor(opcao);
                } while (opcao != 4);
                break;
            case 4:
                do {
                    exibeMenuAtendente();
                    opcao = ler.nextInt();
                    executaMenuAtendente(opcao);
                } while (opcao != 4);
                break;
                default:
                System.out.println("Opcao inválida.");
                break;
        }

    }

    static void baseadoLogin(int opcao) {

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
                do {
                    exibeMenuAtendente();
                    opcao = ler.nextInt();
                    executaMenuAtendente(opcao);
                } while (opcao != 4);
                break;
            }
            default:
                System.out.println("Tipo de usuário inválido.");
                break;
        }
    }
}
