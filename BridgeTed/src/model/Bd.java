package model;

public class Bd implements Impl {

	Publicacao publi;

	public Bd(Publicacao pb) {
		this.publi = pb;
		Buscar(publi);
	}

	@Override
	public void Buscar(Publicacao p) {

		if (p instanceof Livro) {
			System.out.println("O BD esta buscando o livro");
			p.setTitulo("Livro bridge BD");
			p.setAutor("Autor Bridge BD");
			((Livro) p).setISBN("iSBN setado pelo bd");
			System.out.println("Setado os atributos no obj livro");
			System.out.println(p);
		} else if (p instanceof Revista) {
			System.out.println("O BD esta buscando a revista");
			p.setTitulo("Revista bridge BD");
			p.setAutor("Revista Bridge BD");
			((Revista) p).setArtigo("artigo setado pelo bd");
			System.out.println("Setado os atributos no obj revista");
			System.out.println(p);
		}

	}

}
