package view;

import controller.CongressoComposite;
import model.Individuo;
import model.Instituicao;

public class Run {

	
	public static void main(String[] args) {
		
		Individuo i0 = new Individuo("Paulo","00000000000");
		Individuo i1 = new Individuo("Mario","00000000000");
		Individuo i2 = new Individuo("Danilo","00000000000");
		Individuo i3 = new Individuo("Victor","00000000000");
		Individuo i4 = new Individuo("Carlos","00000000000");
		
		System.out.println(i0);
		
		Instituicao inst = new Instituicao();
		inst.addIndividuo(i0);
		inst.addIndividuo(i1);
		inst.addIndividuo(i2);
		inst.addIndividuo(i3);
		inst.addIndividuo(i4);
		
		System.out.println(inst.getMenbros());
		
		CongressoComposite cc = new CongressoComposite();
		
		cc.adicionarP(i0, null);
		cc.adicionarP(i1, null);
		cc.adicionarP(i2, null);
		cc.adicionarP(i3, null);
		cc.adicionarP(i4, null);
		cc.adicionarP(null, inst.getMenbros());
		
		cc.listarParticipantes();
		System.out.println("Numero de assentos!");
		System.out.println(cc.totalAssentos());
		System.out.println("Numero de participantes!");
		System.out.println(cc.totalParticipante());
		

	}

}
