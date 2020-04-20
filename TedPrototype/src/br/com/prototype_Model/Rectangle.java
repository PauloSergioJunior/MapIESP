package br.com.prototype_Model;

public class Rectangle extends Shape{

	protected Rectangle (Rectangle rectangle) {
		this.id = rectangle.getId();
		this.type = rectangle.getType();
	}
	
	public Rectangle () {
		id = "2";
		type = "Retangulo";
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
		// TODO Auto-generated method stub
		return new Rectangle(this);
	}

	@Override
	public String toString() {
		return "Retangulo [ Id: " + getId() + ", Tipo: " + getType() + " ]";
	}
	
	

}
