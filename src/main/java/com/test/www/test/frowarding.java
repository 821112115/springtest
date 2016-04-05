package com.test.www.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class frowarding<E> implements Set<E> {

	private final Set<E> s; 
	
	public frowarding(Set<E> s) {
		this.s=s;
	}

	public int size() {
		// TODO Auto-generated method stub
		return s.size();
	}

	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return s.isEmpty();
	}

	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return s.contains(o);
	}

	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return s.iterator();
	}

	public Object[] toArray() {
		// TODO Auto-generated method stub
		return s.toArray();
	}

	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return s.toArray(a);
	}

	public boolean add(E e) {
		// TODO Auto-generated method stub
		return s.add(e);
	}

	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return s.remove(o);
	}

	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return s.containsAll(c);
	}

	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return s.addAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return s.retainAll(c);
	}

	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return s.removeAll(c);
	}

	public void clear() {
		s.clear();
	}

	@Override
	public String toString() {
		return s.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return s.equals(obj);
	}
	
	
	
}
