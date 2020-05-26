package view;

import controller.Mural;
import model.Aluno;
import model.Professor;

public class TestObserver {

	public static void main(String[] args) {
		
		Mural mural = new Mural();
		mural.add(new Aluno("Paulo"));
		mural.add(new Professor("Alana"));

		System.out.println("\nAdicionando um post ao mural");	
	    mural.setPost("Fiz o ted de Observer");
	    System.out.println("\nAdicionando mais um post ao mural");	
	    mural.setPost("Alunos o ted do padrão observer ficaram ótimos");
		
	}

}
