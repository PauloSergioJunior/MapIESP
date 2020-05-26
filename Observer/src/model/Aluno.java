package model;

import controller.Mural;

public class Aluno implements Observadores {

	private String nome;

	public Aluno(String nome) {
		this.nome = nome;
	}

	@Override
	public void update(Mural m) {
		Mural mural = (Mural) m;
		System.out.println("Atenção "+this.nome+" algo foi postado no mural com a seguinte mensagens: " +mural.getPost());
	}

}
