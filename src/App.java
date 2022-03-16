import java.util.Scanner;
public class App {
    public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Caso seja Proprietario digite: 1.");
        System.out.println("Caso seja funcionario digite: 2.");
        int escolhaUsuario = sc.nextInt();
        sc.close();
        
        boolean validacaoMain = false;
        
        Proprietario proprietario = new Proprietario();

        switch (escolhaUsuario){
            case 1 :
                validacaoMain = proprietario.loginProprietario();
                break;
            case 2:
                //loginFuncionario();
            default:
                System.out.println("Erro: Escolha invalida!");
            }
        if(validacaoMain == true){
            System.out.println("Usuario conectado.");
        }else{
            System.out.println("Usuario incorreto! O programa sera encerrado.");
            System.exit(0);
        }
    }
}
