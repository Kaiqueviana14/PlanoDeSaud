package SaudeMaisOuMenos;

/**
 *
 * @author kakap
 */
public class Cadastro {

    static void exibe_menu_Inicial (){
        System.out.printf("\n\n-------- MENU INICIAL -------\n\n");        
        System.out.println("1. Fazer Login");
        System.out.println("2. Imprimir Lista Geral");
        System.out.println("0. Sair da Página Inicial.");
        System.out.println("");  
    }
    
    static void exibe_menu_Administrador(){
        System.out.printf("\n\n--------- MENU PRINCIPAL ----------\n\n");        
        System.out.println("1. Alterar Dados Pessoais;");
        System.out.println("2. Imprimir Dados Pessoais;");
        System.out.println("3. Cadastrar Gerente;");
        System.out.println("4. Demitir Gerente;"); 
        System.out.println("5. Editar Dados do Gerente;"); 
        System.out.println("6. Imprimir Lista de Gerente;");
        System.out.println("7. Cadastrar Plano de Saúde;");
        System.out.println("8. Deletar Plano de Saúde;"); 
        System.out.println("9. Editar Dados do Plano de Saúde;"); 
        System.out.println("10. Imprimir Lista de Plano de Saúde;");
        System.out.println("11. Alterar Salário dos Funcionários;");
        System.out.println("12. Imprimir Lista com Salário Atual dos Funcionários;");
        System.out.println("0.. Sair;");
        System.out.println("");  
    }
    
    static void exibe_menu_Gerente(){
        System.out.printf("\n\n-------- MENU PRINCIPAL ---------\n\n");                
        System.out.println("1. Cadastrar Vendedor;");
        System.out.println("2. Demitir Vendedor;"); 
        System.out.println("3. Editar Dados do Vendedor;"); 
        System.out.println("4. Imprimir Lista de Vendedores;");
        System.out.println("5. Cadastrar Atendente;");
        System.out.println("6. Demitir Atendente;"); 
        System.out.println("7. Editar Dados do Atendente.");
        System.out.println("8. Imprimir Lista de Atendentes;");
        System.out.println("0.. Sair;");
        System.out.println("");  
    }
    
    static void exibe_menu_Vendedor(){
        System.out.printf("\n\n########## MENU PRINCIPAL ##########\n\n");        
        System.out.println("1. Imprimir Lista De Possiveis Clientes;");
        System.out.println("0. Sair;");
        System.out.println("");  
    }
   
    static void exibe_menu_Atendente(){
        System.out.printf("\n\n########## MENU PRINCIPAL ##########\n\n");        
        System.out.println("1. Cadastrar Possível Cliente;");
        System.out.println("2. Cadastrar Dependente;"); 
        System.out.println("0. Sair.");
        System.out.println("");  
    }
}


