package br.insper.edu.prova.ex2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nome;
	private List<Video> videos;
	
	public Usuario (String nome) {
		this.nome = nome;
		this.videos = new ArrayList<>();
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Video postaVideo(Integer identificador, Produto produto) {
		Video videoNovo = new Video(identificador,this,produto);
		this.videos.add(videoNovo);
		return videoNovo;
	}
	
	public double totalAvaliacoes() {
		double totalAv = 0;
		for (Video video : videos) {
			totalAv += video.mediaAvaliacoes();
		}
		return totalAv;
	}
	
}
