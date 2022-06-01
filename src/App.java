//
//usar trycatch com java.lang.NumberFormatException para caso a pessoa digite algo diferente de um numero inteiro(onde tiver esse comentario)
//

//programa tem a finalidade fazer o login de usuario e efetuar compras em um estabelecimento
import java.io.IOException;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        
        //ImageIcon icone = new ImageIcon("C:\\Users\\rober\\Downloads\\logoFMC.png");
        boolean validacaoMain = false;// variavel que vai receber o valor para verificar a validacao do login
        
        //polimofismo criando um objeto com as classe mae Pessoa, e da interface Validacao
        Validacao proprietario = new Proprietario("Franklin", "222.222.222-22", 23, "123");//inciando o objeto, proprietario podera verificar e alterar informaçoes dos prudotos
        Validacao funcionario = new Funcionario("Maria", "111.111.111-11", 22, "321", 800.20);//iniciando o objeto, funcionario apenas poderar verificar as informaçoes dos produtos
        Pessoa cliente = new Cliente("Mario", "333.333.333-33", 43);

        Produtos carne = new Produtos("carne", 50, 35);

        Produtos cerveja = new Produtos("cerveja", 200, 2.5);

        Produtos refrigerante = new Produtos("refrigerante", 82, 5.3);
        
        int usuario = 2; // se usuario for 0 o prorietario esta logado, se for 1 o funcionario esta logado    
              
        //pedindo para o usuario se identificar 
        //System.out.println("Caso seja Proprietario digite: 1.");nao necessario pois tem o JOptionPane
        //System.out.println("Caso seja funcionario digite: 2.");
        
        /*usando a funcao JOpitionpane para le as entradas, como ele so le string entao foi utilizado Integer.parseInt para passar o valor da String como inteiro
        para escolhaUsuario*/
        //JOptionPane para escrever a msg e gerar um input para le o valor inserido pelo usuario
        
        String entrada;
        int escolhaUsuario = 0;
        //try catch para validacao se na escolha do usuario esta sendo adicionado os valores corretos do menu
        do{   
            try{
                    entrada = JOptionPane.showInputDialog(null,"Caso seja Proprietario digite: 1.\nCaso seja funcionario digite: 2.");    
                    escolhaUsuario = Integer.parseInt(entrada);
                        switch (escolhaUsuario){
                            case 1 :
                                validacaoMain = proprietario.login();//chamando funcao que fara login do proprietario
                                usuario = 0;//identificacao para o programa saber depois quem esta utilizando o mesmo e quais funçoes ele podera exercer
                                break;
                            case 2:
                                validacaoMain = funcionario.login();//chamando funcao que fara login do funcionario
                                usuario = 1;//identificacao para o programa saber depois quem esta utilizando o mesmo e quais funçoes ele podera exercer
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Erro.", "Erro", JOptionPane.ERROR_MESSAGE);
                                break;
                            }
            }catch(java.lang.NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Erro, digite apenas os numeros 1 ou 2", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }while(validacaoMain == false);

        if(validacaoMain == true){//verificacao do login
            //caso o login seja aceito o usuario poderar efetuar compras de clientes
            JOptionPane.showMessageDialog(null,"Usuario conectado.");
            Compra compra = new Compra();
        
                JOptionPane.showMessageDialog(null, "Itens disponiveis:\nCarne estoque: " + carne.getQntEstoque() + ".\nCerveja estoque: " + cerveja.getQntEstoque() + ".\nRefrigerante estoque: " + refrigerante.getQntEstoque()+".");
        
                int contadorCarne = 0;
                double valorCarne = 0;

                int contadorCerveja = 0;
                double valorCerveja = 0;

                int contadorRefrigerante = 0;
                double valorRefrigerante = 0;

                double totalCompra = 0;

                //laço de repeticao para adicionar produtos ao "carrinho" de compra
                boolean continuar = false;  
                while (continuar != true){
                    String entradas = JOptionPane.showInputDialog("Digite o nome do item que deseja comprar:");
                    
                    if(entradas.equalsIgnoreCase("Carne")){
                        String quantidade;
                        int qnt = 0;
                        boolean validacaoCarne = true;
                        //try catch para verificar se na hora de digitar a quantidade, foi digitado algo diferente de um numero inteiro
                        //boolean de validacao para caso o programa entre no catch ele nao entrar nos if else seguinte
                        try{
                            quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                            qnt = Integer.parseInt(quantidade);
                        }catch(java.lang.NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Erro de digitacao!", "Erro", JOptionPane.ERROR_MESSAGE);
                            validacaoCarne = false;
                        }
                        if(qnt <= carne.getQntEstoque() && qnt > 0 && validacaoCarne == true){
                            carne.setQntEstoque(carne.getQntEstoque() - qnt);
                            contadorCarne = contadorCarne + qnt;
                            valorCarne = valorCarne + (carne.getPrecoProduto()*qnt);
                        }else{
                            if(validacaoCarne == true){
                                JOptionPane.showMessageDialog(null, "Quantidade indisponivel.", "Erro", JOptionPane.ERROR_MESSAGE);
                            }    
                        }
                    }else if(entradas.equalsIgnoreCase("Cerveja")){
                        String quantidade;
                        int qnt = 0;
                        boolean validacaoCerveja = true;
                        try{
                        quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                        qnt = Integer.parseInt(quantidade);
                        }catch(java.lang.NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Erro de digitacao!", "Erro", JOptionPane.ERROR_MESSAGE);
                            validacaoCerveja = false;
                        }
                        if(qnt <= cerveja.getQntEstoque() && qnt > 0 && validacaoCerveja == true){
                            cerveja.setQntEstoque(cerveja.getQntEstoque() - qnt);
                            contadorCerveja = contadorCerveja + qnt;
                            valorCerveja = valorCerveja + (cerveja.getPrecoProduto()*qnt);
                        }else{
                            if(validacaoCerveja == true){
                                JOptionPane.showMessageDialog(null, "Quantidade indisponivel.", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }else if(entradas.equalsIgnoreCase("refrigerante")){
                        String quantidade;
                        int qnt = 0;
                        boolean validacaoRefrigerante = true;
                        try{
                            quantidade = JOptionPane.showInputDialog("Digite a quantidade que deseja comprar: ");
                            qnt = Integer.parseInt(quantidade);
                        }catch(java.lang.NumberFormatException e){
                            JOptionPane.showMessageDialog(null, "Erro de digitacao!", "Erro", JOptionPane.ERROR_MESSAGE);
                            validacaoRefrigerante = false;
                        }
                        if(qnt <= refrigerante.getQntEstoque() && qnt > 0 && validacaoRefrigerante == true){
                            refrigerante.setQntEstoque(refrigerante.getQntEstoque() - qnt);
                            contadorRefrigerante = contadorRefrigerante + qnt;
                            valorRefrigerante = valorRefrigerante + (refrigerante.getPrecoProduto()*qnt);
                        }else{
                            if(validacaoRefrigerante == true){
                                JOptionPane.showMessageDialog(null, "Quantidade indisponivel.", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }

                    String perguntaCont = JOptionPane.showInputDialog("Deseja continuar comprando? [s/n]");
                    if(perguntaCont.equalsIgnoreCase("n")){
                        continuar = true;
                    }
                }
                if(contadorCarne > 0){
                    JOptionPane.showMessageDialog(null, carne.getNomeProduto()+":\nQuantidade: " +contadorCarne+"\nR$"+valorCarne);
                }
                if(contadorCerveja > 0){
                    JOptionPane.showMessageDialog(null, cerveja.getNomeProduto()+"\nQuantidade: " +contadorCerveja+"\nR$"+valorCerveja);
                }
                if(contadorRefrigerante > 0){
                    JOptionPane.showMessageDialog(null, refrigerante.getNomeProduto()+"\nQuantidade: " +contadorRefrigerante+"\nR$"+valorRefrigerante);
                }

                totalCompra = valorCarne+valorCerveja+valorRefrigerante;
                if(contadorCarne > 0 || contadorCerveja > 0 || contadorRefrigerante > 0){
                    String formaPagamento = JOptionPane.showInputDialog("Qual a forma de pagamento");        
                    compra.pag(formaPagamento, totalCompra);
                }else{
                    JOptionPane.showMessageDialog(null, "Nenhum produto foi comprado.");
                }
                JOptionPane.showMessageDialog(null, "Itens que sobraram no estoque:\nSabao estoque: " + carne.getQntEstoque() + ".\nEscova estoque: " + cerveja.getQntEstoque() + ".\nRefrigerante estoque: " + refrigerante.getQntEstoque()+".");
                }else{
                    System.out.println("Usuario incorreto! O programa sera encerrando.");
                    System.exit(0);
                }
        
    }
}
