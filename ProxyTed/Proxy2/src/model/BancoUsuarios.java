package model;

//abstract ou interface
public class BancoUsuarios {
	private String usuario;
	private String senha;

	public BancoUsuarios(String nome, String senha){
		this.usuario = nome;
		this.senha = senha;
	}

	public String getUsuario() {
		return new String("Usuario: " + usuario);
	}

	public String getSenha() {
		return new String("Senha: " + senha);
	}
}
