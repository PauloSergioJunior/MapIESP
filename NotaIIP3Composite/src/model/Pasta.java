package model;

import java.util.ArrayList;

public class Pasta implements Explorador {

	private String nome;
	ArrayList<Explorador> explorador;

	public Pasta(String nome) {
		this.nome = nome;
		this.explorador = new ArrayList<Explorador>();
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	public void addArquivoPasta(Explorador ex) {

		this.explorador.add(ex);

	}

	public void listarArquivo() {

		System.out.println("\nArquivos da pasta: " + this.nome);
		System.out.println("---------------------------------------");
		for (int i = 0; i < explorador.size(); i++) {

			System.out.println(explorador.get(i).toString());
		}
		System.out.println("---------------------------------------\n");
	}

	public void removerArquivo(int index) {
		this.explorador.remove(index);

	}

	@Override
	public String toString() {
		return "Pasta: " + this.nome + " " + this.explorador;
	}

}
