package SaudeMaisOuMenos;

import static SaudeMaisOuMenos.Gerente.qtdAtendentes;
import static SaudeMaisOuMenos.Gerente.qtdVendedores;
import static SaudeMaisOuMenos.Pessoa.ferramentas;
import static SaudeMaisOuMenos.Adm.qtdGerentes;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Funcionario extends Usuario {

    private String nCtps;
    private double salario;
    private LocalDate dataDeContratacao;
    private LocalTime horaDeInicioDoExpediente;
    private LocalTime horaDeTerminoDoExpediente;
    private LocalDate dataDeDemissao;
    private String dataDeContratacaoString;

    public Funcionario() {

    }
    public Funcionario (String nome, String cpf, String endereco, String telefone, 
            String email, String sexo, LocalDate dataDeNascimento, 
            String nomeDeUsuario, String senha, Status tipoDeUsuario) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, tipoDeUsuario);
    }

    public Funcionario(String nome, String cpf, String endereco, String telefone,
            String email, String sexo, LocalDate dataDeNascimento,
            String nomeDeUsuario, String senha, Status qualprof,
            String nCtps, double salario, LocalDate dataDeContratacao,
            LocalTime horaDeInicioDoExpediente, LocalTime horaDeTerminoDoExpediente) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, qualprof);
        this.nCtps = nCtps;
        this.salario = salario;
        this.dataDeContratacao = dataDeContratacao;
        this.horaDeInicioDoExpediente = horaDeInicioDoExpediente;
        this.horaDeTerminoDoExpediente = horaDeTerminoDoExpediente;
    }

    @Override
    public void editarDados(BancoDeDados bancoDeDados) {
        super.editarDados(bancoDeDados);
    }

    public void mostrarDados() {
        super.mostrarDados();
        System.out.print("\tNúmeroDaCarteiraDeTrabalho: " + getnCtps());
        System.out.printf("\tSalário: R$%.2f", getSalario());
        System.out.print("\tDataDeContratação: " + getDataDeContratacaoString());
        System.out.print("\tHoraDoInicioDoExpediente : " + getHoraDeInicioDoExpediente());
        System.out.print("\tHoraDoTérminoDoExpediente " + getHoraDeTerminoDoExpediente());

    }

    public void demitirFuncionario(BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status) {

        if ((status == Usuario.Status.Gerente) && (qtdGerentes == 0)) {
            System.out.print("\nNenhum Gerente foi cadastrado até o momento. "
                    + "Sendo assim, não é possível realizar uma demissão. "
                    + "Cadastre um gerente e tente novamente!");
        }
        if ((status == Usuario.Status.Gerente) && (qtdGerentes != 0)) {
            ferramentas.verificaListaAntesDaMudança(bancoDeDados, exibir, status);
            Demissao(bancoDeDados, exibir, status);
        }
        if ((status == Usuario.Status.Vendedor) && (qtdVendedores == 0)) {
            System.out.print("\nNenhum Vendedor foi cadastrado até o momento. "
                    + "Sendo assim, não é possível realizar uma demissão. "
                    + "Cadastre um vendedor e tente novamente!");
        }
        if ((status == Usuario.Status.Vendedor) && (qtdVendedores != 0)) {
            ferramentas.verificaListaAntesDaMudança(bancoDeDados, exibir, status);
            Demissao(bancoDeDados, exibir, status);
        }
        if ((status == Usuario.Status.Atendente) && (qtdAtendentes == 0)) {
            System.out.print("\nNenhum Atendente foi cadastrado até o momento. "
                    + "Sendo assim, não é possível realizar uma demissão. "
                    + "Cadastre um atendente e tente novamente!");
        }
        if ((status == Usuario.Status.Atendente) && (qtdAtendentes != 0)) {
            ferramentas.verificaListaAntesDaMudança(bancoDeDados, exibir, status);
            Demissao(bancoDeDados, exibir, status);
        }
    }

    public void Demissao(BancoDeDados bancoDeDados, Exibicao exibir, Usuario.Status status) {

        switch (status) {
            case Gerente:
                System.out.println("\nDemitir Gerente\n");
                break;
            case Vendedor:
                System.out.println("\nDemitir Vendedor\n");
                break;
            case Atendente:
                System.out.println("\nDemitir Atendente\n");
                break;
            default:
                break;
        }

        int posicao = ferramentas.retornaPosicao(bancoDeDados);

        String nome = bancoDeDados.getUsuario().get(posicao).getNome();
        String cpf = bancoDeDados.getUsuario().get(posicao).getCpf();
        bancoDeDados.getUsuario().remove(posicao);
        System.out.println("\nDemitindo funcionário do tipo " + status + "!\n");
        System.out.printf("O funcionário de nome '%s' e cpf '%s' foi demitido com sucesso!\n", nome, cpf);

    }

    @Override
    public void pegarDados(BancoDeDados bancoDeDados, Usuario.Status status) {
        super.pegarDados(bancoDeDados, status);

        System.out.print("Informe o Número da carteira de trabalho: ");
        this.nCtps = ler.next();

        if (null != status) {
            switch (status) {
                case Gerente:
                    this.salario = bancoDeDados.getSalarios().get(0);
                    break;
                case Vendedor:
                    this.salario = bancoDeDados.getSalarios().get(1);
                    break;
                case Atendente:
                    this.salario = bancoDeDados.getSalarios().get(2);
                    break;
                default:
                    break;
            }
        }

        ler.nextLine();

        System.out.print("Informe a Data de Contratação\n");
        this.dataDeContratacao = ferramentas.Data();
        this.dataDeContratacaoString = ferramentas.retornaDataString(this.dataDeContratacao);

        System.out.print("Informe a Hora de Inicio do Expediente\n");
        this.horaDeInicioDoExpediente = ferramentas.Hora();
        System.out.print("Informe a Hora do Término do Expediente\n");
        this.horaDeTerminoDoExpediente = ferramentas.Hora();
    }

    public String getnCtps() {
        return nCtps;
    }

    public void setnCtps(String nCtps) {
        this.nCtps = nCtps;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public LocalDate getDataDeContratacao() {
        return dataDeContratacao;
    }

    public void setDataDeContratacao(LocalDate dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public LocalTime getHoraDeInicioDoExpediente() {
        return horaDeInicioDoExpediente;
    }

    public void setHoraDeInicioDoExpediente(LocalTime horaDeInicioDoExpediente) {
        this.horaDeInicioDoExpediente = horaDeInicioDoExpediente;
    }

    public LocalTime getHoraDeTerminoDoExpediente() {
        return horaDeTerminoDoExpediente;
    }

    public void setHoraDeTerminoDoExpediente(LocalTime horaDeTerminoDoExpediente) {
        this.horaDeTerminoDoExpediente = horaDeTerminoDoExpediente;
    }

    public LocalDate getDataDeDemissao() {
        return dataDeDemissao;
    }

    public void setDataDeDemissao(LocalDate dataDeDemissao) {
        this.dataDeDemissao = dataDeDemissao;
    }

    public String getDataDeContratacaoString() {
        return dataDeContratacaoString;
    }

    public void setDataDeContratacaoString(String dataDeContratacaoString) {
        this.dataDeContratacaoString = dataDeContratacaoString;
    }

    public static void setLer(Scanner ler) {
        Pessoa.ler = ler;
    }
    
    public void mostrarTipoDeUsuario () {
         System.out.print("\tTipo de Usuário: " + getQualprof());
    }
    

}
