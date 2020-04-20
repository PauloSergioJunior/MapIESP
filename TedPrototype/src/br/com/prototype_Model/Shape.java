package br.com.prototype_Model;

public abstract class Shape {

	protected String id;
	protected String type;
	
	public Shape () {}

	public abstract String getId();

	public abstract String getType();

	public abstract void setId(String id);

	public abstract void setType(String type);
	
	public abstract Shape clonar();
}
