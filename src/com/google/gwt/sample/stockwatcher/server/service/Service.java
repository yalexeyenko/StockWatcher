package com.google.gwt.sample.stockwatcher.server.service;

import java.io.Serializable;
import java.util.List;

public interface Service<T extends BaseEntity> extends Serializable {
	T create(T t);

	T find(Long id);

	List<T> findAll();

	T update(T t);

	void delete(T t);
}
