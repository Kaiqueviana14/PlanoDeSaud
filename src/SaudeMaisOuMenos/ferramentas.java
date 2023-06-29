package SaudeMaisOuMenos;

import static SaudeMaisOuMenos.Pessoa.ler;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;


public class ferramentas {
    static Scanner ler = new Scanner (System.in);
    
    public double retornaDouble () {
        
        double valor = 0;
        boolean entradaValida = false;
        
        do {
            System.out.print("Valor (em número): ");
            if (ler.hasNextDouble()) {
                valor = ler.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Digite um número!");
            }
            ler.nextLine(); 
        } while (!entradaValida);
        
        return valor;
    }
    
   public LocalTime Hora () {
        
        LocalTime horaLT = null;
        
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        
        while (horaLT == null) {
            System.out.print("Formato (HH:mm): ");
            String horaDeInicioString = ler.nextLine();
    
            try {
                horaLT = LocalTime.parse(horaDeInicioString, formatoHora);
                } catch (Exception e) {
                System.out.println("Formato de hora inválido. Tente novamente.");
             }
        }
        return horaLT;
    }
   public double Double () {
        
        double valor = 0;
        boolean entradaValida = false;
        
        do {
            System.out.print("Valor (em número): ");
            if (ler.hasNextDouble()) {
                valor = ler.nextDouble();
                entradaValida = true;
            } else {
                System.out.println("Entrada inválida. Digite um número!");
            }
            ler.nextLine(); 
        } while (!entradaValida);
        
        return valor;
    }
    public LocalDate Data () {
        
        LocalDate data;
        LocalDate converteData = null;
        
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       
        while (converteData == null) {
            System.out.print("Formato (DD/MM/AAAA): ");
            String dataString = ler.nextLine();
            try {
     
                converteData = LocalDate.parse(dataString, formatoData);
            } catch (Exception e) {
                System.out.println("Formato de data inválido. Tente novamente.");
            }
        }
        data = converteData;
        return data;
    }
    
    public String retornaDataString(LocalDate data) {
      
        DateTimeFormatter formatData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
        String dataS = data.format(formatData);
        return dataS;
    }
    public void verificaLista (BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status) {
        
        System.out.print("\nGostaria de verificar a lista de " + status + " depois da mudança? ");
        String resposta = ler.nextLine();
        String respostaEsperada = "sim";
        
        if(resposta.equalsIgnoreCase(respostaEsperada)) {
            switch (status) {
                case Gerente:
                    exibir.imprimirListaDeGerentes(bancoDeDados);
                        break;
                case Vendedor:
                    exibir.imprimirListaDeVededores(bancoDeDados);
                        break;
                case Atendente:
                    exibir.imprimirListaDeAtendentes(bancoDeDados);
                        break;
                default:
                    break;
            }
        }
    }
    public int retornaPosicao (BancoDeDados bancoDeDados) {
        boolean valido = false; 
        
        String Cpf;
        int posicaoDoUsuario = -1; 
      
        do {
            
            System.out.print("\nInforme o cpf do usuário que você procura: ");
            Cpf = ler.nextLine(); 
            
            for (int i = 0; i<bancoDeDados.getUsuario().size();i++) {
                Usuario procurandoUsuario = bancoDeDados.getUsuario().get(i);
                    if((procurandoUsuario.getCpf().equals(Cpf))){
                        posicaoDoUsuario = i;
                        break;
                    }
            }
            
            if(posicaoDoUsuario == -1){
                System.out.print("Cpf não encontrado em nosso banco de dados. Tente novamente!");
            } else {
                valido = true;
            }
        }while(valido==false);
       return posicaoDoUsuario;
    }
    public void verificaListaAntesDaMudança (BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status) {
        
        System.out.print("\nGostaria de verificar a lista de " + status + " antes da mudança? ");
        String resposta = ler.nextLine();
        String respostaEsperada = "sim";
        
        if(resposta.equalsIgnoreCase(respostaEsperada)) {
            switch (status) {
                case Gerente:
                    exibir.imprimirListaDeGerentes(bancoDeDados);
                        break;
                case Vendedor:
                    exibir.imprimirListaDeVededores(bancoDeDados);
                        break;
                case Atendente:
                    exibir.imprimirListaDeAtendentes(bancoDeDados);
                        break;
                default:
                    break;
            }
        }
    }
}

