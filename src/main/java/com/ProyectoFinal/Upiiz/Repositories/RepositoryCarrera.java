package com.ProyectoFinal.Upiiz.Repositories;

import com.ProyectoFinal.Upiiz.Models.ModelCarrera;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryCarrera {
    List<ModelCarrera> findAll();
    ModelCarrera findById(Integer id);
    void save(ModelCarrera modelCarrera);
    void deleteById(Integer id);
    void update(ModelCarrera modelCarrera);
}
