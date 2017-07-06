package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class Connectar {

	public static Connection conector() {
		// String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://localhost:5432/livraria";
		String user = "postgres";
		String senha = "postgres";

		try {
			Class.forName("org.postgresql.Driver");
			Connection conexao = DriverManager.getConnection(url, user, senha);
			return conexao;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Nao foi possivel conetar \n status " + e);
			e.printStackTrace();
			return null;
		}
	}

	public static void fecharConexao() {
		try {
			Connectar.conector().close();
			JOptionPane.showMessageDialog(null, "Conexão encerrada");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Erro ao encerrar conexão");
			e.printStackTrace();
		}
	}
}
