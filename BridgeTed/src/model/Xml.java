package model;

public class Xml implements Impl{
	
	Publicacao publi;
	
	public Xml(Publicacao pb){
		this.publi = pb;
		Buscar(publi);
	}
	
	@Override
	public void Buscar(Publicacao p) {
		
		if(p instanceof Livro) {
			System.out.println("O xml esta buscando o livro");
			p.setTitulo("Livro bridge xml");
			p.setAutor("Autor Bridge xml");
			((Livro) p).setISBN("iSBN setado pelo xml");
			System.out.println("Setado os atributos no obj livro");
			System.out.println(p);
		}else if(p instanceof Revista){
			System.out.println("O xml esta buscando a revista");
			p.setTitulo("Revista bridge xml");
			p.setAutor("Revista Bridge xml");
			((Revista) p).setArtigo("artigo setado pelo xml");
			System.out.println("Setado os atributos no obj revista");
			System.out.println(p);
		}
		
	}

}
