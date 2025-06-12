package com.example.back_end.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.back_end.Entidades.Categoria;
import com.example.back_end.Services.ICategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

  
    @GetMapping("/buscar/{id}")
    public Categoria getCategoriabyId(@PathVariable Long id){
    return categoriaService.getById(id);
    }

   @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategoria(@PathVariable Long id) {
        categoriaService.deleteById(id);
    }
    
}
