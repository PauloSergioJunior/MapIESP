package br.com.prototypeView;

import br.com.prototype_Controller.ShapeCache;
import br.com.prototype_Model.Shape;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		
		ShapeCache sc = new ShapeCache();
		
		sc.loadCache();
		
		// O parametro passado são: 1 = Circulo; 2 = Retangulo; 3 = Quadrado.
		
		System.out.println(sc.getShape("1"));
		System.out.println(sc.getShape("2"));
		System.out.println(sc.getShape("3"));
		
		Shape s = sc.getShape("1");
		s.setType("Circulo com um ponto dentro");
		System.out.println(s);

	}

}
