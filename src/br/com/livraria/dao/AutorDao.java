package br.com.livraria.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conexao.Connectar;
import br.com.livraria.domain.Autor;

public class AutorDao {
	Connectar connectar = new Connectar();
	private Connection getConexao = Connectar.conector();
	
	public boolean cadastrarAutor(Autor a){
		String sql = "INSERT INTO autor (nome,email) VALUES (?, ?);";
		try {
			PreparedStatement pst = getConexao.prepareStatement(sql);
			pst.setString(1, a.getNome());
			pst.setString(2, a.getEmail());
			pst.execute();
			getConexao.close();
			System.out.println("Registro salvo com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao salvar author\nError:  "+e);
		}
		return true;
	}
	
	public void listarAutor(){
		String sql = "SELECT * FROM autor";
		try {
			PreparedStatement pst = getConexao.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()){
				System.out.println(rs.getString("nome"));
				System.out.println(rs.getString("email"));
				System.out.println("**********************");
			}
			pst.close();
			getConexao.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	public void deletarAutor(Autor a){
		String sql = "DELETE FROM autor WHERE codigo = ?";
		try {
			PreparedStatement pst = getConexao.prepareStatement(sql);
			pst.setLong(1, a.getCodigo());
			pst.execute();
			pst.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void alterarAutor(Autor a){
		String sql = "update autor set nome = ?, email=? where codigo = ?";
		try{
		PreparedStatement pst = getConexao.prepareStatement(sql);
		pst.setString(1, a.getNome());
		pst.setString(2, a.getEmail());
		pst.setLong(3, a.getCodigo());
		pst.execute();
		pst.close();
		getConexao.close();
		}catch(Exception e){
			System.out.println(e);
		}
	
	}
	
}
