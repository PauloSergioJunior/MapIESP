package view;

import model.Arquivo;
import model.Pasta;

public class DemoComposite {

	public static void main(String[] args) {

		Pasta p = new Pasta("Aula 1");
		Arquivo arq = new Arquivo("ted.doc",2);
		Arquivo arq2 = new Arquivo("tedComposite.doc",5);
		p.addArquivoPasta(arq);
		p.addArquivoPasta(arq2);
		p.listarArquivo();
		
		Pasta p2 = new Pasta("Aula 2");
		Arquivo arq3 = new Arquivo("tedBridge.doc",10);
		Arquivo arq4 = new Arquivo("tedProxy.doc",15);
		p2.addArquivoPasta(arq3);
		p2.addArquivoPasta(arq4);
		p2.addArquivoPasta(p);
		
		p2.listarArquivo();
		
		
	}

}
