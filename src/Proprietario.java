import java.util.Scanner;
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

    Scanner leitorLogin = new Scanner(System.in);

    public boolean loginProprietario() {
        System.out.println("Digite o nome do usuario:");
        String usuario = leitorLogin.nextLine();
        System.out.println("Digite a senha do usuario:");
        String senha = leitorLogin.nextLine();
        leitorLogin.close();
        
        if((nomeProprietario == usuario) && (senhaProprietario == senha)) {
            return true;
        }else{
            return false;
        }
    }

}
