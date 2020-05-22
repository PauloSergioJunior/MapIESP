package model;

public abstract class Publicacao {
	
	String titulo;
	String autor;
	
	public abstract String getTitulo();

	public abstract String getAutor();

	public abstract void setAutor(String autor);

	public abstract void setTitulo(String titulo);
	
}
