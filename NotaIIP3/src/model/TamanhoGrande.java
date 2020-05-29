package model;

public class TamanhoGrande extends AbstracaoTamanho {
	
	public TamanhoGrande(ImplementacaoRefrigerante refri) {
		super(refri);
	}

	public void beber() {
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Toma um gole de " + refrigerante);
		System.out.println("Acabou o(a) " + refrigerante);
		System.out.println();
	}
}
