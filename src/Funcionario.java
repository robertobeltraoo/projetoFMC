import java.util.Scanner;

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
    
    Scanner leitorLogin = new Scanner(System.in);

    public boolean loginFuncionario() { //funçao para verificar se o login do funcionario está correto
        System.out.println("Digite o nome do usuario:");
        String usuario = leitorLogin.nextLine();
        System.out.println("Digite a senha do usuario:");
        String senha = leitorLogin.nextLine();
        leitorLogin.close();
        
        if((nomeFuncionario == usuario) && (senhaFuncionario == senha)) {
            return true;
        }else{
            return false;
        }
    }
}