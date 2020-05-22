package controller;

import java.util.ArrayList;

import model.Individuo;
import model.Participante;

public class CongressoComposite extends Participante{

	ArrayList<Individuo> p = new ArrayList<Individuo>();
	int numeroAssentos = 100;
	
	
	@Override
	public void adicionarP(Individuo i, ArrayList<Individuo> inst) {
	  if(totalParticipante() < numeroAssentos) {
		if(inst == null) {
			this.p.add(i);
		}else {
			for (Individuo ind : inst) {
				this.p.add(ind);
			}
		}
	  }else {
		  System.out.println("Reunião lotada");
	  }
	}

	@Override
	public void listarParticipantes() {
		
		for (Individuo participante : this.p) {
			System.out.println(participante.getNome());
		}
		
	}

	@Override
	public void removerParticipante(int index) {
		this.p.remove(index);
		
	}

	@Override
	public int totalParticipante() {
		int totalP = 0;
		for (Individuo participante : p) {
			totalP++;
		}
		
		return totalP;
	}

	@Override
	public int totalAssentos() {
		
		return numeroAssentos;
	}
	
}
