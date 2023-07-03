package SaudeMaisOuMenos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AtendenteJframe extends JFrame {
    private JTextArea respostaTexto;
    private JTextField entradaTexto;

    private Atendente atendente;
    private BancoDeDados bancoDeDados;

    public AtendenteJframe() {
        super("Atendente");


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

      
        respostaTexto = new JTextArea(10, 40);
        respostaTexto.setEditable(false);
        JScrollPane respostaScrollPane = new JScrollPane(respostaTexto);
        painel.add(respostaScrollPane, BorderLayout.CENTER);

      
        entradaTexto = new JTextField(40);
        painel.add(entradaTexto, BorderLayout.SOUTH);

        
        JButton enviarBotao = new JButton("Enviar");
        enviarBotao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enviarMensagem();
            }
        });
        painel.add(enviarBotao, BorderLayout.EAST);

       
        setContentPane(painel);

       
        setVisible(true);

       
        atendente = new Atendente();
        bancoDeDados = new BancoDeDados();
    }

    private void enviarMensagem() {
        String mensagem = entradaTexto.getText();
        
        if (mensagem.equals("cancelar plano")) {
            atendente.cancelarPlano();
            String resposta = "Plano cancelado!";
            exibirResposta(resposta);
        } else if (mensagem.equals("cadastrar cliente")) {
            atendente.cadastrarPossivelCliente(bancoDeDados);
            String resposta = "Cliente cadastrado com sucesso!";
            exibirResposta(resposta);
        } else if (mensagem.equals("cadastrar dependente")) {
            atendente.cadastrarDependente(bancoDeDados);
            String resposta = "Dependente cadastrado com sucesso!";
            exibirResposta(resposta);
        } else {
            String resposta = "Desculpe, não entendi. Poderia repetir?";
            exibirResposta(resposta);
        }
    }

    private void exibirResposta(String resposta) {
        respostaTexto.setText(resposta);
    }
}
