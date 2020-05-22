package model;

public class Livro extends Publicacao{
	
	private String ISBN;
	
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public String getTitulo() {
		return this.titulo;
	}

	@Override
	public String getAutor() {
		// TODO Auto-generated method stub
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
		return "Livro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + "]\n";
	}
	
	
	

}
