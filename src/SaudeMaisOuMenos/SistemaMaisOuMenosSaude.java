package SaudeMaisOuMenos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaMaisOuMenosSaude {
    private static List<Gerente> gerentes = new ArrayList<>();
    private static List<Vendedor> vendedores = new ArrayList<>();
    private static List<Atendente> atendentes = new ArrayList<>();
    private static List<Cliente> clientes = new ArrayList<>();
    private static List<PlanoSaude> planosSaude = new ArrayList<>();
    private static List<Especialidade> especialidades = new ArrayList<>();
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarGerente(scanner);
                    break;
                case 2:
                    cadastrarVendedor(scanner);
                    break;
                case 3:
                    cadastrarAtendente(scanner);
                    break;
                case 4:
                    cadastrarCliente(scanner);
                    break;
                case 5:
                    cadastrarDependente(scanner);
                    break;
                case 6:
                    cadastrarPlanoSaude(scanner);
                    break;
                case 7:
                    cadastrarEspecialidade(scanner);
                    break;
                case 8:
                    exibirMenuGerente(scanner);
                    break;
                case 9:
                    exibirMenuVendedor(scanner);
                    break;
                case 10:
                    exibirMenuAtendente(scanner);
                    break;
                case 11:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        }
        scanner.close();
        
        
        
        
        
        
        
        
    
    }

    private static void exibirMenuPrincipal() {
        System.out.println("----- MENU PRINCIPAL -----");
        System.out.println("1. Cadastrar Gerente");
        System.out.println("2. Cadastrar Vendedor");
        System.out.println("3. Cadastrar Atendente");
        System.out.println("4. Cadastrar Cliente");
        System.out.println("5. Cadastrar Dependente");
        System.out.println("6. Cadastrar Plano de Saúde");
        System.out.println("7. Cadastrar Especialidade");
        System.out.println("8. Acesso Gerente");
        System.out.println("9. Acesso Vendedor");
        System.out.println("10. Acesso Atendente");
        System.out.println("11. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void exibirMenuGerente(Scanner scanner) {
        System.out.println("----- MENU GERENTE -----");
        System.out.println("1. Buscar Cliente por CPF");
        System.out.println("2. Atualizar Plano de Saúde de um Cliente");
        System.out.println("3. Excluir Cliente");
        System.out.println("4. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Informe o CPF do cliente: ");
                buscarClientePorCPF(scanner.nextLine());
                break;
            case 2:
                atualizarPlanoSaudeCliente(scanner);
                break;
            case 3:
                excluirCliente(scanner);
                break;
            case 4:
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }

    private static void exibirMenuVendedor(Scanner scanner) {
        System.out.println("----- MENU VENDEDOR -----");
        System.out.println("1. Buscar Cliente por CPF");
        System.out.println("2. Cadastrar Venda");
        System.out.println("3. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                buscarClientePorCPF(scanner.nextLine());
                break;
            case 2:
                cadastrarVenda(scanner);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }

    private static void exibirMenuAtendente(Scanner scanner) {
        System.out.println("----- MENU ATENDENTE -----");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Cadastrar Cancelamento de Plano");
        System.out.println("3. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 

        switch (opcao) {
            case 1:
                cadastrarCliente(scanner);
                break;
            case 2:
                cadastrarCancelamentoPlano(scanner);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida. Por favor, tente novamente.");
        }
    }

    private static void cadastrarGerente(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Gerente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Gerente gerente = new Gerente(nome, cpf, usuario, senha);
        gerentes.add(gerente);
        System.out.println("Gerente cadastrado com sucesso!");
        System.out.println();
    }

    private static void cadastrarVendedor(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Vendedor");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Vendedor vendedor = new Vendedor(nome, cpf, usuario, senha);
        vendedores.add(vendedor);
        System.out.println("Vendedor cadastrado com sucesso!");
        System.out.println();
    }

    private static void cadastrarAtendente(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Atendente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Usuário: ");
        String usuario = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Atendente atendente = new Atendente(nome, cpf, usuario, senha);
        atendentes.add(atendente);
        System.out.println("Atendente cadastrado com sucesso!");
        System.out.println();
    }

    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Cliente");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        System.out.println("Data de nascimento: ");
        String dataDeNascimento = scanner.nextLine();
        scanner.nextLine(); 

        Cliente cliente = new Cliente(nome, cpf, idade, dataDeNascimento);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println();
    }
    
    private static Cliente buscarClientePorCPF(String cpfCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpfCliente)) {
                System.out.println("-------Dados do Cliente-------");
                System.out.println("Nome: "+ cliente.getNome());
                System.out.println("Cpf: "+cliente.getCpf());
                System.out.println("Idade: "+cliente.getIdade());
                if(cliente.possuiDependentes()== false){
                    System.out.println("Cliente não possui dependente!");
                }else{
                System.out.println("Dependente: "+cliente.getDependentes());
                return cliente;
                }
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }

    private static void cadastrarDependente(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Dependente");
        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorCPF(cpfCliente);

        if (cliente != null) {
            System.out.print("Nome do Dependente: ");
            String nomeDependente = scanner.nextLine();
            System.out.print("Idade do Dependente: ");
            int idadeDependente = scanner.nextInt();
            scanner.nextLine(); 

            Dependente dependente = new Dependente(nomeDependente, idadeDependente);
            Cliente.dependentes.add(dependente);
            System.out.println("Dependente cadastrado com sucesso para o cliente " + cliente.nome + "!");
        } else {
            System.out.println("Cliente não encontrado. Cadastre o cliente antes de adicionar um dependente.");
        }

        System.out.println();
    }

    private static void cadastrarPlanoSaude(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Plano de Saúde");
        System.out.print("Nome do Plano: ");
        String nomePlano = scanner.nextLine();
        System.out.print("Percentual de Desconto (%): ");
        double desconto = scanner.nextDouble();
        scanner.nextLine();
                                
        PlanoSaude planoSaude = new PlanoSaude(nomePlano, desconto);
        planosSaude.add(planoSaude);
        System.out.println("Plano de Saúde cadastrado com sucesso!");
        System.out.println();
    }

    private static void cadastrarEspecialidade(Scanner scanner) {
        System.out.println("Opção selecionada: Cadastrar Especialidade");
        System.out.print("Nome da Especialidade: ");
        String nomeEspecialidade = scanner.nextLine();
        System.out.print("Percentual de Desconto para esta Especialidade (%): ");
        double desconto = scanner.nextDouble();
        scanner.nextLine();

        Especialidade especialidade = new Especialidade(nomeEspecialidade, desconto);
        especialidades.add(especialidade);
        System.out.println("Especialidade cadastrada com sucesso!");
        System.out.println();
    }

    private static void atualizarPlanoSaudeCliente(Scanner scanner) {
        Cliente cliente = buscarClientePorCPF(scanner.nextLine());

        if (cliente != null) {
            System.out.print("Nome do Plano de Saúde: ");
            String nomePlano = scanner.nextLine();
            PlanoSaude planoSaude = buscarPlanoSaudePorNome(nomePlano);

            if (planoSaude != null) {
                cliente.setPlanoSaude(planoSaude);
                System.out.println("Plano de Saúde atualizado com sucesso para o cliente " + cliente.nome + "!");
            } else {
                System.out.println("Plano de Saúde não encontrado.");
            }
        }

        System.out.println();
    }

    private static void excluirCliente(Scanner scanner) {
        Cliente cliente = buscarClientePorCPF(scanner.nextLine());


        if (cliente != null) {
            clientes.remove(cliente);
            System.out.println("Cliente excluído com sucesso!");
        }else {
            System.out.println("Não possui clientes cadastrados!");
        }
       System.out.println();
    }
    
    private static void cadastrarVenda(Scanner scanner) {
        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorCPF(cpfCliente);

        if (cliente != null) {
            System.out.print("Nome do Plano de Saúde Vendido: ");
            String nomePlano = scanner.nextLine();
            PlanoSaude planoSaude = buscarPlanoSaudePorNome(nomePlano);

            if (planoSaude != null) {
                Venda vendas = new Venda(cliente, planoSaude);
                Cliente.vendas.add(vendas);
                System.out.println("Venda cadastrada com sucesso para o cliente " + cliente.nome + "!");
            } else {
                System.out.println("Plano de Saúde não encontrado.");
            }
        }

        System.out.println();
    }

    private static void cadastrarCancelamentoPlano(Scanner scanner) {
        System.out.print("CPF do Cliente: ");
        String cpfCliente = scanner.nextLine();
        Cliente cliente = buscarClientePorCPF(cpfCliente);

        if (cliente != null) {
            cliente.cancelarPlanoSaude();
            System.out.println("Plano de Saúde cancelado com sucesso para o cliente " + cliente.nome + "!");
        }

        System.out.println();
    }

    private static PlanoSaude buscarPlanoSaudePorNome(String nomePlano) {
        for (PlanoSaude planoSaude : planosSaude) {
            if (planoSaude.nomePlano.equalsIgnoreCase(nomePlano)) {
                return planoSaude;
            }
        }

        return null;
    }
}
