package model;

public class Revista extends Publicacao{

	private String artigo;
	
	public String getArtigo() {
		return artigo;
	}

	public void setArtigo(String artigo) {
		this.artigo = artigo;
	}

	@Override
	public String getTitulo() {
		
		return this.titulo;

	}

	@Override
	public String getAutor() {
		return this.autor;
	}

	@Override
	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Revista [artigo=" + artigo + ", titulo=" + titulo + ", autor=" + autor + "]\n";
	}
	
	
	
	

}
