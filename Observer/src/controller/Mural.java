package controller;

import java.util.ArrayList;
import java.util.List;
import model.Observadores;


public class Mural {

	 private List<Observadores> observadores = new ArrayList<Observadores>();
	   private String post;

	   
	   public String getPost() {
	      return post;
	   }

	   //Setar o que foi postado no mural
	   public void setPost(String postMural) {
	      this.post = postMural;
	      notificarObservadores();
	   }

	   //Adiciona assinantes ao classroom
	   public void add(Observadores obs){
		   observadores.add(obs);		
	   }

	   public void notificarObservadores(){
	      for (Observadores obs : observadores) {
	         obs.update(this);
	      }
	   }
	
}
