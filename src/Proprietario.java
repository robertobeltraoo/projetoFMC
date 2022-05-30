import java.util.Scanner;
import javax.swing.JOptionPane;
public class Proprietario extends Pessoa implements Validacao {
    
    private String senhaProprietario;

    public Proprietario (String nomePessoa, String cpfPessoa, int idadePessoa, String senhaProprietario){
        super(nomePessoa, cpfPessoa, idadePessoa);
        this.senhaProprietario = senhaProprietario;
    }
    
    public String getSenhaProprietario() {
        return senhaProprietario;
    }
    
    public void setSenhaProprietario(String senhaProprietario) {
        this.senhaProprietario = senhaProprietario;
    }

    @Override
    public boolean login() { // funcao para verificar se o login do proprietario esta correto
        
        String usuario = JOptionPane.showInputDialog("Digite o nome do usuario:");
        //JOptionPane para escrever a msg e gerar um input para le o valor inserido pelo usuario
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario:");
        
        if((nomePessoa.equalsIgnoreCase(usuario)) && (senhaProprietario.equalsIgnoreCase(senha))) { 
            return true;
        }else{
            return false;
        }
    }// verificando se o login esta correto, funcao equalsIgnoreCase para verificar se as variaveis sao iguais ignorando as cases.

}