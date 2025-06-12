package com.example.back_end.Services;

import java.util.List;

import com.example.back_end.Entidades.Producto;

public interface IProductoService {
    public List<Producto> getAll();
    public Producto save(Producto producto);
    public Producto getById(Long id);
    
    
}
