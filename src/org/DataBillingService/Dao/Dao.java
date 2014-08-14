package org.DataBillingService.Dao;

import java.util.List;

public interface Dao {
	
	public void create (Object o,Class<?> c) throws  Exception ;
	public void update (Object o, Class<?> c) throws  Exception ;
	public void delete (Object o, Class<?> c) throws  Exception ;
	public void findById (Object o, Class<?> c) throws  Exception;
	public List<?> finAll() throws  Exception;
	

}
