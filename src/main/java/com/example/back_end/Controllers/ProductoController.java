package com.example.back_end.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.back_end.Entidades.Producto;
import com.example.back_end.Services.IProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    @Autowired
    private IProductoService productoService;

 

    @GetMapping("/{id}")
    public Producto getProductobyId(@PathVariable Long id){
        return productoService.getById(id);
        
    }

  @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProducto(@PathVariable Long id) {
        productoService.deleteById(id);
    }


    
}