package br.com.livraria.test;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.livraria.dao.AutorDao;
import br.com.livraria.domain.Autor;

public class AutorTest {

	public static void main(String[] args) {
		//AutorTest.salvar();
		//AutorTest.listar();
		//AutorTest.deletar();
		AutorTest.editar();
	}

	private static final Scanner pegaTeclado = new Scanner(System.in);

	public static void salvar() {
		Autor a = new Autor();
		System.out.println("Digite o nome do author");
		a.setNome(pegaTeclado.nextLine());
		System.out.println("Digite o email do author");
		a.setEmail(pegaTeclado.nextLine());
		AutorDao dao = new AutorDao();
		dao.cadastrarAutor(a);
	}
	
	public static void listar(){
		AutorDao dao = new AutorDao();
		dao.listarAutor();
	}
	
	public static void deletar(){
		Autor a = new Autor();
		System.out.println("Digite o codigo do autor que deseja exluir");
		a.setCodigo(pegaTeclado.nextLong());
		AutorDao dao = new AutorDao();
		dao.deletarAutor(a);
	}
	public static void editar(){
		Autor a  = new Autor();
		System.out.println("Digite o nome do autor alterar");
		a.setNome(pegaTeclado.nextLine());
		System.out.println("Digite o email do autor");
		a.setEmail(pegaTeclado.nextLine());
		System.out.println("Digite o codigo do autor");
		a.setCodigo(pegaTeclado.nextLong());
		
		AutorDao autorDao = new AutorDao();
		autorDao.alterarAutor(a);
	}
}
