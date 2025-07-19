package com.iphoneChallenge;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	private String modelo;
	
	public Iphone(String modelo) {
		this.modelo = modelo;
	}
	
	// Métodos do ReprodutorMusical
	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}
	
	@Override
	public void pausar() {
		System.out.println("Música pausada.");
	}
	
	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando música: " + musica);
	}
	
	// Métodos do AparelhoTelefonico
	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}
	
	@Override
	public void atender() {
		System.out.println("Atendendo chamada...");
	}
	
	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");
	}
	
	// Métodos do NavegadorInternet
	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}
	
	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba adicionada no navegador.");
	}
	
	@Override
	public void atualizarPagina() {
		System.out.println("Página atualizada.");
	}
	
	// Getter para o modelo
	public String getModelo() {
		return modelo;
	}
}
