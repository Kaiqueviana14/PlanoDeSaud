package SaudeMaisOuMenos;

public class Atendente {
    String nome;
    String senha;
    String usuario;
    String cpf;

    public Atendente(String nome, String senha, String usuario, String cpf) {
        this.nome = nome;
        this.senha = senha;
        this.usuario = usuario;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
            
}
