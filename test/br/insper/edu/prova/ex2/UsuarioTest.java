package br.insper.edu.prova.ex2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class UsuarioTest {
	
	private static double tolerancia = 0.01; 

	private Video video;
	private Usuario usuario;
	private Vendedor vendedor;
	private Produto produto;
	
	@BeforeEach
	public void setUp() {
		vendedor = new Vendedor("Jonas");
		produto = new Produto("Cadeira Luxury",750.95);
		vendedor.cadastraProduto(produto.getNome(),produto.getPreco());
		usuario = new Usuario("Marcos");
	}

	@Test
	public void nenhumaValida() {
		video = new Video(1,usuario,produto);
		video.adicionaAvaliacao(usuario, 0);
		video.adicionaAvaliacao(usuario, 10);
		
		assertEquals(0,usuario.totalAvaliacoes(),tolerancia);
	}
	
	@Test
	public void umaValida() {
		video = new Video(1,usuario,produto);
		video.adicionaAvaliacao(usuario, 3);
		
		assertEquals(3,usuario.totalAvaliacoes(),tolerancia);
	}
	
	@Test
	public void duasValidas() {
		video = new Video(1,usuario,produto);
		video.adicionaAvaliacao(usuario, 4);
		video.adicionaAvaliacao(usuario, 5);
		
		assertEquals(5,usuario.totalAvaliacoes(),tolerancia);
	}
	
	@Test
	public void tresValidas() {
		video = new Video(1,usuario,produto);
		video.adicionaAvaliacao(usuario, 1);
		video.adicionaAvaliacao(usuario, 1);
		video.adicionaAvaliacao(usuario, 5);
		
		
		assertEquals(2,usuario.totalAvaliacoes(),tolerancia);
	}
	
	@Test
	public void DoisVideosUmValidaDuasValidas() {
		Produto produto2 = new Produto("Cadeira Gamer",1050.70);
		vendedor.cadastraProduto(produto2.getNome(),produto2.getPreco());
		
		video = new Video(1,usuario,produto);
		video.adicionaAvaliacao(usuario, 3);
		video.adicionaAvaliacao(usuario, 5);
		
		Video video2 = new Video(2,usuario,produto2);
		video2.adicionaAvaliacao(usuario, 4);
		
		assertEquals(4,usuario.totalAvaliacoes(),tolerancia);
	}

}
