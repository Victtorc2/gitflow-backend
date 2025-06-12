package com.example.back_end.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.back_end.Entidades.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
public class CategoriaDao {

    @PersistenceContext
    private EntityManager em;

    @Transactional
    public Categoria save(Categoria categoria) {
        em.persist(categoria);
        return categoria;
    }

    public List<Categoria> findAll() {
        return em.createQuery("SELECT c FROM Categoria c", Categoria.class).getResultList();

    }

        @Transactional
    public void deleteById(Long id) {
        Categoria categoria = em.find(Categoria.class, id);
        if (categoria != null) {
            em.remove(categoria);
        }
    }
}