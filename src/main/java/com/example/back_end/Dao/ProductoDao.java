package com.example.back_end.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.back_end.Entidades.Producto;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class ProductoDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Producto save(Producto producto) {
        em.persist(producto);
        return producto;
    }

    public List<Producto> findAll() {
        return em.createQuery("SELECT c FROM Producto c", Producto.class).getResultList();

    }
     public Producto findById(Long id) {
        return em.find(Producto.class, id);
    }

       @Transactional
    public void deleteById(Long id) {
        Producto producto = em.find(Producto.class, id);
        if (producto != null) {
            em.remove(producto);
        }
    }
    
}