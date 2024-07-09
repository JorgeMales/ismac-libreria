package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;




public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Patron IoC Inversion de Control 
				
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
			CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl",CategoriaDAO.class);
			
			//CRUD : CREATE, READ, UPDATE, DELETE 
			//
			
			//add
			Categoria categoria = new Categoria(0,"Animado","Cuento infantil");
			categoriaDAO.add(categoria);
			
			//up
			Categoria categoria2 = new Categoria(52,"Animado2","Cuento infantil2");
			//CategoriaDAO.up(categoria2);
			
			//del
			//CategoriaDAO.del(40);
			System.out.println("**********************DEL***********************"+categoriaDAO.findOne(1));
			//finAll
			//List<Categoria> Categorias = CategoriaDAO.findAll();
			
			
			categoriaDAO.findAll().forEach(item -> {System.out.println(item.toString());});
			
			context.close();
					

			}

}
