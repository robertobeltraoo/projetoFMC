import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funcionario {
    
    private String nomeFuncionario = "beltrano";
    private String senhaFuncionario =  "123";
    
    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public boolean loginFuncionario() { //funçao para verificar se o login do funcionario está correto
        
        String usuario = JOptionPane.showInputDialog("Digite o nome do usuario:");
       
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario:");
        
        if((nomeFuncionario.equalsIgnoreCase(usuario)) && (senhaFuncionario.equalsIgnoreCase(senha))) {
            return true;
        }else{
            return false;
        }
    }
}