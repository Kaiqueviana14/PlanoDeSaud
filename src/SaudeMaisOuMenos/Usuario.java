package SaudeMaisOuMenos;

import java.time.LocalDate;

public class Usuario extends Pessoa {

    private String nomeUsuario;
    private String senha;
    private Status qualprof;

    public static enum Status {Administrador, Gerente, Vendedor, Atendente, Null}; 
    

    public Usuario() {

    }

    public Usuario(String nome, String cpf, String endereco, String telefone,
            String email, String sexo, LocalDate dataDeNascimento,
            String nomeDeUsuario, String senha, Status qualprof) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento);
        this.nomeUsuario = nomeDeUsuario;
        this.senha = senha;
        this.qualprof = qualprof;
    }

    @Override
    public void editarDados(BancoDeDados bancoDeDados) {
        super.editarDados(bancoDeDados);
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.print("\tNomeDeUsuário: " + getNomeUsuario());
        System.out.print("\tSenha: " + getSenha());
    }

    @Override
    public void pegarDados(BancoDeDados bancoDeDados, Usuario.Status status) {
        super.pegarDados(bancoDeDados, status);

        if (null != status) {
            switch (status) {
                case Gerente:
                    this.qualprof = Status.Gerente;
                    break;
                case Vendedor:
                    this.qualprof = Status.Vendedor;
                    break;
                case Atendente:
                    this.qualprof = Status.Atendente;
                    break;
                default:
                    break;
            }
        }
    }

    public Status Login(BancoDeDados bancoDeDados) {
        
        Status usuario = null;

        System.out.println("\n------Login------\n");

        while (usuario == null) {
           
            System.out.printf("Informe o nome de usuário: ");
            String NomeUsuarioinfo = ler.nextLine();
            System.out.print("Informe sua senha: ");
            String Senhainfo = ler.nextLine();

            for (Usuario procurarUsuario : bancoDeDados.getUsuario()) {
                if (procurarUsuario.getNomeUsuario().equals(NomeUsuarioinfo) && procurarUsuario.getSenha().equals(Senhainfo)) {
                    usuario = procurarUsuario.getQualprof();
                    break;
                }
            }

            if (usuario == null) {
                System.out.print("\nNome de usuário e/ou senha incorretos. Por favor, tente novamente!\n\n");
            } else {
                System.out.print("\nSeja bem vindo!\n");
            }
        }
        return usuario;
    }

    public void deslogar() {
        this.qualprof = null;
        System.out.println("\nSeção finalizada com sucesso. Volte Sempre!");
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Status getQualprof() {
        return qualprof;
    }

    public void setQualprof(Status qualprof) {
        this.qualprof = qualprof;
    }

    

}
