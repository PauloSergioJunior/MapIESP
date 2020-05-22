package model;

import java.util.ArrayList;

public abstract class Participante {

	public abstract void adicionarP(Individuo i, ArrayList<Individuo> inst);
	public abstract void listarParticipantes();
	public abstract void removerParticipante(int index);
	public abstract int totalParticipante();
	public abstract int totalAssentos();
	
	
	
}
