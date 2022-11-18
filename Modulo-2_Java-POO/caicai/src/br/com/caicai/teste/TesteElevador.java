package br.com.caicai.teste;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		Elevador elevador = new Elevador();  // instanciando
		
		elevador.inicializar("Elevador 1", 20, 30, 0, 5, 2);
		System.out.println(elevador.toString());
		elevador.entrar();
		elevador.entrar();
		elevador.entrar();
		elevador.sair();
		System.out.println();
		System.out.println(elevador.toString());
		System.out.println(elevador.subir(5));
		System.out.println(elevador.descer(3));
		System.out.println(elevador.descer());
		System.out.println();
		System.out.println(elevador.toString());
	}

}
