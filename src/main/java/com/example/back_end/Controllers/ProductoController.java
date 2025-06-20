package com.example.back_end.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

 @GetMapping("/lista")
    public List<Producto> getList(){
        return productoService.getAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Producto create(@RequestBody Producto producto){
        return productoService.save((producto));
    }

    @GetMapping("/{id}")
    public Producto getProductobyId(@PathVariable Long id){
        return productoService.getById(id);
        
    }

// Maneja solicitudes HTTP DELETE para eliminar un producto según su ID
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT) // Devuelve HTTP 204 (sin contenido) si la eliminación es exitosa
public void deleteProducto(@PathVariable Long id) {
    // Llama al servicio para eliminar el producto con el ID proporcionado
    productoService.deleteById(id);
}


    
}