package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Atendente extends Funcionario {

    private double bonificacao;
    private int qtdPlanosCancelados;

    public Atendente() {

    }

    public Atendente(String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento, String nomeDeUsuario, String senha, Status qualprof, String nCtps, double salario, LocalDate dataDeContratacao, LocalTime horaDeInicioDoExpediente, LocalTime horaDeTerminoDoExpediente) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, qualprof, nCtps, salario, dataDeContratacao, horaDeInicioDoExpediente, horaDeTerminoDoExpediente);
    }

    
    public void cancelarPlano() {
        adicionarClienteNaListaDeClientesInativos();
    }

    public void adicionarClienteNaListaDeClientesInativos() {
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public int getQtdPlanosCancelados() {
        return qtdPlanosCancelados;
    }

    public void setQtdPlanosCancelados(int qtdPlanosCancelados) {
        this.qtdPlanosCancelados = qtdPlanosCancelados;
    }

    public void cadastrarPossivelCliente(BancoDeDados bancoDeDados) {

        Cliente cliente = new Cliente();

        System.out.println("\n********Cadastro de Cliente********\n");
        System.out.println("Total de Clientes cadastrados até o momento: "
                + bancoDeDados.getClientes().size());
        System.out.println("");

        cliente.pegarDados(bancoDeDados, Usuario.Status.Null);
        bancoDeDados.getClientes().add(cliente);

        System.out.println("\nTotal de Clientes após esse cadastro: "
                + bancoDeDados.getClientes().size());
        System.out.print("\n-----Cliente cadastrado com sucesso!-----");
    }

    public void cadastrarDependente(BancoDeDados bancoDeDados) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o CPF do responsável: ");
        String cpf = ler.nextLine();
        int posicao = -1;

        for (int i = 0; i < bancoDeDados.getClientes().size(); i++) {
            Cliente cliente = bancoDeDados.getClientes().get(i);
            if (cliente.getCpf().equals(cpf)) {
                posicao = i;
                break;
            }
        }

        if (posicao == -1) {
            System.out.println("CPF não encontrado!!");
        } else {
            System.out.println("\n-------Cadastro de Dependente--------\n");
            System.out.println("Total de Dependentes cadastrados até o momento: "
                    + bancoDeDados.getDependentes().size());
            System.out.println("");

            Dependente d = new Dependente();

            d.setClienteResponsavel(bancoDeDados.getClientes().get(posicao).getNome());
            d.pegarDados(bancoDeDados, Status.Null);

            bancoDeDados.getDependentes().add(d);
            System.out.println("\nTotal de Dependentes após esse cadastro: "
                    + bancoDeDados.getDependentes().size());
            System.out.print("\n-----Dependente cadastrado com sucesso!-----");
        }
    }
    public void mostrarDados () {
        super.mostrarDados();
        
    }
    public void mostrarTipoDeUsuario () {
         System.out.print("\tTipo de Usuário: " + getQualprof());
    }

}
