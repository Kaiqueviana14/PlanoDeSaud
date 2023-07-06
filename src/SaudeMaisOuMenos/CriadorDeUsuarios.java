package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.LocalTime;
import static SaudeMaisOuMenos.Adm.qtdGerentes;
import static SaudeMaisOuMenos.Gerente.qtdAtendentes;
import static SaudeMaisOuMenos.Gerente.qtdVendedores;

public class CriadorDeUsuarios {
    
    public void criandoAdm(BancoDeDados bancoDeDados){
        Adm adm = new Adm("Kaique", "701", "(31) 988779469", "123", "@gmail.com", "Macho", LocalDate.MIN, "Usuario ADM", "123", Usuario.Status.Administrador);
        
        bancoDeDados.getUsuario().add(adm);
       
    }
    public void criandoGerente(BancoDeDados bancoDeDados){
        Gerente gerente1 = new Gerente("Kaique2", "1234567", "Endereco", "Telefone", "@gmail.com", "M", LocalDate.MIN, "Usuario Gerente1", "123", Usuario.Status.Gerente, "Ctps", 7000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(gerente1);
        qtdGerentes++;
        Gerente gerente2 = new Gerente("Kaique3", "1234567", "Endereco", "Telefone", "@gmail.com", "M", LocalDate.MIN, "Usuario Gerente2", "123", Usuario.Status.Gerente, "Ctps", 7000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(gerente2);
        qtdGerentes++;
        Gerente gerente3 = new Gerente("Kaique4", "1234567", "Endereco", "Telefone", "@gmail.com", "M", LocalDate.MIN, "Usuario Gerente3", "123", Usuario.Status.Gerente, "Ctps", 7000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(gerente3);
        qtdGerentes++;
    }
    public void criandoVendedor(BancoDeDados bancoDeDados){
        Vendedor vendedor = new Vendedor(1,2, "Kaique5", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Vendedor1", "123", Usuario.Status.Vendedor, "123", 2000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(vendedor);  
        qtdVendedores++;
        Vendedor vendedor2 = new Vendedor(1,2, "Kaique6", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Vendedor2", "123", Usuario.Status.Vendedor, "123", 2000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(vendedor2); 
        qtdVendedores++;
        Vendedor vendedor3 = new Vendedor(1,2, "Kaique7", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Vendedor3", "123", Usuario.Status.Vendedor, "123", 2000, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(vendedor3);
        qtdVendedores++;
    }
     public void criandoAtendente(BancoDeDados bancoDeDados){
        Atendente atendente1 = new Atendente("Kaique8", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Atendente1", "123", Usuario.Status.Atendente, "123", 1500, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(atendente1); 
        qtdAtendentes++;
        Atendente atendente2 = new Atendente("Kaique9", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Atendente2", "123", Usuario.Status.Atendente, "123", 1500, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(atendente2);
        qtdAtendentes++;
        Atendente atendente3 = new Atendente("Kaique10", "123456789", "Endereco", "(31) 988779469","@gmail.com" , "M", LocalDate.MIN, "Usuario Atendente3", "123", Usuario.Status.Atendente, "123", 1500, LocalDate.EPOCH, LocalTime.MIDNIGHT, LocalTime.MIDNIGHT);
        bancoDeDados.getUsuario().add(atendente3); 
        qtdAtendentes++;
    }
    public void criandoPlano(BancoDeDados bancoDeDados){
        PlanoSaude plano = new PlanoSaude("Plano de saude", "Salva vidas e é barato!", 123,250);
        bancoDeDados.getListaplanosSaudes().add(plano);
    }
    public void criandoCliente(BancoDeDados bancoDeDados){
        Cliente cliente1 = new Cliente("123", "Plano Clinico", Cliente.StatusDoCliente.Ativo, LocalDate.MIN, "14/10/2003", "Kaique11", "123", "endereco", "telefone", "email", "sexo", LocalDate.MIN);
        bancoDeDados.getClientes().add(cliente1);
        Cliente cliente2 = new Cliente("123", "Plano Permanente", Cliente.StatusDoCliente.Inativo, LocalDate.MIN, "14/10/2003", "Kaique12", "123", "endereco", "telefone", "email", "sexo", LocalDate.MIN);
        bancoDeDados.getClientes().add(cliente2);
        Cliente cliente3 = new Cliente("123", "Plano convenio", Cliente.StatusDoCliente.Possivel, LocalDate.MIN, "14/10/2003", "Kaique13", "123", "endereco", "telefone", "email", "sexo", LocalDate.MIN);
        bancoDeDados.getClientes().add(cliente3);
        
    }  
    public void criandoEspecialidade(BancoDeDados bancoDeDados){
        Especialidade especialidade = new Especialidade("Kaique11", "Clinico Geral",250.0 );
        bancoDeDados.getEspecialidades().add(especialidade);
        
    }
   
}
