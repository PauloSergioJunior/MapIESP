package model;
public class BancoProxy implements Banco {

	protected String usuario, senha;
	private BancoUsuarios bUsuario;	

	public BancoProxy(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getUsuario() {
		if (temPermissaoDeAcesso()) {
			if(bUsuario == null) {
				bUsuario = new BancoUsuarios(this.usuario,this.senha);
			
			}
			return bUsuario.getUsuario();
		}
		return "usuario incorreto";
	}

	@Override
	public String getSenha() {
		if (temPermissaoDeAcesso()) {
			return bUsuario.getSenha();
		}
		return "senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
