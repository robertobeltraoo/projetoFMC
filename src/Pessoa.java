import javax.swing.JOptionPane;

public class Pessoa {
    
    //classe criada para ser a generica para os usuarios contendo alguns atributos em comum

    protected String nomePessoa;
    private String cpfPessoa;
    private int idadePessoa;
    
    public Pessoa (String nomePessoa, String cpfPessoa, int idadePessoa) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.idadePessoa = idadePessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }
    public int getIdade() {
        return idadePessoa;
    }
    public void setIdade(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
    public String getCpf() {
        return cpfPessoa;
    }
    public void setCpf(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    //funcao da classe mae q sera sobrescrita nas classes filhas
    /*public boolean login() { // funcao para verificar se o login do proprietario esta correto
        
        String usuario = JOptionPane.showInputDialog("Digite o nome do usuario:");
        //JOptionPane para escrever a msg e gerar um input para le o valor inserido pelo usuario
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario:");
        
        if(nomePessoa.equalsIgnoreCase(usuario)) { 
            return true;
        }else{
            return false;
        }
    }*/
    
}
