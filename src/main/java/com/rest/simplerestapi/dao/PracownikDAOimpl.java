package com.rest.simplerestapi.dao;

import com.rest.simplerestapi.Entity.Pracownik;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PracownikDAOimpl implements PracownikDAO{

    private EntityManager entityManager;

    public PracownikDAOimpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Pracownik> findAll(){

        TypedQuery<Pracownik> theQuery = entityManager.createQuery("from Pracownik", Pracownik.class);
        List<Pracownik> pracownicy = theQuery.getResultList();
        return pracownicy;
    }
}
