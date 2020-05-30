package model;

public class Arquivo implements Explorador{

	private String nome;
	private int tamanho;

	public Arquivo(String nome, int tamanho) {
		this.nome = nome;
		this.tamanho = tamanho;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Arquivo = " + nome + ", de tamanho=" + tamanho + "KB ; ";
	}


}
