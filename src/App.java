import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        boolean validacaoMain = false;// variavel que vai receber o valor para verificar a validacao do login
        
        Proprietario proprietario = new Proprietario();//inciando o objeto, proprietario podera verificar e alterar informaçoes dos prudotos
        Funcionario funcionario = new Funcionario();//iniciando o objeto, funcionario apenas poderar verificar as informaçoes dos produtos

        int usuario = 2; // se usuario for 0 o prorietario esta logado, se for 1 o funcionario esta logado    
              
        //pedindo para o usuario se identificar 
        //System.out.println("Caso seja Proprietario digite: 1.");nao necessario pois tem o JOptionPane
        //System.out.println("Caso seja funcionario digite: 2.");
        
        /*usando a funcao JOpitionpane para le as entradas, como ele so le string entao foi utilizado Integer.parseInt para passar o valor da String como inteiro
        para escolhaUsuario*/
        //JOptionPane para escrever a msg e gerar um input para le o valor inserido pelo usuario
        String entrada = JOptionPane.showInputDialog("Caso seja Proprietario digite: 1.\nCaso seja funcionario digite: 2.");
        int escolhaUsuario = Integer.parseInt(entrada);
        
        switch (escolhaUsuario){
            case 1 :
                validacaoMain = proprietario.loginProprietario();//chamando funcao que fara login do proprietario
                usuario = 0;//identificacao para o programa saber depois quem esta utilizando o mesmo e quais funçoes ele podera exercer
                break;
            case 2:
                validacaoMain = funcionario.loginFuncionario();//chamando funcao que fara login do funcionario
                usuario = 1;//identificacao para o programa saber depois quem esta utilizando o mesmo e quais funçoes ele podera exercer
            default:
                System.out.println("Erro: Escolha invalida!");
            }
        
        if(validacaoMain == true){//verificacao do login
            System.out.println("Usuario conectado.");
        }else{
            System.out.println("Usuario incorreto! O programa sera encerrando.");
            System.exit(0);
        }
    }
}
