package br.insper.edu.prova.ex2;

import java.util.HashMap;
import java.util.Map;

public class Video {
	private Integer identificador;
	private Usuario usuario;
	private Produto produto;

	private Map<Usuario,Integer> avaliacoes;
	
	public Video(Integer identificador,Usuario usuario,Produto produto) {
		this.identificador = identificador;
		this.usuario = usuario;
		this.produto = produto;
		avaliacoes = new HashMap<>();
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public Integer getIdentificador() {
		return identificador;
	}
	
	public Usuario getUsuario() {
		return this.usuario;
	}
	
	public void adicionaAvaliacao(Usuario user, Integer nota) {
		if ((nota<=5)&&(nota>=1)&&(user.getNome()!=usuario.getNome())) {
			this.avaliacoes.put(user, nota);
		}
	}
	
	public int mediaAvaliacoes() {
		double total = 0;
		int size = this.avaliacoes.size();
		for (Integer nota : this.avaliacoes.values()) {
			total += nota;
		}
		total = Math.round(total/size);
		return (int) total;
	}
}
