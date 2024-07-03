package com.distribuida.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.distribuida.entities.FacturaDetalle;

@Repository
public class FacturaDetalleDAOImpl implements FacturaDetalleDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
    @Transactional
	@Override
	public List<FacturaDetalle> findAll() {
		// TODO Auto-generated method stub
    	Session session = sessionFactory.getCurrentSession();
		return session.createQuery("from FacturaDetalle",FacturaDetalle.class).getResultList();
		
	}

	@Override
	public FacturaDetalle findOne(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(FacturaDetalle facturadetalle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void up(FacturaDetalle facturadetalle) {
		// TODO Auto-generated method stub

	}

	@Override
	public void del(int id) {
		// TODO Auto-generated method stub

	}

}
