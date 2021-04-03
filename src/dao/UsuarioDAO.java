package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import Factory.ConnectionFactory;
import model.Usuario;

public class UsuarioDAO {
	
	public void save(Usuario usuario) {
		String sql = "insert into usuarios(nome, email, telefone, tipo, dataCadastro) values(?, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement ps = null;
		
		 try {
			con = ConnectionFactory.createConnectionToMySQL();
			
			ps = con.prepareStatement(sql);
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getEmail());
			ps.setString(3, usuario.getTelefone());
			ps.setInt(4, usuario.getTipo());
			ps.setDate(5, new Date(usuario.getDataCadastro().getTime()));
			
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				
				if(con != null) {
					con.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
