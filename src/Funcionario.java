import javax.swing.JOptionPane;

public class Funcionario extends Pessoa implements Validacao {
    
    private String senhaFuncionario;
    private double salarioFuncionario;

    public Funcionario(String nomePessoa, String cpfPessoa, int idadePessoa, String senhaFuncionario, double salarioFuncionario){
        super(nomePessoa, cpfPessoa, idadePessoa);
        this.senhaFuncionario = senhaFuncionario;
        this.salarioFuncionario = salarioFuncionario;
    }
    
    public String getSenhaFuncionario() {
        return senhaFuncionario;
    }

    public void setSenhaFuncionario(String senhaFuncionario) {
        this.senhaFuncionario = senhaFuncionario;
    }
    
    @Override
    public boolean login() { //funçao para verificar se o login do funcionario está correto
        
        String usuario = JOptionPane.showInputDialog("Digite o nome do usuario:");
       
        String senha = JOptionPane.showInputDialog("Digite a senha do usuario:");
        
        if(nomePessoa.equalsIgnoreCase(usuario) && senhaFuncionario.equalsIgnoreCase(senha)) {
            return true;
        }else{
            return false;
        }
    }
}