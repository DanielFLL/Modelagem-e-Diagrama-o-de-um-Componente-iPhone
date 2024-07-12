package iPhone;

import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusica;
import funcionalidades.Telefone;

public class IPhone {
	public static void main(String[] args) {
		MultiFuncao mf = new MultiFuncao();
		
		ReprodutorMusica musica = mf;
		Telefone telefone = mf;
		NavegadorInternet internet = mf;
		
		musica.tocar();
		musica.parar();
		musica.selecionarMusica("Sing in The Rain");
		
		telefone.ligar("99898-2323");
		telefone.atender();
		telefone.iniciarCorreioVoz();
		
		internet.exibirPagina("www.google.com");
		internet.adicionarNovaAba();
		internet.atualizarPagina();
	}
}
