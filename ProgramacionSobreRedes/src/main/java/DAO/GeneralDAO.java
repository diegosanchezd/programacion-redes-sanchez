package DAO;

import java.util.LinkedList;

public interface GeneralDAO<T> {
	

	public int add( T item);

	public int add(LinkedList<T> lista);

	public int delete(T aBorrar) ;


	public int update(T registro) ;


	public LinkedList<T> getAll();

	public T getById(int id);

}
