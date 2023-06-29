package SaudeMaisOuMenos;

package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public abstract class Pessoa {
    
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String email;
    private String sexo;
    private LocalDate dataDeNascimento;
    private String data;
    
    static Scanner ler = new Scanner(System.in);
    static ferramentas ferramentas = new ferramentas();
    public Pessoa(){
        
    }

    public Pessoa(String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
    }
    
    public void editarDados (BancoDeDados bancoDeDados) {
      
        boolean encontrar = false;
        do {
            
            System.out.print("\nDigite o CPF do usuario: ");
            String Cpf = ler.nextLine();

            for (Usuario usuario : bancoDeDados.getUsuario()) {
                if (usuario.getCpf().equals(Cpf)) {
                    encontrar = true;
                    System.out.println("Usuário encontrado.");
                
                    String resp = "sim";
                
                    String novoNome;
                    String novoCpf;
                    String novoEndereco;
                    String novoTelefone;
                    String novoEmail;
                    String novoSexo;
                    String novoData = "0";
                    LocalDate novoDataDeNascimento;
                
                    System.out.print("Nome: " + usuario.getNome());
                    System.out.print("\nDeseja continuar alterando o nome? (sim/não): ");
                    String resposta = ler.nextLine();
                    if(resposta.equalsIgnoreCase(resp)) {
                        novoNome = usuario.getNome();
                    } else {
                        System.out.print("Novo nome: ");
                        novoNome = ler.nextLine();
                    }
                
                    novoCpf = Cpf;
                
                    System.out.print("Endereço: " + usuario.getEndereco());
                    System.out.print("\nDeseja continuar alterando o endereço? (sim/não): ");
                    String resposta2 = ler.nextLine();
                    if(resposta2.equalsIgnoreCase(resp)) {
                        novoEndereco = usuario.getEndereco();
                    } else {
                        System.out.print("Novo endereço: ");
                        novoEndereco = ler.nextLine();
                    }
                
                    System.out.print("Telefone: " + usuario.getTelefone());
                    System.out.print("\nDeseja continuar alterando o telefone?  (sim/não): ");
                    String resposta3 = ler.nextLine();
                    if(resposta3.equalsIgnoreCase(resp)) {
                        novoTelefone = usuario.getTelefone();
                    } else {
                        System.out.print("Novo telefone: ");
                        novoTelefone = ler.nextLine();
                    }
                
                    System.out.print("Email: " + usuario.getEmail());
                    System.out.print("\nDeseja continuar alterando o email?  (sim/não): ");
                    String resposta4 = ler.nextLine();
                    if(resposta4.equalsIgnoreCase(resp)) {
                        novoEmail = usuario.getEmail();
                    } else {
                        System.out.print("Novo email: ");
                        novoEmail = ler.nextLine();
                    }
                
                    System.out.print("Sexo: " + usuario.getSexo());
                    System.out.print("\nDeseja continuar alterando o sexo? ");
                    String resposta5 = ler.nextLine();
                    if(resposta5.equalsIgnoreCase(resp)) {
                        novoSexo = usuario.getSexo();
                    } else {
                        System.out.print("Novo sexo: ");
                        novoSexo = ler.nextLine();
                    }
                
                    System.out.print("Data de Nascimento: " + usuario.getData());
                    System.out.print("\nDeseja continuar alterando a data de nascimento? (sim/não): ");
                    String resposta6 = ler.nextLine();
                    if(resposta6.equalsIgnoreCase(resp)) {
                        novoData = usuario.getData();
                        novoDataDeNascimento = usuario.getDataDeNascimento();
                    } else {
                       
                        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                        LocalDate dataNascimento = null;
        
                        while (dataNascimento == null) {
                            System.out.print("Digite a data de nascimento (formato DD/MM/AAAA): ");
                            novoData= ler.nextLine();
            
                            try {
                               
                                dataNascimento = LocalDate.parse(novoData, formatoData);
                            } catch (Exception e) {
                                System.out.println("Formato de data inválido. Tente novamente.");
                            }
                        }
                        novoDataDeNascimento = dataNascimento;
                    }
                
                    usuario.setNome(novoNome);
                    usuario.setCpf(novoCpf);
                    usuario.setEndereco(novoEndereco);
                    usuario.setTelefone(novoTelefone);
                    usuario.setEmail(novoEmail);
                    usuario.setSexo(novoSexo);
                    usuario.setData(novoData);
                    usuario.setDataDeNascimento(novoDataDeNascimento);
                
                    System.out.println("\nDados atualizados com sucesso!");
                    break;
                }
            }

            if (encontrar == false) {
                System.out.println("\nCPF não encontrado.Tente novamente.");
            }
        }while (encontrar == false);
        
    }
    
    
    public void mostrarDados () {
        System.out.print("\tNome: " + getNome());
        System.out.print("\tCpf: " + getCpf());
        System.out.print("\tEndereço: " + getEndereco());
        System.out.print("\tTelefone: " + getTelefone());
        System.out.print("\tEmail: " + getEmail());
        System.out.print("\tSexo: " + getSexo());
        System.out.print("\tDataDeNascimento: " + getData());
    }
    public void pegarDados (BancoDeDados bancoDeDados, Usuario.Status status) {
        System.out.print("Digite o nome: ");
        this.nome = ler.nextLine();
        System.out.print("Digite o CPF: ");
        this.cpf = ler.nextLine();
        System.out.print(" Digite o Endereço: ");
        this.endereco = ler.nextLine();
        System.out.print(" Digite o Telefone: ");
        this.telefone = ler.nextLine();
        System.out.print(" Digite o Email: ");
        this.email = ler.nextLine();
        System.out.print(" Digite o Sexo: ");
        this.sexo = ler.nextLine();
        System.out.print(" Digite a data de nascimento\n");
        this.dataDeNascimento = ferramentas.Data();
        this.data = ferramentas.retornaDataString(this.dataDeNascimento);
    }
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public static Scanner getLer() {
        return ler;
    }

    public static void setLer(Scanner ler) {
        Pessoa.ler = ler;
    }
    
    

}

