package view;

import model.Bd;
import model.Livro;
import model.Publicacao;
import model.Revista;
import model.Xml;

public class BancaRevista {

	public static void main(String[] args) {
		
		Publicacao pL = new Livro();
		Publicacao pR = new Revista();
		
		Bd bdL = new Bd(pL);
		Bd bdR = new Bd(pR);
		
		Xml xmlL = new Xml(pL);
		Xml xmlR = new Xml(pR);
		
	}

}
