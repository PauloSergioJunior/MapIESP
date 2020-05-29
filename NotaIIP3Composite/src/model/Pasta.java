package model;

import java.util.ArrayList;

public class Pasta {

	private String nome;

	public Pasta(String nome) {
		this.nome = nome;
	}

	ArrayList arquivos_Subpasta = new ArrayList();

	public void adicionarArquivo(Arquivo a) {

		this.arquivos_Subpasta.add(a);

	}

	public void adicionarPasta(Pasta past) {

		this.arquivos_Subpasta.add(past);

	}

	public void listarArquivo() {

		System.out.println("Arquivos da pasta: "+ this.nome);
		System.out.println("---------------------------------------");
		for (int i = 0; i < arquivos_Subpasta.size(); i++) {

			System.out.println(arquivos_Subpasta.get(i).toString());
		}
		System.out.println("---------------------------------------\n");
	}

	public void removerArquivo(int index) {
		this.arquivos_Subpasta.remove(index);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pasta: "+ this.nome + " " + this.arquivos_Subpasta;
	}

}
