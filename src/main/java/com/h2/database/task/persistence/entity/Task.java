package com.h2.database.task.persistence.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String areaTrabajo;
    private boolean disponibilidad;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getAreaTrabajo(){
        return areaTrabajo;
    }

    public void setAreaTrabajo(String areaTrabajo){
        this.areaTrabajo = areaTrabajo;
    }

    public boolean getDisponibilidad(){
        return disponibilidad;
    }

    public void setDisponibilildad(){
        this.disponibilidad = disponibilidad;
    }

}
