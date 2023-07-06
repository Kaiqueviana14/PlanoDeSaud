package SaudeMaisOuMenos;

import java.util.Scanner;

import java.util.Scanner;


public class Main{

    
    public static void main(String[] args) {
      
        System.out.println("------ Vamos começar------");
        System.out.println("1. Já possui administrador cadastrado!");
        System.out.println("2. Nenhum possui administrador cadastrado!");
        System.out.println("3. Exibir todos os funcionários!");
        System.out.println("0. Sair");
        int opcao = 0;  
        Menu.criador();
        Scanner leitor = new Scanner(System.in);
        do {
            
            opcao = leitor.nextInt();
           

            switch (opcao) {
                case 1:
                    Menu.baseadoLogin(opcao);
                    break;
                case 2:
                    System.out.println("------ Primeiro ADM-------");
                    System.out.println("1. Cadastrar ADM");
                    System.out.println("0. Sair");
                    opcao = leitor.nextInt();
                    Operador.executaMenuCadastrarPrimeiro(opcao);
                    break;
                case 3:
                    Menu.atalhoParaExibirTodosOsFuncionarios();
                    System.out.println("Deseja continuar? ");
                    System.out.println("1. Sim");
                    System.out.println("0. Sair");
                    opcao = leitor.nextInt();
                    if(opcao!=0){
                        System.out.println("------ Vamos começar------");
                        System.out.println("1. Já possui administrador cadastrado!");
                        System.out.println("2. Nenhum possui administrador cadastrado!");
                        System.out.println("3. Exibir todos os funcionários!");
                        System.out.println("0. Sair");
                        opcao = leitor.nextInt();
                        if(opcao == 1){
                        Menu.baseadoLogin(opcao);
                        break;
                        
                    }else{
                        break;
                    }
                    }
                case 0:
                    System.out.print("\nSaindo do Programa\n\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
            if (opcao == 0)
                break;
        } while (opcao != 0);
    }
}
