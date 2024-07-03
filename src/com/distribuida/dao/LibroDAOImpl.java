package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.Libro;

@Repository
public class LibroDAOImpl implements LibroDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
    @Transactional
	@Override
	public List<Libro> findAll() {
		// TODO Auto-generated method stub
    	Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from Libro",Libro.class).getResultList();
		
	}

	@Override
	public Libro findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Libro libro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(Libro libro) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
