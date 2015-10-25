package com.dao;

import java.io.InputStream;
import java.sql.Blob;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;


public interface ICrudDAO<T> {

	public T persist(T t);
	
	public T persistList(List<T> t) throws Exception ;
	
	public T findById(Class<T> type, Object id);
	
	public List<T> findAll(Class<T> type);

	public void delete(T t) throws Exception;
	
	public List<T> findByNamedQuery(String namedQuery, Map<String, Object> parameters);
	
	public int executeUpdateNamedQuery(String namedQuery,Map<String, Object> parameters);
	
	public List<Object[]> execQuery(String stQuery);


}