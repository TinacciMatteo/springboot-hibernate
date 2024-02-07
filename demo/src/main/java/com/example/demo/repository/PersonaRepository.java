package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.example.demo.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona,Long>{
    
    public List<Persona> findByNome(String nome);
}
