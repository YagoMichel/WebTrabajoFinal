package com.ProyectoFinal.Upiiz.Repositories;

import com.ProyectoFinal.Upiiz.Models.ModelAspirantes;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryAspirantes {
    List<ModelAspirantes> findAll();
    ModelAspirantes findById(Integer id);
    void save(ModelAspirantes modelAspirantes);
    void deleteById(Integer id);
    void update(ModelAspirantes modelAspirantes);
}
