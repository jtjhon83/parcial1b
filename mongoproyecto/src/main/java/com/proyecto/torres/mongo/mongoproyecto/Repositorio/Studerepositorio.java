package com.proyecto.torres.mongo.mongoproyecto.Repositorio;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proyecto.torres.mongo.mongoproyecto.Modelo.Calificacion;

public interface Studerepositorio extends MongoRepository<Calificacion,String> {

    Optional<Calificacion> findByEstudiante(String estudiante);//se crea metodo en el repositorio
    //calificacionRepository que busque los datos por estudiante

}
