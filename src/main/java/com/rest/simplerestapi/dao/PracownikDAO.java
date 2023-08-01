package com.rest.simplerestapi.dao;

import com.rest.simplerestapi.Entity.Pracownik;

import java.util.List;

public interface PracownikDAO {

    List<Pracownik> findAll();
}
