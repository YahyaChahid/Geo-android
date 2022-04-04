package com.emsi.geo.dao;

import java.util.List;

public interface IDao<T> {
    boolean create (T o);;

    boolean delete (T o);

    List<T> findAll ();
}