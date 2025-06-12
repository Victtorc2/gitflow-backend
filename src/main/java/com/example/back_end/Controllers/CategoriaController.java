package com.example.back_end.Controllers;

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

import com.example.back_end.Entidades.Categoria;
import com.example.back_end.Services.ICategoriaService;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;


    @GetMapping("/lista")
    public List<Categoria> getList(){
        return categoriaService.getAll();
    }

    @PostMapping("/guardar")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Categoria create(@RequestBody Categoria categoria){
        return categoriaService.save((categoria));
    }
  
// Maneja las solicitudes GET para obtener una categoría específica por su ID
@GetMapping("/buscar/{id}")
public Categoria getCategoriabyId(@PathVariable Long id) {
    // Llama al servicio para obtener la categoría con el ID proporcionado
    return categoriaService.getById(id);
}

// Maneja las solicitudes DELETE para eliminar una categoría por su ID
@DeleteMapping("/{id}")
@ResponseStatus(HttpStatus.NO_CONTENT) // Devuelve el código 204 No Content si se elimina correctamente
public void deleteCategoria(@PathVariable Long id) {
    // Llama al servicio para eliminar la categoría con el ID proporcionado
    categoriaService.deleteById(id);
}

    
}
