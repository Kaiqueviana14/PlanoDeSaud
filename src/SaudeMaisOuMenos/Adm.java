package SaudeMaisOuMenos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Adm extends Funcionario {

    static int qtdGerentes = 0;

    public Adm() {

    }

    public Adm(String nome, String cpf, String endereco, String telefone, String email, String sexo, LocalDate dataDeNascimento, String nomeDeUsuario, String senha, Usuario.Status qualprof, String nCtps, double salario, LocalDate dataDeContratacao, LocalTime horaDeInicioDoExpediente, LocalTime horaDeTerminoDoExpediente) {
        super(nome, cpf, endereco, telefone, email, sexo, dataDeNascimento, nomeDeUsuario, senha, qualprof, nCtps, salario, dataDeContratacao, horaDeInicioDoExpediente, horaDeTerminoDoExpediente);
    }

    public void cadastrarGerente(BancoDeDados bancoDeDados) {

        Gerente nGerente = new Gerente();

        System.out.println("\n------Cadastro de Gerente------\n");
        System.out.println("Total de Gerentes cadastrados até o momento: "
                + qtdGerentes);
        System.out.println("");

        nGerente.pegarDados(bancoDeDados, Status.Gerente);
        bancoDeDados.getUsuario().add(nGerente);
        qtdGerentes++;
        System.out.print("\n------Gerente cadastrado com sucesso!------");

    }

    @Override
    public void demitirFuncionario(BancoDeDados bancoDeDados, Exibicao exibir, Status status) {

        super.demitirFuncionario(bancoDeDados, exibir, status);

        if ((status == Status.Gerente) && (qtdGerentes != 0)) {
            qtdGerentes--;

            ferramentas.verificaLista(bancoDeDados, exibir, status);

            System.out.print("\n------Demitido com sucesso!------");
        }
    }

    public void cadastrarPlanoDeSaude(BancoDeDados bancoDeDados) {

        PlanoSaude novoPlano = new PlanoSaude();

        System.out.println("\n------Cadastro de Plano de Saúde------\n");
        System.out.println("Total de Planos cadastrados até o momento: "
                + bancoDeDados.getListaplanosSaudes().size());
        System.out.println("");

        novoPlano.pegarDadosDoPlano();
        bancoDeDados.getListaplanosSaudes().add(novoPlano);

        System.out.println("\nTotal de Planos após esse cadastro: "
                + bancoDeDados.getListaplanosSaudes().size());
        System.out.print("\n------Plano de Saúde Cadastrado com sucesso!------");
    }

    public void deletarPlano(BancoDeDados bancoDeDados, Exibicao exibir) {

        System.out.println("\n********Deletar Plano De Saúde********\n");

        boolean valido = false;

        int supostoCodigoDoPlano;
        int posicao = -1;

        System.out.print("\nGostaria de verificar a lista de Plano de Saúde antes de prosseguir? ");
        String resposta = ler.nextLine();
        String respostaEsperada = "sim";

        if (resposta.equalsIgnoreCase(respostaEsperada)) {
            exibir.imprimirListaDePlanosDeSaude(bancoDeDados);
        }

        do {

            System.out.print("\nDigite o código do Plano de Saúde que você deseja excluir: ");
            supostoCodigoDoPlano = ler.nextInt();

            for (int i = 0; i < bancoDeDados.getListaplanosSaudes().size(); i++) {
                PlanoSaude planoQueVaiSerExcluido = bancoDeDados.getListaplanosSaudes().get(i);
                if ((planoQueVaiSerExcluido.getCodigoDoPlano() == supostoCodigoDoPlano)) {
                    posicao = i;
                    break;
                }
            }

            if (posicao == -1) {
                System.out.print("\nPlano de Saúde não encontrado em nosso banco de dados. Tente novamente!\n");
            } else {
                valido = true;
            }
        } while (valido == false);

        String nomeDoPlano = bancoDeDados.getListaplanosSaudes().get(posicao).getNomePlano();
        int codigo = bancoDeDados.getListaplanosSaudes().get(posicao).getCodigoDoPlano();

        System.out.println("\nExcluindo Plano de Saúde!\n");

        bancoDeDados.getListaplanosSaudes().remove(posicao);

        System.out.printf("O Plano De Saúde de nome '%s' e código '%d' foi deletado com sucesso!\n", nomeDoPlano, codigo);

        System.out.print("\n-----Operação Finalizada com Sucesso!-----");
    }

    public void editarPlanoDeSaude(BancoDeDados bancoDeDados, Exibicao exibir) {

        boolean encontrado = false;
        String resp = "sim";
        exibir.imprimirListaDePlanosDeSaude(bancoDeDados);

        do {

            System.out.print("\nInforme o código do Plano de Saúde que você deseja modificar: ");
            int Codigo = ler.nextInt();
            ler.nextLine();

            for (PlanoSaude plano : bancoDeDados.getListaplanosSaudes()) {
                if (plano.getCodigoDoPlano() == Codigo) {
                    encontrado = true;
                    System.out.println("\nPlano de Saúde Encontrado.\n");

                    String novoNomePlano;
                    String novaDescricao;
                    double novoValorMensal = 0;
                    int novoCodigo;

                    System.out.print("Nome do Plano: " + plano.getNomePlano());

                    System.out.print("Novo nome: ");
                    novoNomePlano = ler.nextLine();

                    novoCodigo = Codigo;

                    System.out.print("Descrição: " + plano.getDescricao());

                    System.out.print("Nova descrição: ");
                    novaDescricao = ler.nextLine();

                    System.out.print("Valor mensal: " + plano.getValorMensal());

                    boolean entradaValida = false;

                    do {
                        System.out.print("Informe o Valor normal da consulta: ");
                        if (ler.hasNextDouble()) {
                            novoValorMensal = ler.nextDouble();
                            entradaValida = true;
                        } else {
                            System.out.println("Entrada inválida. Digite um número.");
                        }
                        ler.nextLine();
                    } while (!entradaValida);

                    plano.setNomePlano(novoNomePlano);
                    plano.setCodigoDoPlano(novoCodigo);
                    plano.setDescricao(novaDescricao);
                    plano.setValorMensal(novoValorMensal);

                    System.out.println("\nDados atualizados com sucesso!");
                    break;
                }
            }

            if (encontrado == false) {
                System.out.println("\nO código informado não foi encontrado em nosso banco de dados. "
                        + "Por favor, tente novamente.");
            }
        } while (encontrado == false);

        System.out.print("\nGostaria de ver a lista de planos após a modificação?(sim/não): ");
        String resposta = ler.nextLine();

        if (resposta.equalsIgnoreCase(resp)) {
            exibir.imprimirListaDePlanosDeSaude(bancoDeDados);
        }

        System.out.print("\n-----Operação Finalizada com Sucesso!-----");
    }

    //métodos envolvendo salário
    public void editarSalario(BancoDeDados bancoDeDados, Exibicao exibir) {

        System.out.println("\n-------Alterando Salário------\n");

        String resp = "sim";

        System.out.print("\nVerificar os salários anteriores? ");
        String resposta1 = ler.nextLine();

        if (resposta1.equalsIgnoreCase(resp)) {
            exibir.imprimirListaDeSalarios(bancoDeDados);
        }

        System.out.print("\nDeseja alterar os salários?: ");
        String resposta2 = ler.nextLine();
        System.out.println("");

        if (resposta2.equalsIgnoreCase(resp)) {
            for (int i = 0; i < bancoDeDados.getSalarios().size(); i++) {
                System.out.print("Informe o novo salário para ");
                switch (i) {
                    case 0:
                        System.out.print("Gerente: ");
                        break;
                    case 1:
                        System.out.print("Vendedor: ");
                        break;
                    case 2:
                        System.out.print("Atendente: ");
                        break;
                }
                double novoSalario = ler.nextDouble();
                bancoDeDados.getSalarios().set(i, novoSalario);
            }

            System.out.print("\nOs salários foram modificados com sucesso!\n");

            System.out.print("\n-----Operação Finalizada com Sucesso!-----");
        } else {
            System.out.print("Comando inválido!");
        }
    }

    //métodos polimorficos:
    @Override
    public void editarDados(BancoDeDados bancoDeDados) {
        super.editarDados(bancoDeDados);
    }
    @Override
    public void mostrarDados () {
        super.mostrarDados();
        
    }
    @Override
    public void mostrarTipoDeUsuario () {
         System.out.print("\tTipo de Usuário: " + getQualprof());
    }
}
