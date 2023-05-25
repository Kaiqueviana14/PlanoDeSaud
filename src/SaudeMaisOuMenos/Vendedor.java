package SaudeMaisOuMenos;

public class Vendedor extends Funcionario{
    String nome;
    String senha;
    String usuario;
    String cpf;
    
    public int totalVendasMes;
    private double comissao = 10;
    
    public Vendedor(){
        this.salario = 2000;
    }
    
    public Vendedor(double salario){
        this.salario = salario;
    }

    public Vendedor(String nome, String senha, String usuario, String cpf) {
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
    
    public void recebeBonificacao(){
        this.salario = this.salario * 1.2 + this.comissao;
    }
}
