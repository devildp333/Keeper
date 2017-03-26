package com.keeper.dao.hibernate;

import java.io.Serializable;
import java.util.List;

/**
 * Created by AlexVasil on 22.03.2017.
 *
 * Updated by AlexVasil on 26.03.2017.
 *
 */
public interface GenericDao<T, PK extends Serializable> {

    T findById(PK id, boolean lock);

    List<T> findAll();

    T makePersistent(T entity);

    void makeTransient(T entity);
}