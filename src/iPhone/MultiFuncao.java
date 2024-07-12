package iPhone;

import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;
import funcionalidades.Telefone;

public class MultiFuncao implements ReprodutorMusica, Telefone, NavegadorInternet{
	public void tocar() {
		System.out.println("Tocando música");		
	}

	public void parar() {
		System.out.println("Parou de tocar");
	}

	public void selecionarMusica(String musica) {
		System.out.println("Tocando a música: " + musica);
	}

	public void ligar(String numero) {
		System.out.println("Ligando para: " + numero);
	}

	public void atender() {
		System.out.println("Atender telefone");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz...");	
	}

	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);	
	}

	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
	}

	public void atualizarPagina() {
		System.out.println("Atualizando página (F5)");
	}
}
