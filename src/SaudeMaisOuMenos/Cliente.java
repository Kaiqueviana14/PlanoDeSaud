package SaudeMaisOuMenos;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public String nSUS;
    public Dependente d;
    String nome;
    String dataDeNascimento;
    String cpf;
    int idade;
    PlanoSaude PlanoSaude;
    static List<Dependente> dependentes = new ArrayList<>();
    static List<Venda> vendas = new ArrayList<>();

    public Cliente(String nome, String cpf, int idade, String dataDeNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
        this.PlanoSaude = null;
        this.dependentes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static List<Venda> getVendas() {
        return vendas;
    }

    public static void setVendas(List<Venda> vendas) {
        Cliente.vendas = vendas;
    }
    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.PlanoSaude = planoSaude;
    }
     public String getStatusPlanoSaude() {
        if (PlanoSaude != null) {
            return "Ativo";
        } else {
            return "Cancelado";
        }
    }

    public void adicionarDependente(Dependente dependente) {
        dependentes.add(dependente);
    }

    public void removerDependente(Dependente dependente) {
        dependentes.remove(dependente);
    }

    public List<Dependente> getDependentes() {
        return dependentes;
    }

    public boolean possuiDependentes() {
        return !dependentes.isEmpty();
    }

    public void cancelarPlanoSaude() {
        if (PlanoSaude != null) {
            PlanoSaude = null;
            System.out.println("Plano de Saúde cancelado com sucesso!");
        } else {
            System.out.println("O cliente não possui um Plano de Saúde ativo.");
        }
    }

}
