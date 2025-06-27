package com.ProyectoFinal.Upiiz.Repositories;

import com.ProyectoFinal.Upiiz.Models.ModelAuth;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryAuth {
    ModelAuth findByEmail(String email);
    void save(ModelAuth modelAuth);
    void deleteById(Integer id);
    void update(ModelAuth modelAuth);
}
