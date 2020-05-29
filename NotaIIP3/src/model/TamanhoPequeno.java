package model;

public class TamanhoPequeno extends AbstracaoTamanho {
	public TamanhoPequeno(ImplementacaoRefrigerante refri) {
		super(refri);
	}

	public void beber() {
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
