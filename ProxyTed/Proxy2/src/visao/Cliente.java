package visao;
import model.Banco;
import model.BancoProxy;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Usuario teste: ");
		Banco banco = new BancoProxy("Hacker", "1234");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());

		System.out.println("\nAdministrador acessando: ");
		banco = new BancoProxy("admin", "admin");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());
		System.out.println("Autenticacao realizada com sucesso!");
		
		System.out.println("\nUsuario teste: ");
		banco = new BancoProxy("Hacker", "134");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());
		
	}
}
	