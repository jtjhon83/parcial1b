package com.proyecto.torres.mongo.mongoproyecto.Servicio;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.torres.mongo.mongoproyecto.Modelo.Calificacion;
import com.proyecto.torres.mongo.mongoproyecto.Repositorio.Studerepositorio;

@Service
public class Studenserve {
    @Autowired
    Studerepositorio studerepositorio;

    public Studenserve(){
        
    }

    public Calificacion guardardatos(Calificacion estudiante){ //se llama la clase de calificacion donde estan los atributos 
        return this.studerepositorio.insert(estudiante);//estuden donde guardamos los datos q s van a almacenar 

    }

     //metodo para listar los productos para poderlo mostrar con GetMapping para que nos muestre los datos guardados en la base de datos
    public ArrayList<Calificacion> listarproductos(){
        //los productos que tome los guarde en un array 
        return (ArrayList<Calificacion>) this.studerepositorio.findAll();
    }
    public Optional<Calificacion> buscarpornombre(String estudiante){
        return this.studerepositorio.findByEstudiante(estudiante);
    }


    
}