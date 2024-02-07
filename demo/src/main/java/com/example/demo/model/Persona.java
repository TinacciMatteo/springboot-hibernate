package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nome;
    private String cognome;
    private String dataDiNascita;


    public Persona() {
    }


    public Persona(long id, String nome, String cognome, String dataDiNascita) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getDataDiNascita() {
        return this.dataDiNascita;
    }

    public void setdataDiNascita(String dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public Persona id(long id) {
        setId(id);
        return this;
    }

    public Persona nome(String nome) {
        setNome(nome);
        return this;
    }

    public Persona cognome(String cognome) {
        setCognome(cognome);
        return this;
    }

    public Persona dataDiNascita(String dataDiNascita) {
        setdataDiNascita(dataDiNascita);
        return this;
    }
    
}
