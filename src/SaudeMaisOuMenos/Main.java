package SaudeMaisOuMenos;

import java.util.Scanner;

import java.util.Scanner;


public class Main{

    
    public static void main(String[] args) {
      
        
        int opcao = 0;  
        
        Scanner leitor = new Scanner(System.in);
        
        
        do {
            
            opcao = leitor.nextInt();
            

            switch (opcao) {
                case 1:
                    Menu.direcionaUsuarioComBaseNoLogin(opcao);
                    break;
                
                case 0:
                    System.out.print("\nSaindo do Programa...\n\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!");
            }
            if (opcao == 1)
                break;
        } while (opcao != 0);
    }
}
