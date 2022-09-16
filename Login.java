package CadastroJava;

import javax.swing.JOptionPane;

public class Login {

    private String tecnico;
    private String email;
    private String cpf;
    private String senha;

   
    
    public Login(String tecnico, String email, String cpf, String senha){
        this.tecnico = tecnico;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
                
    }
    

    public void login() {
        if (getTecnico().equals("Danilo") && getEmail().equals("Danilo@gmail.com") && getCpf().equals("3r232342") && getSenha().equals("123456789")) {
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
            
        }else if (getTecnico().equals("Thiago") && getEmail().equals("Thiago@gmail.com") && getCpf().equals("17437242834") && getSenha().equals("987654321")) {
            JOptionPane.showMessageDialog(null, "Seja bem vindo mestre Big");
        }else {
            JOptionPane.showMessageDialog(null, "Login inválido");
        }
    }

    
        
    

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
