package com.dao;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.sql.Blob;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;



//import javax.persistence.criteria.Expression;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.transform.AliasToEntityMapResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import NonDeletable.NonDeletable;
import com.google.gson.stream.JsonWriter;

@Repository
public class HibernateCrudDAO<T> implements ICrudDAO<T> {
  private static final Logger log = Logger.getLogger(HibernateCrudDAO.class);

  private SessionFactory sessionFactory;
  
  @Autowired
  public void setSessionFactory(SessionFactory sessionFactory) {
    this.sessionFactory = sessionFactory;
  }

	public T persist(T t) {
	  sessionFactory.getCurrentSession().saveOrUpdate(t);
	  return t;
	}

	public T persistList(List<T> t) throws Exception {
		
		try {
			for (Iterator<T> iter=t.iterator(); iter.hasNext();) {
				  sessionFactory.getCurrentSession().saveOrUpdate(iter.next());
			}
		} catch (HibernateException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
	  return null;
	}

	@SuppressWarnings("unchecked")
	public T findById(Class<T> type, Object id) {
	  return (T) sessionFactory.getCurrentSession().createCriteria(type).add(Restrictions.idEq(id)).uniqueResult();
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll(Class<T> type) {
	  
	  Criteria criteria = sessionFactory.getCurrentSession().createCriteria(type);
	  
	  if(NonDeletable.class.isAssignableFrom(type))
		    criteria.add(Restrictions.eq("status", true));
	  
	  return (List<T>) criteria.list();
	}


	public void delete(T t) throws Exception {
	  sessionFactory.getCurrentSession().delete(t);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByName(Class<T> type, String propertyName, Object value) {
		return sessionFactory.getCurrentSession().createCriteria(type).add(Restrictions.eq(propertyName, value)).list();
	}

	
	
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String namedQuery,Map<String, Object> parameters) {
	  Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
	  if(parameters != null){
	  	  for (String key : parameters.keySet()) {
	  		  if(parameters.get(key) instanceof List){
	  			  query.setParameterList(key, (List)parameters.get(key));
	  		  }else{
	  			  query.setParameter(key, parameters.get(key));	  
	  		  }
	  	  }
	  }
	  return query.list();
	}
	public T findObjectByNamedQuery(String namedQuery, Map<String, Object> parameters){
		  Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
		  if(parameters != null){
		  	  for (String key : parameters.keySet()) {
		  		  if(parameters.get(key) instanceof List){
		  			  query.setParameterList(key, (List)parameters.get(key));
		  		  }else{
		  			  query.setParameter(key, parameters.get(key));	  
		  		  }
		  	  }
		  }
		  return (T)query.uniqueResult();
	}

	public List findByNamedQueryTransformer(Class<?> type, String namedQuery, Map<String, Object> parameters){
		  Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
		  if(parameters != null){
		  	  for (String key : parameters.keySet()) {
		  		  if(parameters.get(key) instanceof List){
		  			  query.setParameterList(key, (List)parameters.get(key));
		  		  }else{
		  			  query.setParameter(key, parameters.get(key));	  
		  		  }
		  	  }
		  }
		  
		  query.setResultTransformer(new AliasToBeanResultTransformer(type));		  
		  return query.list();		
	}
	
	public Object findObjectByNamedQueryTransformer(Class<?> type, String namedQuery, Map<String, Object> parameters){
	  Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
	  if(parameters != null){
	  	  for (String key : parameters.keySet()) {
	  		  if(parameters.get(key) instanceof List){
	  			  query.setParameterList(key, (List)parameters.get(key));
	  		  }else{
	  			  query.setParameter(key, parameters.get(key));	  
	  		  }
	  	  }
	  }
	  
	  query.setResultTransformer(new AliasToBeanResultTransformer(type));		  
	  return query.uniqueResult();		
	}

	public int executeUpdateNamedQuery(String namedQuery,Map<String, Object> parameters){
		  Query query = sessionFactory.getCurrentSession().getNamedQuery(namedQuery);
		  if(parameters != null){
		  	  for (String key : parameters.keySet()) {
		  		  if(parameters.get(key) instanceof List){
		  			  query.setParameterList(key, (List)parameters.get(key));
		  		  }else{
		  			  query.setParameter(key, parameters.get(key));	  
		  		  }
		  	  }
		  }
		  
//		  query.setResultTransformer(arg0)
		  
		  return query.executeUpdate();
	}

	
	
	@SuppressWarnings("unchecked")
	public List<Object[]> execQuery(String stQuery) {
		Query query = sessionFactory.getCurrentSession().createSQLQuery(stQuery);
	    return (List<Object[]> )query.list();
	}	
}
