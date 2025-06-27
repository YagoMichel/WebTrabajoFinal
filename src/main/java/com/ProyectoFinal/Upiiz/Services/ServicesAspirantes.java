package com.ProyectoFinal.Upiiz.Services;

import com.ProyectoFinal.Upiiz.Models.ModelAspirantes;
import com.ProyectoFinal.Upiiz.Repositories.RepositoryAspirantes;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicesAspirantes implements RepositoryAspirantes {
    @Override
    public List<ModelAspirantes> findAll() {
        return List.of();
    }

    @Override
    public ModelAspirantes findById(Integer id) {
        return null;
    }

    @Override
    public void save(ModelAspirantes modelAspirantes) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void update(ModelAspirantes modelAspirantes) {

    }
}
