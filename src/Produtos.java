public class Produtos {
    
		private String nomeProduto;
		private int qntEstoque;
		private double precoProduto;

		public Produtos(String nomeProduto, int qntEstoque, double precoProduto){
			this.nomeProduto = nomeProduto;
			this.qntEstoque = qntEstoque;
			this.precoProduto = precoProduto;
		}
	
		public String getNomeProduto() {
			return nomeProduto;
		}
		public void setNomeProduto(String nomeProduto) {
			this.nomeProduto = nomeProduto;
		}
		
		public double getPrecoProduto() {
			return precoProduto;
		}
		
		public void setPrecoProduto(double precoProduto) {
			this.precoProduto = precoProduto;
		}
		public int getQntEstoque() {
			return qntEstoque;
		}
		
		public void setQntEstoque(int qntEstoque) {
			this.qntEstoque = qntEstoque;
		}  
}