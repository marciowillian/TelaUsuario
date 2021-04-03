package teste;

import java.util.Date;

import dao.UsuarioDAO;
import model.Usuario;

public class SalvarUsuarioTeste {

	public static void main(String[] args) {
	
		UsuarioDAO usuDAO = new UsuarioDAO();
		
		Usuario usuario = new Usuario();
		
		usuario.setNome("Felipe Wanderson");
		usuario.setEmail("lip.cardoso@hotmail.com");
		usuario.setTelefone("5598988230930");
		usuario.setTipo(1);
		usuario.setDataCadastro(new Date());
		
		usuDAO.save(usuario);

	}

}
