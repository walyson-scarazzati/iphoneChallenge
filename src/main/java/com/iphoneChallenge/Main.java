package com.iphoneChallenge;

public class Main {
	public static void main(String[] args) {
		// Criando uma instância do iPhone
		Iphone meuIphone = new Iphone("iPhone 1 - 2007");
		
		System.out.println("=== iPhone " + meuIphone.getModelo() + " ===\n");
		
		// Testando funcionalidades do Reprodutor Musical
		System.out.println("🎵 REPRODUTOR MUSICAL:");
		meuIphone.selecionarMusica("Hey Jude - The Beatles");
		meuIphone.tocar();
		meuIphone.pausar();
		
		System.out.println();
		
		// Testando funcionalidades do Aparelho Telefônico
		System.out.println("📞 APARELHO TELEFÔNICO:");
		meuIphone.ligar("(11) 99999-9999");
		meuIphone.atender();
		meuIphone.iniciarCorreioVoz();
		
		System.out.println();
		
		// Testando funcionalidades do Navegador Internet
		System.out.println("🌐 NAVEGADOR INTERNET:");
		meuIphone.exibirPagina("https://www.apple.com");
		meuIphone.adicionarNovaAba();
		meuIphone.atualizarPagina();
	}
}
