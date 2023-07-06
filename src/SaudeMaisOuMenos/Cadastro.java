package SaudeMaisOuMenos;


public class Cadastro {
    static void exibeMenuCadastrarPrimeiro(){
        System.out.printf("\n\n-------- MENU INICIA PROJETO -------\n\n");        
        System.out.println("1. Cadastrar Adm");
        System.out.println("0. Sair");
        System.out.println("");  
    }

    static void exibeMenuInicial (){
        System.out.printf("\n\n-------- MENU INICIAL -------\n\n");        
        System.out.println("1. Fazer Login");
        System.out.println("2. Imprimir Lista Geral");
        System.out.println("0. Sair da Página Inicial.");
        System.out.println("");  
    }
    static void exibeMenuAdministrador(){
        System.out.printf("\n\n--------- MENU ADM ----------\n\n");        
        System.out.println("1. Imprimir Dados Pessoais;");
        System.out.println("2. Cadastrar Gerente;");
        System.out.println("3. Demitir Gerente;"); 
        System.out.println("4. Editar Dados do Gerente;"); 
        System.out.println("5. Imprimir Lista de Gerente;");
        System.out.println("6. Cadastrar Plano de Saúde;");
        System.out.println("7. Deletar Plano de Saúde;"); 
        System.out.println("8. Editar Dados do Plano de Saúde;"); 
        System.out.println("9. Imprimir Lista de Plano de Saúde;");
        System.out.println("10. Alterar Salário dos Funcionários;");
        System.out.println("11. Imprimir Lista com Salário Atual dos Funcionários;");
        System.out.println("0. Sair;");
        System.out.println("");  
    }
    
    static void exibeMenuGerente(){
        System.out.printf("\n\n-------- MENU GERENTE ---------\n\n");                
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
    
    static void exibeMenuVendedor(){
        System.out.printf("\n\n--------MENU VENDEDOR ---------\n\n");        
        System.out.println("1. Imprimir Lista De Possiveis Clientes;");
        System.out.println("0. Sair;");
        System.out.println("");  
    }
   
    static void exibeMenuAtendente(){
        System.out.printf("\n\n---------MENU ATENDENTE----------\n\n");        
        System.out.println("1. Cadastrar Possível Cliente;");
        System.out.println("2. Cadastrar Dependente;"); 
        System.out.println("0. Sair.");
        System.out.println("");  
    }
}


