package com.example.back_end.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back_end.Dao.CategoriaDao;
import com.example.back_end.Entidades.Categoria;



@Service
public class CategoriaServiceImpl implements ICategoriaService{

    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getAll() {
        return categoriaDao.findAll();
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public Categoria getById(Long id) {
        return categoriaDao.findById(id);
    }
      @Override
    public void deleteById(Long id) {
        categoriaDao.deleteById(id);
    }
}