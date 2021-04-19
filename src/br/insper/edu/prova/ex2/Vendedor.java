package br.insper.edu.prova.ex2;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario{
	private List<Produto> produtos;
	
	public Vendedor(String nome) {
		super(nome);
		produtos = new ArrayList<>();
	}
	
	public void cadastraProduto(String prodNome, double prodPreco) {
		Produto novoProduto = new Produto(prodNome,prodPreco);
		this.produtos.add(novoProduto);
	}

}
