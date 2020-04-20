package br.com.prototype_Model;

public class Circle extends Shape{

	protected Circle (Circle circle) {
		this.id = circle.getId();
		this.type = circle.getType();
	}
	
	public Circle () {
		id = "1";
		type = "Circulo";
	}
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public void setId(String id) {

		this.id = id;
		
	}

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Shape clonar() {
		
		return new Circle(this);
	}

	@Override
	public String toString() {
		return "Circulo: [ Id: " + getId() + ", Tipo: " + getType() +  " ]";
	}

	

	
	
	

}
