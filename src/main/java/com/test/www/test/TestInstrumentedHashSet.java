package com.test.www.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TestInstrumentedHashSet<E> extends HashSet<E> {
	
	//计数器
	private int addCount=0;

	public int getAddCount() {
		return addCount;
	}

	public TestInstrumentedHashSet() {
	}

	@Override
	public boolean add(E e) {
		addCount ++;
		return super.add(e);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		return super.addAll(c);
	}
	
	
	
	
	
}
