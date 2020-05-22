package model;

import java.util.ArrayList;

public class Instituicao {

	ArrayList<Individuo> pessoas = new ArrayList<Individuo>();
	
	
	public void addIndividuo(Individuo i) {
			pessoas.add(i);
	}
	
	public ArrayList getMenbros() {
		return pessoas;	
	}
	
	
	
}
