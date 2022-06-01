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
   
}
