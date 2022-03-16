import java.util.Scanner;

import javax.swing.JOptionPane;
public class Proprietario {
    
    private String nomeProprietario = "fulano";
    private String senhaProprietario = "123";
    
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public String getSenhaProprietario() {
        return senhaProprietario;
    }
    
    public void setSenhaProprietario(String senhaProprietario) {
        this.senhaProprietario = senhaProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public boolean loginProprietario() { // funcao para verificar se o login do proprietario esta correto
        
        String usuario = JOptionPane.showInputDialog("Digite o nome do usuario:");
        //JOptionPane para escrever a msg e gerar um input para le o valor inserido pelo usuario
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario:");
        
        if((nomeProprietario.equalsIgnoreCase(usuario)) && (senhaProprietario.equalsIgnoreCase(senha))) { 
            return true;
        }else{
            return false;
        }
    }// verificando se o login esta correto, funcao equalsIgnoreCase para verificar se as variaveis sao iguais ignorando as cases.

}