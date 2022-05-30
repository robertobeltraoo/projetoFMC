import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Compra {
    //classe responsavel por fazer a compra do cliente, adicionando  itens ao "carrinho" e diminuindo os itens comprados do estoque. Alem de da o valor da compra e 
    //escolher a forma de pagamento
    private Produtos item;
    private int qntCompra;
    private String[] pagamento = {"cartao", "cheque", "dinheiro"};
    private static List<Produtos> carrinho = new ArrayList<Produtos> (); 
    
    public Produtos getItem() {
        return item;
    }
    public void setItem(Produtos item) {
        this.item = item;
    }

    public String[] getPagamento() {
        return pagamento;
    }
    public void setPagamento(String[] pagamento) {
        this.pagamento = pagamento;
    }

    public int getQntCompra() {
        return qntCompra;
    }
    public void setQntCompra(int qntCompra) {
        this.qntCompra = qntCompra;
    }
    
    public void addCarrinho(Produtos item){
        carrinho.add(item);
    }
    public static List<Produtos> getCarrinho(){
        return carrinho;
    }
    
    //funçao para escolher a forma de pagamento dos produtos
    public void pag (String formaPag, double valorTotal){
        boolean verifica = false;
        for(int i = 0; i<3 ; i++){
            if(formaPag.equalsIgnoreCase(pagamento[i]) && (verifica == false)){
                JOptionPane.showMessageDialog(null, "Forma de pagamento aceita.");
                //if para caso o pagamento seja em dinheiro, para informar o valor do troco    
                if(formaPag.equalsIgnoreCase(pagamento[2]) && (verifica == false)){
                    String valorDinheiro = JOptionPane.showInputDialog("Valor dado pelo cliente");
                    //
                    //usar trycatch com java.lang.NumberFormatException para caso a pessoa digite algo diferente de um numero inteiro
                    //
                    double valorDin = Double.parseDouble(valorDinheiro); 
                    double valorTroco = valorDin - valorTotal;
                    JOptionPane.showMessageDialog(null, "Troco: R$"+ valorTroco);
                }
            verifica = true;
            }else if((i == 2) && (verifica == false )){
                JOptionPane.showMessageDialog(null, "Forma de pagamento nao aceita");
            }
        }
    }
}