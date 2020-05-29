package view;

import model.AbstracaoTamanho;
import model.CocaCola;
import model.Fanta;
import model.Guarana;
import model.ImplementacaoRefrigerante;
import model.Sprite;
import model.TamanhoFamilia;
import model.TamanhoGrande;
import model.TamanhoMedio;
import model.TamanhoPequeno;

public class DemoBridge {

	public static void main(String[] args) {
		
		ImplementacaoRefrigerante impFanta = new Fanta();
		ImplementacaoRefrigerante impCoca = new CocaCola();
		ImplementacaoRefrigerante impGuarana = new Guarana();
		ImplementacaoRefrigerante impSprite = new Sprite();
		AbstracaoTamanho absPequeno = new TamanhoPequeno(impFanta);
		AbstracaoTamanho absGrande = new TamanhoGrande(impCoca);
		AbstracaoTamanho absMedio = new TamanhoMedio(impGuarana);
		AbstracaoTamanho absFamilia = new TamanhoFamilia(impSprite);
		
		absPequeno.beber();
		absGrande.beber();
		absMedio.beber();
		absFamilia.beber();
		
		System.out.println(impFanta);
		
	}

}
