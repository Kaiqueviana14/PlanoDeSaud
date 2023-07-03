package SaudeMaisOuMenos;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {
    private JTextField usuarioTextField;
    private JPasswordField senhaPasswordField;

    public LoginFrame() {
        super("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());

        JPanel formularioPanel = new JPanel(new GridLayout(2, 2));
        formularioPanel.add(new JLabel("Usuário:"));
        usuarioTextField = new JTextField();
        formularioPanel.add(usuarioTextField);
        formularioPanel.add(new JLabel("Senha:"));
        senhaPasswordField = new JPasswordField();
        formularioPanel.add(senhaPasswordField);

        painel.add(formularioPanel, BorderLayout.CENTER);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                realizarLogin();
            }
        });
        painel.add(loginButton, BorderLayout.SOUTH);

        setContentPane(painel);
        setVisible(true);
    }

    private void realizarLogin() {
        String usuario = usuarioTextField.getText();
        String senha = new String(senhaPasswordField.getPassword());

        // Lógica para autenticar o usuário
        if (autenticarUsuario(usuario, senha)) {
            abrirMenuPrincipal(usuario);
        } else {
            JOptionPane.showMessageDialog(this, "Usuário ou senha inválidos!");
        }
    }

    private boolean autenticarUsuario(String usuario, String senha) {
        
        if (usuario.equals("operador") && senha.equals("senha")) {
            return true;
        }

        return false;
    }

    private void abrirMenuPrincipal(String usuario) {
        
        if (usuario.equals("operador")) {
            SwingUtilities.invokeLater(AtendenteJframe::new);
        }

        
        dispose();
    }
}
