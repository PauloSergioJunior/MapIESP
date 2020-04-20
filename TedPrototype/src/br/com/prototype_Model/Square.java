package br.com.prototype_Model;

public class Square extends Shape{

	protected Square (Square square) {
		this.id = square.getId();
		this.type = square.getType();
	}
	
	public Square () {
		id = "3";
		type = "Quadrado";
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
		return new Square(this);
	}

	@Override
	public String toString() {
		return "Quadrado [Id: " + getId() + ", Tipo: " + getType() + " ]";
	}
	
	

}
