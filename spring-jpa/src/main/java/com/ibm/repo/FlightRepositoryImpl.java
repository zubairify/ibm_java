package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Flight;

@Repository
public class FlightRepositoryImpl implements FlightRepository {
	@PersistenceContext
	private EntityManager em;
	
	@Transactional(value = TxType.REQUIRED)
	public String save(Flight f) {
		em.persist(f);
		return f.getCode();
	}

	public Flight fetch(String code) {
		return em.find(Flight.class, code);
	}

	public List<Flight> fetchAll() {
//		Query sql = em.createQuery("from Flight");
//		return sql.getResultList();
//		return em.createQuery("from Flight").getResultList();
		
		return em.createNamedQuery("allFlights").getResultList();
	}

	@Transactional
	public boolean remove(String code) {
		Flight f = em.find(Flight.class, code);
		em.remove(f);
		return true;
	}

	@Transactional
	public boolean update(Flight f) {
		em.merge(f);
		return true;
	}

	@Override
	public List<Flight> findByCarrier(String carrier) {
		Query query = em.createNamedQuery("byCarrier");
		query.setParameter("car", carrier);
		return query.getResultList();
	}

}
