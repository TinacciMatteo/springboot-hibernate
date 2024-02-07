package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @GetMapping("/{id}")
    public Persona leggiUno(@PathVariable("id") long id){
        return personaRepository.findById(id).get();
    }

    @GetMapping("/lista")
    public List<Persona> lista(@RequestParam(name = "nome", required = false) String name){
        if(name != null && name.trim().length() > 0){
            return personaRepository.findByNome(name);
        } else {
            return personaRepository.findAll();
        }
    }

    @PostMapping
    public Persona aggiungi(@RequestBody Persona p){
        return personaRepository.save(p);
        
    }

    @PutMapping("/{id}")
    public Persona aggiorna(@PathVariable long id, @RequestBody Persona p){
        p.setId(id);
        return personaRepository.save(p);
    }


    @DeleteMapping("/{id}")
    public long elimina(@PathVariable ("id") long id){
        personaRepository.deleteById(id);
        return id;
        
    }

    @DeleteMapping("/elimina")
    public void eliminaTutto(){
        personaRepository.deleteAll();
        
    }
}
