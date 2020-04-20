package br.com.prototype_Controller;

import java.util.HashMap;
import java.util.Map;
import br.com.prototype_Model.Circle;
import br.com.prototype_Model.Rectangle;
import br.com.prototype_Model.Shape;
import br.com.prototype_Model.Square;

public class ShapeCache {
	
	Circle c = new Circle();
	Rectangle r = new Rectangle();
	Square s = new Square();
	Shape shape;
	Map <String, Shape> sc = new HashMap<>();
	
	public Shape getShape(String tipo) 
	{
		return sc.get(tipo);
	}
	
	public void loadCache()
	{
		sc.put(c.getId(),shape = c.clonar());
		sc.put(r.getId(),shape = r.clonar());
		sc.put(s.getId(),shape = s.clonar());
	}
	
}
