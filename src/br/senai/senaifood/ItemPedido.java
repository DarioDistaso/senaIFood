package br.senai.senaifood;

public class ItemPedido {

	private Produto produto;
	private int quantidade;
	private String coment�rio;
	
	public ItemPedido() {
		
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getComent�rio() {
		return coment�rio;
	}

	public void setComent�rio(String coment�rio) {
		this.coment�rio = coment�rio;
	}

}
