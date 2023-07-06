package SaudeMaisOuMenos;

import static SaudeMaisOuMenos.Adm.qtdGerentes;
import static SaudeMaisOuMenos.Gerente.qtdAtendentes;
import static SaudeMaisOuMenos.Gerente.qtdVendedores;
public class Exibicao {
    
    public void imprimirListaGeral (BancoDeDados bancoDeDados) {
         
        int qtd = 1;
        System.out.println("\n----------Exibe Todos os Funcionários----------\n");
       
       
           
            imprimirListaDeAdministrador(bancoDeDados);
            imprimirListaDeAtendentes(bancoDeDados);
            imprimirListaDeGerentes(bancoDeDados);
            imprimirListaDeVendedores(bancoDeDados);
            System.out.println("");
            qtd++;   
            
        
    }
    
    public void imprimirListaDeAdministrador (BancoDeDados bancoDeDados) {
         
        int qtd = 1;
        System.out.println("\n------Exibe Lista de Administrador-------\n");
           
        for (Usuario administrador: bancoDeDados.getUsuario()) {
            if(administrador.getQualprof()==Usuario.Status.Administrador) {
                System.out.print(qtd);
                
                administrador.mostrarDados();
                System.out.println("");
                qtd++;   
            }
        }  
    }
    
    public void imprimirListaDeGerentes (BancoDeDados bancoDeDados) {
        
        if(qtdGerentes == 0) {
            System.out.print("\nNenhum Gerente foi cadastrado até o momento!");
        } else { 
            int qtd = 1;
            System.out.println("\n0--------Exibe Lista de Gerentes--------\n");
           
            for (Usuario gerente: bancoDeDados.getUsuario()) {
                if(gerente.getQualprof()==Usuario.Status.Gerente) {
                    System.out.print(qtd);
                    
                    gerente.mostrarDados();
                    System.out.println("");
                    qtd++;   
                }
            }  
        }
    }

    public void imprimirListaDePlanosDeSaude(BancoDeDados bancoDeDados) {
        if (bancoDeDados.getPlanos().isEmpty()) {
            System.out.print("\nNenhum Plano de Sáude foi cadastrado até o momento!");
        } else {
            int qtd = 1;
            System.out.println("\n-------Exibe Lista de Planos de Saude--------\n");
            for (PlanoSaude planoDeSaude : bancoDeDados.getListaplanosSaudes()) {
                System.out.print(qtd);
                planoDeSaude.mostrarDadosDoPlano();
                System.out.println("");
                qtd++;
            }
        }
    }
    
    public void imprimirListaDeVendedores (BancoDeDados bancoDeDados) {
        
        if(qtdVendedores == 0) {
            System.out.print("\nNenhum Vendedor foi cadastrado até o momento!");
        } else { 
            int qtd = 1;
            System.out.println("\n---------Exibe Lista de Vendedores-------\n");
           
           for (Usuario vendedor: bancoDeDados.getUsuario()) {
                if(vendedor.getQualprof()==Usuario.Status.Vendedor) {
                    System.out.print(qtd);
                   
                    vendedor.mostrarDados();
                    System.out.println("");
                    qtd++;   
                }
            }  
        }
    }
    
    public void imprimirListaDeAtendentes (BancoDeDados bancoDeDados) {
        
        if(qtdAtendentes == 0) {
            System.out.print("\nNenhum Atendente foi cadastrado até o momento!");
        } else { 
            int qtd = 1;
            System.out.println("\n---------Exibe Lista de Atendentes--------\n");
           
            for (Usuario atendente: bancoDeDados.getUsuario()) {
                if(atendente.getQualprof()==Usuario.Status.Atendente) {
                    System.out.print(qtd);
                
                    atendente.mostrarDados();
                    System.out.println("");
                    qtd++;   
                }
            }  
        }
    }
    
    public void imprimirListaDePossiveisClientes (BancoDeDados bancoDeDados) {
        
        if (bancoDeDados.getClientes().isEmpty()) {
            System.out.print("\nNenhum Cliente foi cadastrado até o momento!");
        } else {
            int qtd = 1;
            System.out.println("\n---------Exibe Lista de Clientes--------\n");
           
            for (Cliente cliente: bancoDeDados.getClientes()) {
                if(cliente.getTipoDeCliente()==Cliente.StatusDoCliente.Possivel) {
                    System.out.print(qtd);
                    cliente.mostrarTipoDoCliente();
                    cliente.mostrarDados();
                    System.out.println("");
                    qtd++;
                }
            }
        }    
    }
     
    public void imprimirListaDeDependentes (BancoDeDados bancoDeDados){
        
        if (bancoDeDados.getDependentes().isEmpty()) {
            System.out.print("\nNenhum Dependente foi cadastrado até o momento!");
        } else {
            int qtd = 1;
            System.out.println("\n-------Exibe Lista de Dependentes--------\n");
            for (Dependente dependente : bancoDeDados.getDependentes()) {
                System.out.print(qtd);
                dependente.mostrarDados();
                System.out.println("");
                qtd++;
            }
        }
    }
      
    public void imprimirListaDeEspecialidades (BancoDeDados bancoDeDados) {
        
        if (bancoDeDados.getEspecialidades().isEmpty()) {
            System.out.print("\nNenhuma Especialidade Médica foi cadastrada até o momento!");
        } else {
            int qtd = 1;
            System.out.println("\n--------Exibe Lista de Especialidades Médicas---------\n");
            for (Especialidade especialidade : bancoDeDados.getEspecialidades()) {
                System.out.print(qtd);
                especialidade.mostrarDadosDaEspecialidade();
                System.out.println("");
                qtd++;
            }
        }
    }
    
    public void imprimirListaDeSalarios (BancoDeDados bancoDeDados) {
        
        System.out.println("\n---------Exibe Salário dos Funcionários---------\n");
        System.out.printf("\nGerente: R$%.2f", bancoDeDados.getSalarios().get(0));
        System.out.printf("\nVendedor: R$%.2f", bancoDeDados.getSalarios().get(1));
        System.out.printf("\nAtendente: R$%.2f", bancoDeDados.getSalarios().get(2));
        System.out.println("");
        
    }
}
