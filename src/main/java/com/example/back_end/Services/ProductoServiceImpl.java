package com.example.back_end.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back_end.Dao.ProductoDao;
import com.example.back_end.Entidades.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

    @Autowired
    private ProductoDao productoDao;

    @Override
    public List<Producto> getAll() {
        return productoDao.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoDao.save(producto);
    }

    @Override
    public Producto getById(Long id) {
        return productoDao.findById(id);
    }
     @Override
    public void deleteById(Long id) {
        productoDao.deleteById(id);
    }
}
