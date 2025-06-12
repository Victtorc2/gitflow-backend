package com.example.back_end.Services;
import java.util.List;
import com.example.back_end.Entidades.Categoria;
import org.springframework.stereotype.Service;

@Service
public interface ICategoriaService {
    public List<Categoria> getAll();
    public Categoria save(Categoria categoria);
    public Categoria getById(Long id);
    void deleteById(Long id);  // <--- nuevo método
}