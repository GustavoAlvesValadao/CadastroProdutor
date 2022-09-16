package CadastroJava;

import javax.swing.JOptionPane;

public class CadastroMain {

    public static void main(String[] args) {

        String tecnico = JOptionPane.showInputDialog("digite o nome do técnico ");

        String email = JOptionPane.showInputDialog("digite o email do técnico ");

        String cpf = JOptionPane.showInputDialog("digite o CPF do técnico ");

        String senha = JOptionPane.showInputDialog("digite a senha do técnico ");

        Login produtor = new Login(tecnico, email, cpf, senha);
        produtor.login();
    }
}
